package it.csi.stacore.stacoresrv.integration.service.staon;

import it.csi.stacore.stacoresrv.integration.exception.IntegrationException;
import it.csi.stacore.staon.business.bo.DatiCalcolo;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborso;
import it.csi.stacore.staon.business.bo.utente.Utente;

public interface ServizioRimborsi {
	
	
	/**
	 * 
	 * @param datiCalcolo
	 * @param utente
	 * @return
	 * @throws IntegrationException
	 */
	public EsitoCalcoloRimborso calcolaRimborso(DatiCalcolo datiCalcolo, Utente utente) throws IntegrationException;


}
