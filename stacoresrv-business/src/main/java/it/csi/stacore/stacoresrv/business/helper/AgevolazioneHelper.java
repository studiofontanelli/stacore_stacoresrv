package it.csi.stacore.stacoresrv.business.helper;

import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.AgevolazioneVO;
import it.csi.stacore.stacoresrv.api.dto.VincoliRicercaAgevolazioniVO;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;

public interface AgevolazioneHelper {
	
	public AgevolazioneVO getAgevolazione(Long id) throws HelperException, NoDataFoundException, ValidationException;
	
	public List<AgevolazioneVO> getAgevolazioneBySearchObject(VincoliRicercaAgevolazioniVO searchParams) throws HelperException, NoDataFoundException, ValidationException;

}
