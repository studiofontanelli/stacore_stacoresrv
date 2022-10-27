package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.AgevolazioneVO;
import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import it.csi.stacore.stacoresrv.api.dto.Fonte;
import it.csi.stacore.stacoresrv.api.dto.FonteVO;
import it.csi.stacore.stacoresrv.api.dto.TipoAgevolazione;
import it.csi.stacore.stacoresrv.api.dto.TipoAgevolazioneVO;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicolo;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.stacoresrv.api.dto.VincoliRicercaAgevolazioniVO;
import it.csi.stacore.stacoresrv.business.dto.ErrorDetailDto;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.AgevolazioneHelper;
import it.csi.stacore.stacoresrv.util.Tracer;


@Service("agevolazioneHelper")
public class AgevolazioneHelperImpl extends CommonHelperImpl implements AgevolazioneHelper {
	
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
	public AgevolazioneVO getAgevolazione(Long id) throws HelperException, NoDataFoundException, ValidationException {
		final String method = "getAgevolazione";
		
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		try {
			//Controlli formali
			if(id==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("id", "parametro non deve essere vuoto");
				errorDetails.add(errorDetailDto);
			}
			
			if(errorDetails.isEmpty()) {			
				//Determina Agevolazione
				return this.creaAgevolazioneVoMOCK();
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
		return null;
	}
	
	@Override
	public List<AgevolazioneVO> getAgevolazioneBySearchObject(VincoliRicercaAgevolazioniVO searchParams) throws HelperException,NoDataFoundException, ValidationException 
	{
		final String method = "getAgevolazioneBySearchObject";
		
		List<AgevolazioneVO> result = new ArrayList<>();
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		try {
			
			//Controlli formali
			if(searchParams==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "parametro non deve essere vuoto");
				errorDetails.add(errorDetailDto);
			}
			if(searchParams.getIdentificativoFiscaleProprietarioOriginale()==null &&
			   searchParams.getIdTipoAgevolazione()==null &&
			   searchParams.getIdTipoVeicolo()==null &&
			   searchParams.getNumProtocolloApertura()==null &&
			   (searchParams.getTarga()==null || searchParams.getTarga().isEmpty()) && 
			   searchParams.getTipoVeicoloOriginale()==null)
			{
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "almeno uno dei parametri di ricerca non deve essere vuoto");
				errorDetails.add(errorDetailDto);
			}
			
			if(errorDetails.isEmpty()) {
				/************
				 * La funzionalità dovrebbe emulare la getAgevolazioniByVeicolo presente in STAON
				 * che effettua agevolazioniBean.findAgevolazioni(vincoliAgevolazione) per ogni targa
				 * vincoliAgevolazione -> VincoliRicercaAgevolazioniVO
				 */				
				
				//Determina Agevolazione				
				result.add(this.creaAgevolazioneVoMOCK());
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
	
	/****************************************************************
	 *  FUNZIONALITA MOCK
	 ****************************************************************/
	private AgevolazioneVO creaAgevolazioneVoMOCK() 
	{		
		//***********************************************************
		//MOCK
		//***********************************************************		
		AgevolazioneVO agevolazioneVO = new AgevolazioneVO();
		agevolazioneVO.setDataAcquisizione(Calendar.getInstance().getTime());
		agevolazioneVO.setDataFine(Calendar.getInstance().getTime());
		agevolazioneVO.setDataInizio(Calendar.getInstance().getTime());
		agevolazioneVO.setDataScadenzaPatente(Calendar.getInstance().getTime());
		agevolazioneVO.setFlagRicercaAg(false);
		
		FonteVO fonteVO = new FonteVO();
		DecodificaVO decodificaVO = new DecodificaVO();
		
		decodificaVO.setCodice("RIV");
		decodificaVO.setDescrizione(Fonte.CODICE_RIV.name());
		decodificaVO.setIdDecodifica(1L);
		fonteVO.setDecodifica(decodificaVO);		
		agevolazioneVO.setFonte(fonteVO);
		
		agevolazioneVO.setId(1L);
		agevolazioneVO.setIdDatiTecnici(1L);
		agevolazioneVO.setIdentificativoFiscaleProprietarioOriginale("PRVPRV74D27Z614G");
		agevolazioneVO.setIdOperazione(1L);
		agevolazioneVO.setIdOperazioneLogica(1L);
		agevolazioneVO.setIdVeicolo(1L);
		agevolazioneVO.setNumeroPatente("AV12FRT234YH");
		agevolazioneVO.setNumProtocolloApertura("2022/58956321");
		agevolazioneVO.setNumProtocolloChiusura("2022/58956321");
		agevolazioneVO.setProrogaEuro6("ProrogaEuro6");
		agevolazioneVO.setTargaOriginale("tassa originale");
		
		TipoAgevolazioneVO tipoAgevolazioneVO = new TipoAgevolazioneVO();
		decodificaVO.setDescrizione(TipoAgevolazione.ESENZIONE_AUTOBUS_IN_SERVIZIO_DI_LINEA.name());
		decodificaVO.setCodice("75");
		tipoAgevolazioneVO.setDecodifica(decodificaVO);	
		agevolazioneVO.setTipoAgevolazione(tipoAgevolazioneVO);
		
		TipoVeicoloVO tipoVeicoloVO = new TipoVeicoloVO();
		decodificaVO.setDescrizione(TipoVeicolo.AUTOVEICOLO.name());
		decodificaVO.setCodice("A");
		tipoVeicoloVO.setDecodifica(decodificaVO);
		agevolazioneVO.setTipoVeicolo(tipoVeicoloVO);
		
		agevolazioneVO.setTipoVeicoloOriginale("tipo veicolo originale");		
		
		return agevolazioneVO;
	}	

}
