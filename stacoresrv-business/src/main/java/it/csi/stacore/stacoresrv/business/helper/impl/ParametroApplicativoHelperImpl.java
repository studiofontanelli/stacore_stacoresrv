package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.ParametroApplicativoVO;
import it.csi.stacore.stacoresrv.business.dto.ErrorDetailDto;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.ParametroApplicativoHelper;
import it.csi.stacore.stacoresrv.util.Tracer;

@Service("parametroApplicativoHelper")
public class ParametroApplicativoHelperImpl extends CommonHelperImpl implements ParametroApplicativoHelper {
	
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
	public ParametroApplicativoVO getParametroApplicativo(String id) throws HelperException, NoDataFoundException, ValidationException {
		final String method = "getParametroApplicativo";
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		ParametroApplicativoVO result = null;
		try {			
			//Controlli formali
			if(id==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("id", "parametro non deve essere vuoto");
				errorDetails.add(errorDetailDto);
			}
			
			if(errorDetails.isEmpty()) {
				List<ParametroApplicativoVO> parametroApplicativoVOList = _getParametriApplicativi();
				if(parametroApplicativoVOList != null) {
					result = parametroApplicativoVOList.stream()
													   .filter(param -> param.getName().equals(id))
													   .findFirst().get();
				}				
			}			
		}
		catch(NoSuchElementException ns) {
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("id", "Nessun parametro applicativo trovato");
			errorDetails.add(errorDetailDto);
			throw new NoDataFoundException(method,errorDetails);
		}
		catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}		
		
		return result;
	}
	
	@Override
	public List<ParametroApplicativoVO> getParametroApplicativi() throws HelperException, 
																		 NoDataFoundException, 
																		 ValidationException 
	{
		final String method = "getParametroApplicativi";
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		List<ParametroApplicativoVO> result = null;
		try {			
							
			result = _getParametriApplicativi();			
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}		
		return result;
	}
	
	private List<ParametroApplicativoVO> _getParametriApplicativi(){
		List<ParametroApplicativoVO> parametroApplicativoVOList = new ArrayList<>();
		
		//MOCK
		parametroApplicativoVOList.add(creaParametroApplicativoVoMOCK());
		
		return parametroApplicativoVOList;
		
	}
	
	/****************************************************************
	 *  FUNZIONALITA MOCK
	 ****************************************************************/
	private ParametroApplicativoVO creaParametroApplicativoVoMOCK(){
		ParametroApplicativoVO parametroApplicativoVO = new ParametroApplicativoVO();
		parametroApplicativoVO.setName("id parametro applicativo");
		parametroApplicativoVO.setValue("value parametro applicativo");
		
		return parametroApplicativoVO;
	}	

}
