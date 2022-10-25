package it.csi.stacore.stacoresrv.business.helper;

import java.util.Date;
import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.Comune;
import it.csi.stacore.stacoresrv.api.dto.SearchComuneRequest;
import it.csi.stacore.stacoresrv.business.exception.HelperException;

public interface ComuneHelper {

	
	/**
	 * Recupera il comune per PK
	 * @param id
	 * @return
	 * @throws HelperException
	 */
	public Comune getComune (Long id) throws HelperException ;
	
	
	
	public Comune getComuneByIstat (String istat) throws HelperException ;
	
	
	/**
	 * Ricerca il comune per codice istat e, eventualmente data validità
	 * @param istat
	 * @param data
	 * @return
	 * @throws HelperException
	 */
	public Comune findComune (String istat, Date data) throws HelperException;
	
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws HelperException
	 */
	public List<Comune> findComune(SearchComuneRequest request) throws HelperException;
	
	
}	
