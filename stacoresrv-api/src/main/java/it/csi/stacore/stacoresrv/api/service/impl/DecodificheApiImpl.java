package it.csi.stacore.stacoresrv.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.service.DecodificheApi;
import it.csi.stacore.stacoresrv.business.helper.DecodificaHelper;

@Component
public class DecodificheApiImpl implements DecodificheApi {
	
	
	@Autowired
	private DecodificaHelper decodificaHelper;
	
	/*
	public Response findTipoCombustibile(UtenteVO utente, SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(decodificaHelper.findTipoCombustibile()).build();
	}

	
	public Response findTipoCompensazione(UtenteVO utente, SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(decodificaHelper.findTipoCompensazione()).build();
	}
	*/

	@Override
	public Response findTipoVeicolo(SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(decodificaHelper.findTipoVeicolo()).build();
	}	
}
