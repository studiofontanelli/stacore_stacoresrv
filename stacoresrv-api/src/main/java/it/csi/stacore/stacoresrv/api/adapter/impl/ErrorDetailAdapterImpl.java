package it.csi.stacore.stacoresrv.api.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.adapter.ErrorDetailAdapter;
import it.csi.stacore.stacoresrv.api.dto.ErrorDetail;
import it.csi.stacore.stacoresrv.business.dto.ErrorDetailDto;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.XmlSerializer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;




@Component("errorDetailAdapter")
public class ErrorDetailAdapterImpl extends CommonDtoAdapter<ErrorDetail, ErrorDetailDto> implements ErrorDetailAdapter {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	@Override
	public ErrorDetail convertFrom(ErrorDetailDto v) throws DtoConversionException {
		
		final String method = "convertFrom";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "ErrorDetailDto\n " + XmlSerializer.objectToXml(v));
			
			//ErrorDetail errorDetail =  super.convertFrom(v);
			ErrorDetail errorDetail =  super.convertFrom(v);
			
			return errorDetail;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}


	
	}

	

}
