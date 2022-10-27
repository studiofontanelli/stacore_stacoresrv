package it.csi.stacore.stacoresrv.business.helper;


import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.ParametroApplicativoVO;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;

public interface ParametroApplicativoHelper {
	
	public ParametroApplicativoVO getParametroApplicativo(String id) throws HelperException, NoDataFoundException, ValidationException;
	
	public List<ParametroApplicativoVO> getParametroApplicativi() throws HelperException, NoDataFoundException, ValidationException;
}
