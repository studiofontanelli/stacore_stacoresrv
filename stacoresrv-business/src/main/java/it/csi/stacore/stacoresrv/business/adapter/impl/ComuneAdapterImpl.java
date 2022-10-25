package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.business.adapter.ComuneAdapter;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;


@Component
public class ComuneAdapterImpl extends CommonDtoAdapter<Comune, it.csi.stacore.stacoresrv.api.dto.Comune> implements ComuneAdapter {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;


	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	@Override
	public it.csi.stacore.stacoresrv.api.dto.Comune convertTo(Comune t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			it.csi.stacore.stacoresrv.api.dto.Comune comune =  new it.csi.stacore.stacoresrv.api.dto.Comune();
			
			comune.setId(t.getIdComune());
			comune.setDescrizione(t.getDescrizione());
			comune.setDescrizioneEstesa(t.getDescrizioneEstesa());
			comune.setIstat(t.getIstat());
			comune.setCodiceCatastale(t.getCodiceCatastale());
			comune.setIstat(t.getIstat());
			
			
			return comune;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public Comune convertFrom(it.csi.stacore.stacoresrv.api.dto.Comune v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			
			Comune comune = new Comune(v.getId(), v.getDescrizione(), v.getIstat());
			comune.setDescrizioneEstesa(v.getDescrizioneEstesa());
			comune.setCodiceCatastale(v.getCodiceCatastale());
			return comune;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
