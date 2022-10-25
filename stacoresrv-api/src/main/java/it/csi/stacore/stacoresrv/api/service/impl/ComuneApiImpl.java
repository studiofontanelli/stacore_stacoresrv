package it.csi.stacore.stacoresrv.api.service.impl;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.Comune;
import it.csi.stacore.stacoresrv.api.dto.SearchComuneRequest;
import it.csi.stacore.stacoresrv.api.service.ComuneApi;
import it.csi.stacore.stacoresrv.business.helper.ComuneHelper;



@Component("comuneApi")
public class ComuneApiImpl implements ComuneApi {

	@Autowired
	private ComuneHelper comuneHelper;




	@Override
	public Response getComuneById(Long id, SecurityContext securityContext, HttpHeaders httpHeaders) {
		Comune response = comuneHelper.getComune(id);
		return Response.ok().entity(response).build();
	}



	@Override
	public Response getComuneByIstat(String istat, SecurityContext securityContext, HttpHeaders httpHeaders) {
		Comune response = comuneHelper.getComuneByIstat(istat);
		return Response.ok().entity(response).build();
	}



	@Override
	public Response findComune(SearchComuneRequest request, SecurityContext securityContext, HttpHeaders httpHeaders) {
		List<Comune> response = comuneHelper.findComune(request);
		return Response.ok().entity(response).build();
	}







}
