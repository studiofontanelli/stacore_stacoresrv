package it.csi.stacore.stacoresrv.integration.dao;

import java.util.Date;
import java.util.List;

import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Provincia;
import it.csi.stacore.stacoresrv.integration.exception.ResourceAccessException;

public interface TavoleTrasversaliDAO {
	
	
	/*
	public Regione findRegioneByDescrizione(Connection connection, String descrizione) throws ResourceAccessException;

	public List findComune(Connection connection, String comune, String codIstatRegione, Date dataRiferimento) throws ResourceAccessException;

	public List findAttivita(Connection connection, String attivita) throws ResourceAccessException;
	*/
	
	/**
	 * 
	 * @param idComune
	 * @return
	 * @throws ResourceAccessException
	 */
	public Comune findComune(Long idComune) throws ResourceAccessException;

	
	public Comune findComune(String codiceIstat) throws ResourceAccessException;
	
	
	/**
	 * 
	 * @param comune
	 * @param codIstatRegione
	 * @param dataRiferimento
	 * @return
	 * @throws ResourceAccessException
	 */
	public List<Comune> findComune(String denominazione, String codIstatRegione, Date dataRiferimento) throws ResourceAccessException;

	
	/**
	 * 
	 * @param idNazione
	 * @return
	 * @throws ResourceAccessException
	 */
	public Nazione findNazione(Long idNazione) throws ResourceAccessException;
	
	
	/**
	 * 
	 * @param dataRiferimento
	 * @return
	 * @throws ResourceAccessException
	 */
	public List<Nazione> findNazione(Date dataRiferimento) throws ResourceAccessException;
	
	
	public List<Nazione> findNazione(String nazione, Date dataRiferimento) throws ResourceAccessException;
	
	public List<Provincia> findProvince(String codIstatRegione) throws ResourceAccessException;
	
	public List<Provincia> findProvince() throws ResourceAccessException;
	
	
	
	/*
	public Attivita findAttivita(Connection connection, Long idAttivita) throws ResourceAccessException;

	

	

	

	public List findNaturaGiuridica(Connection connection) throws ResourceAccessException;

	public NaturaGiuridica findNaturaGiuridica(Connection connection, Long idNaturaGiuridica) throws ResourceAccessException;

	public Comune findComuneByIdNazione(Connection conn, Long idNazione) throws ResourceAccessException;

	public String findCodiceIstatNazione(Connection connection, Long idNazione) throws ResourceAccessException;

	public Comune findComuneByCodCatastale(Connection connection, String codCatastale) throws ResourceAccessException;
	
	public List findProvince(Connection connection, String codIstatRegione) throws ResourceAccessException;
	
	public List findComuniBySiglaProvincia(Connection connection, String codIstatProvincia) throws ResourceAccessException;

	public List findComuniBySiglaProvinciaAndDate(Connection connection, String siglaProvincia, Date riferimento) throws ResourceAccessException;

	public List findMessaggi(Connection connection) throws ResourceAccessException;

	public Messaggio findMessaggioById(Connection connection, Integer idMessaggio) throws ResourceAccessException;
	*/
}
