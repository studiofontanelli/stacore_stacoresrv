package it.csi.stacore.stacoresrv.business.helper;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.business.exception.HelperException;

public interface RimborsiHelper {
	
	
	/**
	 * 
	 * @param datiCalcolo
	 * @return
	 * @throws HelperException
	 */
	public EsitoCalcoloRimborsoVO calcolaRimborso(DatiCalcoloRimborsoVO datiCalcolo )throws HelperException;
	
	
	/**
	 * 
	 * @param datiCalcolo
	 * @return
	 * @throws HelperException
	 */
	public EsitoCalcoloRimborsoNonGodutoVO calcolaRimborso(DatiCalcoloRimborsoNonGodutoVO datiCalcolo )throws HelperException;
	
	
}	
