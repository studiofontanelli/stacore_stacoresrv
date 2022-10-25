package it.csi.stacore.stacoresrv.integration.service.staon;

import java.util.List;

import it.csi.stacore.stacoresrv.integration.exception.IntegrationException;
import it.csi.stacore.staon.business.bo.tavoleTrasversali.Nazione;

public interface ServizioDatiTrasversali {
	
	public List<Nazione> getNazioni() throws IntegrationException;

}
