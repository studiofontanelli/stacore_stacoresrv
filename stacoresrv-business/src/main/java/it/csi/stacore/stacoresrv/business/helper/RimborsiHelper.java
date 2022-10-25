package it.csi.stacore.stacoresrv.business.helper;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcolaRimborso;
import it.csi.stacore.stacoresrv.business.exception.HelperException;

public interface RimborsiHelper {
	
	
	
	
	
	/**
	 * 
	 * @param datiCalcolo
	 * @return
	 * @throws HelperException
	 */
	public EsitoCalcolaRimborso calcolaRimborso(DatiCalcoloRimborsoVO datiCalcolo )throws HelperException;
	
	
	
	
}	
