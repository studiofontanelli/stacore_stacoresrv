package it.csi.stacore.stacoresrv.api.service.impl;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.Nazione;
import it.csi.stacore.stacoresrv.api.dto.SearchNazioneRequest;
import it.csi.stacore.stacoresrv.api.service.NazioneApi;
import it.csi.stacore.stacoresrv.business.helper.NazioneHelper;



@Component
public class NazioneApiImpl implements NazioneApi {

	@Autowired
	private NazioneHelper nazioneHelper;
	
	@Override
	public Response findNazione(SearchNazioneRequest request, SecurityContext securityContext, HttpHeaders httpHeaders) {
		List<Nazione> response = nazioneHelper.findNazione(request);
		return Response.ok().entity(response).build();
	}

	@Override
	public Response getNazioneById(Long id, SecurityContext securityContext, HttpHeaders httpHeaders) {
		Nazione response = nazioneHelper.getNazioneById(id);
		return Response.ok().entity(response).build();
	}
}
