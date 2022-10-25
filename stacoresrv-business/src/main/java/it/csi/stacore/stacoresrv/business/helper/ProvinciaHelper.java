package it.csi.stacore.stacoresrv.business.helper;

import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.Provincia;
import it.csi.stacore.stacoresrv.business.exception.HelperException;

public interface ProvinciaHelper {
	
	
	
	
	
	/**
	 * 
	 * @param searchType
	 * @return
	 * @throws HelperException
	 */
	public List<Provincia> findProvince(String searchType) throws HelperException;
	
	
	
	
	
	
}	
