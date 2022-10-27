package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import it.csi.stacore.stacoresrv.api.dto.RegioneVO;
import it.csi.stacore.stacoresrv.business.dto.ErrorDetailDto;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.DecodificaHelper;
import it.csi.stacore.stacoresrv.util.Tracer;

@Service("decodificaHelper")
public class DecodificaHelperImpl extends CommonHelperImpl implements DecodificaHelper {
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			//TO DO
		}
	}

	@Override
	public List<DecodificaVO> findEnteById(String idEnte) throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findEnteById";
		final String VOID_PARAM_MSG = "parametro non deve essere vuoto";		
		final String NOT_GEST_PARAM_MSG = "valore parametro non previsto";				
		final String COD_PROVINCE = "prov";
		final String COD_REGIONE = "reg";
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		List<DecodificaVO> result = new ArrayList<>();
		Map<String,String> idEnteMap = new HashMap<String, String>();
		idEnteMap.put(COD_PROVINCE, COD_PROVINCE);
		idEnteMap.put(COD_REGIONE, COD_REGIONE);
		
		try 
		{
			//Controlli formali
			if(idEnte==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("idEnte", VOID_PARAM_MSG);
				errorDetails.add(errorDetailDto);
			}			
			if(errorDetails.isEmpty()) {
				switch(idEnte) {
					case COD_PROVINCE:
						//MOCK
						result.add(this.createDecodificaVOMock(COD_PROVINCE));
						break;
					case COD_REGIONE:
						//MOCK
						result.add(this.createDecodificaVOMock(COD_REGIONE));
						break;
					default:
					{
						ErrorDetailDto errorDetailDto = new ErrorDetailDto("idEnte", NOT_GEST_PARAM_MSG);
						errorDetails.add(errorDetailDto);
					}
				}				
			}			
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}finally {
			if(!errorDetails.isEmpty()) {
				throw new ValidationException(method, errorDetails);
			}						
		}
		return result;		
	}
	
	@Override
	public RegioneVO loadRegioneByCodice(String codiceReg)	throws HelperException, NoDataFoundException, ValidationException {
		final String method = "loadRegioneByCodice";
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		final String VOID_PARAM_MSG = "parametro non deve essere vuoto";
		RegioneVO result = null;
		try 
		{
			//Controlli formali
			if(codiceReg==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("idEnte", VOID_PARAM_MSG);
				errorDetails.add(errorDetailDto);
			}
			
			if(errorDetails.isEmpty()) {
				//MOCK
				result = this.createRegioneVOMock(codiceReg);				
			}
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}finally {
			if(!errorDetails.isEmpty()) {
				throw new ValidationException(method, errorDetails);
			}						
		}		
		
		return result;
	}
	
	@Override
	public List<DecodificaVO> findTipoCombustibile() throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findTipoCombustibile";		
		List<DecodificaVO> result = new ArrayList<>();
		try 
		{			
			//MOCK
			result.add(this.createTipoDecodificaMock("Tipo Combustibile"));			
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			List<ErrorDetailDto> errorDetails = new ArrayList<>();
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}	
		
		return result;
	}
	
	@Override
	public List<DecodificaVO> findTipoCompensazione() throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findTipoCompensazione";		
		List<DecodificaVO> result = new ArrayList<>();
		try 
		{			
			//MOCK
			result.add(this.createTipoDecodificaMock("Tipo Compensazione"));			
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			List<ErrorDetailDto> errorDetails = new ArrayList<>();
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}	
		
		return result;
	}
	
	@Override
	public List<DecodificaVO> findTipoVeicolo() throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findTipoVeicolo";		
		List<DecodificaVO> result = new ArrayList<>();
		try 
		{			
			//MOCK
			result.add(this.createTipoDecodificaMock("Tipo Veicolo"));			
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			List<ErrorDetailDto> errorDetails = new ArrayList<>();
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}	
		
		return result;
	}
	
	/*********************************************************************
	 * Funzioni MOCK
	 **********************************************************************/
	private DecodificaVO createDecodificaVOMock(String codEnte) {
		DecodificaVO decodificaVO = new DecodificaVO();
		decodificaVO.setCodice(codEnte);
		decodificaVO.setDescrizione("descrizione " + codEnte);
		decodificaVO.setIdDecodifica(1L);
		
		return decodificaVO;
	}
	
	private RegioneVO createRegioneVOMock(String codiceReg) {
		RegioneVO regioneVO = new RegioneVO();
		regioneVO.setCodice(codiceReg);
		regioneVO.setDescrizione("Descrizione " + codiceReg);
		regioneVO.setIdRegione(1L);
		regioneVO.setIstat("codice istat");
		
		return regioneVO;
	}
	
	private DecodificaVO createTipoDecodificaMock(String soggetto) {
		DecodificaVO decodificaVO = new DecodificaVO();
		decodificaVO.setCodice("codice" + soggetto);
		decodificaVO.setDescrizione("descrizione" + soggetto);
		decodificaVO.setIdDecodifica(1L);
		
		return decodificaVO;
	}		

}
