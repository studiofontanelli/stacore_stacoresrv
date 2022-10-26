package it.csi.stacore.stacoresrv.business.adapter.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.business.adapter.ImportoAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;


@Component
public class ImportoAdapterImpl extends CommonDtoAdapter<BigDecimal, Double> implements ImportoAdapter {

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
	public Double convertTo(BigDecimal t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			Double d = null;
			if(t != null) {
				d = t.setScale(2, RoundingMode.HALF_UP).doubleValue();
			}
			return d;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}



	@Override
	public BigDecimal convertFrom(Double v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			BigDecimal bg = null;
			if(v != null) {
				bg = BigDecimal.valueOf(v).setScale(2, RoundingMode.HALF_UP);
				
			}
			return bg;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
