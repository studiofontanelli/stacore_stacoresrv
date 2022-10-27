package it.csi.stacore.stacoresrv.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.service.ParametriApplicativiApi;
import it.csi.stacore.stacoresrv.business.helper.ParametroApplicativoHelper;

@Component
public class ParametriApplicativiApiImpl implements ParametriApplicativiApi {
	
	
	
	@Autowired
	private ParametroApplicativoHelper parametroApplicativoHelper;
	

	@Override
	public Response getParametroApplicativo(String id, SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(parametroApplicativoHelper.getParametroApplicativo(id)).build();
	}

	@Override
	public Response getParametriApplicativi(SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(parametroApplicativoHelper.getParametroApplicativi()).build();
	}

}
