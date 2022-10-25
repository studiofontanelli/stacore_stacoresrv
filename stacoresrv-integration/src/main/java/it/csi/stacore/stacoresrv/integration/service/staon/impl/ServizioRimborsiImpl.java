package it.csi.stacore.stacoresrv.integration.service.staon.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import it.csi.csi.wrapper.UnrecoverableException;
import it.csi.stacore.stacoresrv.integration.exception.IntegrationException;
import it.csi.stacore.stacoresrv.integration.service.ParentIntegrationServiceImpl;
import it.csi.stacore.stacoresrv.integration.service.staon.ServizioDatiTrasversali;
import it.csi.stacore.stacoresrv.integration.service.staon.ServizioRimborsi;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.staon.business.bo.DatiCalcolo;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborso;
import it.csi.stacore.staon.business.bo.factory.DatiCalcoloFactory;
import it.csi.stacore.staon.business.bo.tavoleTrasversali.Nazione;
import it.csi.stacore.staon.business.bo.utente.Utente;
import it.csi.stacore.staon.exception.ApplicationException;
import it.csi.stacore.staon.exception.ServiceException;
import it.csi.stacore.staon.interfaceCSI.ServizioDatiTrasversaliInterface;
import it.csi.stacore.staon.interfaceCSI.ServizioRimborsiInterface;

@Service
public class ServizioRimborsiImpl extends ParentIntegrationServiceImpl implements ServizioRimborsi {


	

	public ServizioRimborsiInterface getServizioRimborsiInterface() {
		ServizioRimborsiInterface service  = (ServizioRimborsiInterface)applicationContext.getBean("servizioRimborsiInterface");
		return service;
	}

	@Override
	public EsitoCalcoloRimborso calcolaRimborso(DatiCalcolo datiCalcolo, Utente utente) throws IntegrationException {
		final String method = "calcolaRimborso";
		try {
			return getServizioRimborsiInterface().calcolaRimborso(datiCalcolo, utente);
		} catch (ServiceException | ApplicationException | UnrecoverableException e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new IntegrationException("Problemi di accesso a Servizio Rimborsi: " + e.getMessage());
		}
		finally {

		}


	}

}