package it.csi.stacore.stacoresrv.business.adapter.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.business.adapter.DatiCalcoloRimborsoNonGodutoVOAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.XmlSerializer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.DataScadenza;
import it.csi.stacore.staon.business.bo.DatiCalcolo;
import it.csi.stacore.staon.business.bo.Regione;
import it.csi.stacore.staon.business.bo.TipoCompensazione;
import it.csi.stacore.staon.business.bo.TipoVeicolo;
import it.csi.stacore.staon.business.bo.factory.DatiCalcoloFactory;
import it.csi.stacore.staon.business.bo.id.IdDecodifica;


@Component
public class DatiCalcoloRimborsoNonGodutoVOAdapterImpl extends CommonDtoAdapter<DatiCalcolo, DatiCalcoloRimborsoNonGodutoVO> implements DatiCalcoloRimborsoNonGodutoVOAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4970225386120426827L;
	
	@Autowired
	private ApplicationContext applicationContext;


	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	@Override
	public DatiCalcoloRimborsoNonGodutoVO convertTo(DatiCalcolo t) throws DtoConversionException {
		throw new DtoConversionException("Not implemented yet");
	}



	@Override
	public DatiCalcolo convertFrom(DatiCalcoloRimborsoNonGodutoVO v) throws DtoConversionException {
		final String method = "convertTo";
		try {
			DataScadenza dataScadenzaCompensata = null;
			
			
			if(v == null) {
				throw new DtoConversionException("DatiCalcoloRimborsoVO non valorizzato");
				
			}
			if(StringUtils.isBlank(v.getTarga())) {
				throw new DtoConversionException("targa non valorizzata");
			}
			if(StringUtils.isBlank(v.getTipoVeicolo())) {
				throw new DtoConversionException("tipo veicolo non valorizzato");
			}
			if(StringUtils.isBlank(v.getTipoCompensazione())) {
				throw new DtoConversionException("tipo compensazione non valorizzato");
			}
			if(v.getDataScadenza() == null) {
				throw new DtoConversionException("data_scadenza non valorizzata");
			}
			if(v.getMesiValidita() == null) {
				throw new DtoConversionException("mesi_validita non valorizzata");
			}
			if(v.getDataEventoChiusura() == null) {
				throw new DtoConversionException("data_evento_chiusura_ non valorizzata");
			}
			
			String targa = v.getTarga();
			
			// AF: DA MODIFICARE
			TipoVeicolo tipoVeicolo = new TipoVeicolo(new IdDecodifica(1l), v.getTipoVeicolo(), "AUTOVEICOLO");
			
			// AF: DA MODIFICARE
			TipoCompensazione tipoCompensazione = new TipoCompensazione(new IdDecodifica(-1l), v.getTipoCompensazione(), "-");
			
			Integer mesiValidita = v.getMesiValidita();
			Regione regione = null; 
				
			Date dataRiferimento = new java.util.Date();
			
			DataScadenza dataScadenza = new DataScadenza(new Integer(v.getDataScadenza()));
			
			
			Date dataEventoChiusura = v.getDataEventoChiusura();
			/*
			 * 
			 * String dataScadenzaStr = "201902";
			
			TipoVeicolo tipoVeicolo = new TipoVeicolo(new IdDecodifica(1L),"A", "AUTOVEICOLO");

			DataScadenza dataScadenza = new DataScadenza(new Integer(dataScadenzaStr));
			String targa = "XX663LW";
			Regione regione = null; 
			int mesiValidita = 12;
			java.util.Date dataRiferimento = new java.util.Date();

			DatiCalcolo datiCalcolo = DatiCalcoloFactory.getInstance().buildByDatiCalcoloRimborso(targa, tipoVeicolo, dataScadenza, mesiValidita, dataRiferimento, null, regione);
		
			Utente utente = UtenteFactory.getInstance().buildUtenteApplicativoByIdUtente("DEMO 22");
			
			 * 
			 */
			
			//DatiCalcolo result = DatiCalcoloFactory.getInstance().buildByDatiCalcoloRimborso(targa, tipoVeicolo, dataScadenza, mesiValidita, dataRiferimento, null, regione);	
			DatiCalcolo result = DatiCalcoloFactory.getInstance().buildByDatiCalcoloRimborsoNonGoduto(targa, tipoVeicolo, dataScadenza, mesiValidita, 
					
					dataEventoChiusura, tipoCompensazione, dataRiferimento, null, regione);
			
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "DatiCalcolo\n " + XmlSerializer.objectToXml(result));
			}
			return result;
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
