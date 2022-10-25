package it.csi.stacore.stacoresrv.integration.dao.oracle;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Provincia;
import it.csi.stacore.stacoresrv.integration.dao.AbstractDAO;
import it.csi.stacore.stacoresrv.integration.dao.TavoleTrasversaliDAO;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectComune;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectComuneByCodiceIstat;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectComuneById;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectNazione;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectNazioneById;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali.SelectProvince;
import it.csi.stacore.stacoresrv.integration.exception.ResourceAccessException;
import it.csi.stacore.stacoresrv.util.Tracer;


//import it.csi.stacore.staon.integration.oracle.query.select.messaggi.SelectMessaggi;
//import it.csi.stacore.staon.integration.oracle.query.select.messaggi.SelectMessaggiById;


@Repository("oracleTavoleTrasversaliDAO")
public class OracleTavoleTrasversaliDAO extends AbstractDAO implements TavoleTrasversaliDAO {
	
	/*
	public Regione findRegioneByDescrizione(Connection connection, String descrizione) throws ResourceAccessException {
		try {
			SelectRegioneByDescrizioneTau select = new SelectRegioneByDescrizioneTau(descrizione);
			return (Regione)select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findRegioneByDescrizione", e);
		}
	}
	
	public List findComune(Connection connection, String comune, String codIstatRegione, Date dataRiferimento) throws ResourceAccessException {
		try {
			SelectComune select = new SelectComune(comune, codIstatRegione, dataRiferimento);
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComune", e);
		}
	}

	public List findAttivita(Connection connection, String attivita) throws ResourceAccessException {
		try {
			SelectAttivita select = new SelectAttivita(attivita);
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findAttivita", e);
		}
	}
	*/
	
	
	public List<Comune> findComune(String comune, String codIstatRegione, Date dataRiferimento) throws ResourceAccessException {
		final String method = "findComune";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectComune select = new SelectComune(comune, codIstatRegione, dataRiferimento);
			return select.executeMultipla(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	
	public Comune findComune(Long idComune) throws ResourceAccessException {
		final String method = "findComune";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectComuneById select = new SelectComuneById(idComune);
			return (Comune) select.execute(connection);
			
			
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}

	@Override
	public Comune findComune(String codiceIstat) throws ResourceAccessException {
		final String method = "findComune";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectComuneByCodiceIstat select = new SelectComuneByCodiceIstat(codiceIstat);
			return (Comune) select.execute(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}

	@Override
	public Nazione findNazione(Long idNazione) throws ResourceAccessException {
		final String method = "findNazione";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectNazioneById select = new SelectNazioneById(idNazione);
			return (Nazione) select.execute(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	
	public List<Nazione> findNazione(Date dataRiferimento) throws ResourceAccessException {
		final String method = "findNazione";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectNazione select = new SelectNazione(null, dataRiferimento);
			return select.executeMultipla(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	
	
	public List<Nazione> findNazione(String nazione, Date dataRiferimento) throws ResourceAccessException {
		final String method = "findNazione";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectNazione select = new SelectNazione(nazione, dataRiferimento);
			return select.executeMultipla(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	
	
	public List<Provincia> findProvince(String codIstatRegione) throws ResourceAccessException {
		final String method = "findProvince";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectProvince select = new SelectProvince(codIstatRegione);
			return select.executeMultipla(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}

	@Override
	public List<Provincia> findProvince() throws ResourceAccessException {
		final String method = "findProvince";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		Connection connection = null;
		try {
			connection = getConnection();
			SelectProvince select = new SelectProvince(null);
			return select.executeMultipla(connection);
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}

	
	
	/*
	public Comune findComune(Connection connection, String codiceIstat) throws ResourceAccessException {
		try {
			SelectComuneByCodiceIstat select = new SelectComuneByCodiceIstat(codiceIstat);
			return (Comune) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComune", e);
		}
		
	}
	
	public Comune findComuneByCodCatastale(Connection connection, String codCatastale) throws ResourceAccessException {
		try {
			SelectComuneByCodCatastale select = new SelectComuneByCodCatastale(codCatastale);
			return (Comune) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComuneByCodCatastale", e);
		}
		
	}

	public Attivita findAttivita(Connection connection, Long idAttivita) throws ResourceAccessException {
		try {
			SelectAttivitaById select = new SelectAttivitaById(idAttivita);
			return (Attivita) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findAttivita", e);
		}
	}

	

	

	public Nazione findNazione(Connection connection, Long idNazione) throws ResourceAccessException {
		try {
			SelectNazioneById select = new SelectNazioneById(idNazione);
			return (Nazione) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findNazione", e);
		}

	}

	public String findCodiceIstatNazione(Connection connection, Long idNazione) throws ResourceAccessException {
		try {
			SelectCodiceIstatNazioneById select = new SelectCodiceIstatNazioneById(idNazione);
			return (String) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findCodiceIstatNazione", e);
		}
		
	}

	public List findNaturaGiuridica(Connection connection) throws ResourceAccessException {
		try {
			SelectNaturaGiuridica select = new SelectNaturaGiuridica();
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findNaturaGiuridica", e);
		}
	}

	public NaturaGiuridica findNaturaGiuridica(Connection connection, Long idNaturaGiuridica) throws ResourceAccessException {
		try {
			SelectNaturaGiuridicaById select = new SelectNaturaGiuridicaById(idNaturaGiuridica);
			return (NaturaGiuridica) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findNaturaGiuridica", e);
		}
	}

	public Comune findComuneByIdNazione(Connection connection, Long idNazione) throws ResourceAccessException {
		try {
			SelectComuneByIdNazione select = new SelectComuneByIdNazione(idNazione);
			return (Comune) select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComuneByIdNazione", e);
		}
	}

	public List findProvince(Connection connection, String codIstatRegione) throws ResourceAccessException {
		try {
			SelectProvince select = new SelectProvince(codIstatRegione);
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findProvince", e);
		}
	}

	public List findComuniBySiglaProvincia(Connection connection, String siglaProvincia) throws ResourceAccessException {
		try {
			SelectComuniBySiglaProvincia select = new SelectComuniBySiglaProvincia(siglaProvincia);
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComuni", e);
		}
	}

	public List findComuniBySiglaProvinciaAndDate(Connection connection, String siglaProvincia, Date riferimento) throws ResourceAccessException {
		try {
			SelectComuniBySiglaProvinciaAndDate select = new SelectComuniBySiglaProvinciaAndDate(siglaProvincia, riferimento);
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findComuni", e);
		}
	}

	public List findMessaggi(Connection connection) throws ResourceAccessException {
		try {
			SelectMessaggi selectMessaggi = new SelectMessaggi();
			return selectMessaggi.executeMultipla(connection);
		} catch (SQLException e) {
			getLogger().error("SQLException find: " + e.getMessage(), e);
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findMessaggi", e);
		}
	}

	public Messaggio findMessaggioById(Connection connection, Integer idMessaggio) throws ResourceAccessException {
		try {
			SelectMessaggiById selectMessaggioMessaggiById = new SelectMessaggiById(idMessaggio);
			return (Messaggio) selectMessaggioMessaggiById.execute(connection);
		} catch (SQLException e) {
			getLogger().error("SQLException find: " + e.getMessage(), e);
			throw new ResourceAccessException("OracleTavoleTrasversaliDAO.findMessaggioById", e);
		}
	}
	*/
}
