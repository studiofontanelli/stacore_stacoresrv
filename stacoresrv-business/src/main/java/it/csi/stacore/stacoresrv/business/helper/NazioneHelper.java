package it.csi.stacore.stacoresrv.business.helper;

import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.Nazione;
import it.csi.stacore.stacoresrv.api.dto.SearchNazioneRequest;
import it.csi.stacore.stacoresrv.business.exception.HelperException;

public interface NazioneHelper {
	
	
	/**
	 * Recupera la nazione per PK
	 * @param id
	 * @return
	 * @throws HelperException
	 */
	public Nazione getNazioneById (Long id) throws HelperException ;
	
	
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws HelperException
	 */
	public List<Nazione> findNazione(SearchNazioneRequest request) throws HelperException;
	
	
}	
