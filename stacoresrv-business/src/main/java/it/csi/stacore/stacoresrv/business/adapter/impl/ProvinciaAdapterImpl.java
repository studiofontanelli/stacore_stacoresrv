package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.business.adapter.ProvinciaAdapter;
import it.csi.stacore.stacoresrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Provincia;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;


@Component
public class ProvinciaAdapterImpl extends CommonDtoAdapter<Provincia, it.csi.stacore.stacoresrv.api.dto.Provincia> implements ProvinciaAdapter {

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
	public it.csi.stacore.stacoresrv.api.dto.Provincia convertTo(Provincia t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			it.csi.stacore.stacoresrv.api.dto.Provincia provincia =  new it.csi.stacore.stacoresrv.api.dto.Provincia();
			
			provincia.setId(t.getIdProvincia());
			provincia.setSigla(t.getSigla());
			provincia.setIstat(t.getIstat());
			provincia.setDescrizione(t.getDescrizione());
			return provincia;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public Provincia convertFrom(it.csi.stacore.stacoresrv.api.dto.Provincia v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			return new Provincia(v.getId(), v.getSigla(), v.getDescrizione(), v.getIstat());
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
