package it.csi.stacore.stacoresrv.business.helper;

import java.util.List;

import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import it.csi.stacore.stacoresrv.api.dto.RegioneVO;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;

public interface DecodificaHelper {
	
	public List<DecodificaVO> findEnteById(String idEnte) throws HelperException, NoDataFoundException, ValidationException;
		
	public RegioneVO loadRegioneByCodice(String codiceReg) throws HelperException, NoDataFoundException, ValidationException;
	
	public List<DecodificaVO> findTipoCombustibile() throws HelperException, NoDataFoundException, ValidationException;
	
	public List<DecodificaVO> findTipoCompensazione() throws HelperException, NoDataFoundException, ValidationException;
	
	public List<TipoVeicoloVO> findTipoVeicolo() throws HelperException, NoDataFoundException, ValidationException;
	
	public TipoVeicoloVO getTipoVeicoloByCodice(String codice) throws HelperException, NoDataFoundException;
}
