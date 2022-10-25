package it.csi.stacore.stacoresrv.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.service.ProvinceApi;
import it.csi.stacore.stacoresrv.business.helper.ProvinciaHelper;



@Component
public class PrivinciaApiImpl implements ProvinceApi {

	@Autowired
	private ProvinciaHelper provinciaHelper;
	
	public Response findProvince(String searchType, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.ok().entity(provinciaHelper.findProvince(searchType)).build();
	}
}
