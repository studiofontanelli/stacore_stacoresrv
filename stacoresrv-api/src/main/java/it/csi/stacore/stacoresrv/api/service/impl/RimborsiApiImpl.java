package it.csi.stacore.stacoresrv.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.service.RimborsiApi;
import it.csi.stacore.stacoresrv.business.helper.RimborsiHelper;



@Component
public class RimborsiApiImpl implements RimborsiApi {

	
	@Autowired
	private RimborsiHelper rimborsiHelper;
	
	@Override
	public Response calcolaRimborso(DatiCalcoloRimborsoVO datiCalcoloRimborsoVO, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.ok().entity(rimborsiHelper.calcolaRimborso(datiCalcoloRimborsoVO)).build();
	}

	@Override
	public Response calcolaRimborsoNonGoduto(DatiCalcoloRimborsoNonGodutoVO datiCalcolo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.ok().entity(rimborsiHelper.calcolaRimborso(datiCalcolo)).build();
	}
}
