package it.csi.stacore.stacoresrv.api.provider;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.spi.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.adapter.ErrorDetailAdapter;
import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.util.Constants;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.XmlSerializer;



@Provider
@Component
public class ExceptionHandler implements ExceptionMapper<RuntimeException> {

	private Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	private ErrorDetailAdapter errorDetailAdapter;

	public Response toResponse(RuntimeException exception) {
		String method = "toResponse";

		Tracer.info(LOG, getClass().getName(), method, "Exception " + exception);

		ErrorDto e = new ErrorDto();
		e.setDescription(exception.getMessage());

		HttpStatus httpStatus = null;

		if(exception instanceof ValidationException) {
			httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			if(((ValidationException)exception).getErrorDetails() != null) {
				ValidationException ve = ((ValidationException)exception) ;
				e.setErrorDetails(errorDetailAdapter.convertFrom(ve.getErrorDetails()));
			}
		}
		else if(exception instanceof UnauthorizedException) {
			httpStatus = HttpStatus.UNAUTHORIZED;
		}

		else if(exception instanceof NoDataFoundException) {
			httpStatus = HttpStatus.NOT_FOUND;
		}

		else {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}


		e.setStatus(httpStatus.value());
		e.setCode(httpStatus.getReasonPhrase());


		Tracer.info(LOG, getClass().getName(), method, "ExceptionDto\n " + XmlSerializer.objectToXml(e));

		return Response.status(e.getStatus()).entity(e).build();
	}
}