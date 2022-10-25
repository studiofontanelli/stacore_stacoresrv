package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.helper.TestResourceHelper;

import it.csi.stacore.stacoresrv.integration.service.staon.ServizioDatiTrasversali;
import it.csi.stacore.stacoresrv.util.Tracer;

@Service("testResourceHelper")
public class TestResourceHelperImpl extends CommonHelperImpl implements TestResourceHelper {
	
	
	@Autowired
	private ServizioDatiTrasversali servizioDatiTrasversali;
	
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
			
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			
		}
		
	}

	@Override
	public boolean testResources() throws HelperException {
		final String method = "testResources";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
		
			List<it.csi.stacore.staon.business.bo.tavoleTrasversali.Nazione> l = servizioDatiTrasversali.getNazioni();
			
			Tracer.debug(LOG, getClass().getName(), method, "found " + l.size() + " nazioni");
			
			return true;
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new HelperException(e.getMessage());
		}
		finally {
			
		}
		
	}

	

}
