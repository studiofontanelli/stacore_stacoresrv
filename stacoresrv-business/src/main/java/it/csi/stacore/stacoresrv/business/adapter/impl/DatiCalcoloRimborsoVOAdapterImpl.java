package it.csi.stacore.stacoresrv.business.adapter.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.business.adapter.DatiCalcoloRimborsoVOAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.DataScadenza;
import it.csi.stacore.staon.business.bo.DatiCalcolo;
import it.csi.stacore.staon.business.bo.Regione;
import it.csi.stacore.staon.business.bo.TipoVeicolo;
import it.csi.stacore.staon.business.bo.factory.DatiCalcoloFactory;
import it.csi.stacore.staon.business.bo.id.IdDecodifica;
import it.csi.stacore.staon.business.bo.id.IdRegione;


@Component
public class DatiCalcoloRimborsoVOAdapterImpl extends CommonDtoAdapter<DatiCalcolo, DatiCalcoloRimborsoVO> implements DatiCalcoloRimborsoVOAdapter {

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
	public DatiCalcoloRimborsoVO convertTo(DatiCalcolo t) throws DtoConversionException {
		throw new DtoConversionException("Not implemented yet");
	}



	@Override
	public DatiCalcolo convertFrom(DatiCalcoloRimborsoVO v) throws DtoConversionException {
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
			if(v.getDataScadenza() == null) {
				throw new DtoConversionException("data_scadenza non valorizzata");
			}
			if(v.getMesiValidita() == null) {
				throw new DtoConversionException("mesi_validita non valorizzata");
			}
			
			String targa = v.getTarga();
			TipoVeicolo tipoVeicolo = new TipoVeicolo(new IdDecodifica(1l), v.getTipoVeicolo(), "-");
			Date dataScadenza = v.getDataScadenza();
			Integer mesiValidita = v.getMesiValidita();
			Regione regione = new Regione(new IdRegione(13), "13", "Piemonte");
				
			DatiCalcolo result = DatiCalcoloFactory.getInstance().buildByDatiCalcoloRimborso(targa, tipoVeicolo, dataScadenzaCompensata, mesiValidita, dataScadenza, null, regione);	
			
			return result;
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
