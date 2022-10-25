package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcolaRimborso;
import it.csi.stacore.stacoresrv.business.adapter.DatiCalcoloRimborsoVOAdapter;
import it.csi.stacore.stacoresrv.business.dto.ErrorDetailDto;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.RimborsiHelper;
import it.csi.stacore.stacoresrv.integration.service.staon.ServizioRimborsi;
import it.csi.stacore.stacoresrv.util.DateUtil;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.XmlSerializer;
import it.csi.stacore.staon.business.bo.DatiCalcolo;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborso;
import it.csi.stacore.staon.business.bo.factory.UtenteFactory;
import it.csi.stacore.staon.business.bo.utente.Utente;

@Service("rimborsiHelper")
public class RimborsiHelperImpl extends CommonHelperImpl implements RimborsiHelper {

	
	@Autowired
	private ServizioRimborsi servizioRimborsi;
	
	@Autowired
	private DatiCalcoloRimborsoVOAdapter datiCalcoloRimborsoVOAdapter;

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

		}
	}
	
	enum SearchType {
		  ALL,
		  PIEMONTE
	}

	

	@Override
	public EsitoCalcolaRimborso calcolaRimborso(DatiCalcoloRimborsoVO datiCalcoloVO) throws HelperException {
		final String method = "calcolaRimborso";
		try {
			List<ErrorDetailDto> errors = new ArrayList<>();
			
			if(datiCalcoloVO == null) {
				throw new ValidationException("dati_calcolo_rimborso_vo non valorizzato");
			}
			if(StringUtils.isBlank(datiCalcoloVO.getTarga())) {
				errors.add(new ErrorDetailDto("targa", "targa non valorizzata"));
			}
			if(StringUtils.isBlank(datiCalcoloVO.getTipoVeicolo())) {
				errors.add(new ErrorDetailDto("tipo_veicolo", "tipo veicolo non valorizzata"));
			}
			if(datiCalcoloVO.getDataScadenza() == null) {
				errors.add(new ErrorDetailDto("data_scadenza", "data scadenza non valorizzata"));
			}
			if(datiCalcoloVO.getMesiValidita() == null) {
				errors.add(new ErrorDetailDto("mesi_validita", "mesi validita non valorizzato"));
			}
			if (!errors.isEmpty()) {
				throw new ValidationException("Campi richiesti non valorizzati!", errors);
			}
			
			DatiCalcolo datiCalcolo =  datiCalcoloRimborsoVOAdapter.convertFrom(datiCalcoloVO);
					
					
			Utente utente = 	UtenteFactory.getInstance().buildByIdentificativoFiscale("AAAA");	
					
			
			EsitoCalcoloRimborso e = servizioRimborsi.calcolaRimborso(datiCalcolo, utente);
					
			Tracer.debug(LOG, getClass().getName(), method, "EsitoCalcoloRimborso\n "  +XmlSerializer.objectToXml(e));
			
			
			EsitoCalcolaRimborso esito = new EsitoCalcolaRimborso();
			esito.setDataUltimoGiornoUtilePagamento(DateUtil.getCurrentDate());
			
			return esito;
		}
		catch(HelperException e) {
			Tracer.error(LOG, getClass().getName(), method, "HelperException "  +e);
			throw e;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new HelperException(e.getMessage());
		}
		finally {

		}
	}










}
