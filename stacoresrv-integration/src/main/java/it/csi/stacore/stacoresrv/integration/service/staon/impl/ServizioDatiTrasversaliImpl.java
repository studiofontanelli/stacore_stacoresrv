package it.csi.stacore.stacoresrv.integration.service.staon.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.csi.csi.wrapper.UnrecoverableException;
import it.csi.stacore.stacoresrv.integration.exception.IntegrationException;
import it.csi.stacore.stacoresrv.integration.service.ParentIntegrationServiceImpl;
import it.csi.stacore.stacoresrv.integration.service.staon.ServizioDatiTrasversali;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.staon.business.bo.tavoleTrasversali.Nazione;
import it.csi.stacore.staon.exception.ApplicationException;
import it.csi.stacore.staon.exception.ServiceException;
import it.csi.stacore.staon.interfaceCSI.ServizioDatiTrasversaliInterface;

@Service
public class ServizioDatiTrasversaliImpl extends ParentIntegrationServiceImpl implements ServizioDatiTrasversali {

	
	
	
   /*
	@Autowired
	@Qualifier("servizioDatiTrasversaliInterface")
	*/
	//private ServizioDatiTrasversaliInterface servizioDatiTrasversaliInterface;

	
	public ServizioDatiTrasversaliInterface getServizioDatiTrasversaliInterface() {
		
		 ServizioDatiTrasversaliInterface servizioDatiTrasversaliInterface  = (ServizioDatiTrasversaliInterface)applicationContext.getBean("servizioDatiTrasversaliInterface");
		 
		 return servizioDatiTrasversaliInterface;
	}
	
	@Override
	public List<Nazione> getNazioni() throws IntegrationException{
		final String method = "getNazioni";
		List<Nazione> result = null;
		try {
			result = getServizioDatiTrasversaliInterface().findNazioni();
		
		
	} catch (ServiceException | ApplicationException | UnrecoverableException e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			
			
			
			throw new IntegrationException("Problemi di accesso a ServizioDatiTrasversaliInterface: " + e.getMessage());
		}
		finally {

		}
		return result;
	}

}
