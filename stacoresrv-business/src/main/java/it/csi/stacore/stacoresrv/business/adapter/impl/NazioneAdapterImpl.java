package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.business.adapter.NazioneAdapter;
import it.csi.stacore.stacoresrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;


@Component
public class NazioneAdapterImpl extends CommonDtoAdapter<Nazione, it.csi.stacore.stacoresrv.api.dto.Nazione> implements NazioneAdapter {

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
	public it.csi.stacore.stacoresrv.api.dto.Nazione convertTo(Nazione t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			it.csi.stacore.stacoresrv.api.dto.Nazione nazione =  new it.csi.stacore.stacoresrv.api.dto.Nazione();
			
			nazione.setId(t.getIdNazione().getId());
			nazione.setDescrizione(t.getDescrizione());
			return nazione;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public Nazione convertFrom(it.csi.stacore.stacoresrv.api.dto.Nazione v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			return new Nazione(new IdDecodifica(v.getId()), v.getDescrizione());
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
