package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.business.adapter.DatiCalcoloRimborsoNonGodutoVOAdapter;
import it.csi.stacore.stacoresrv.business.adapter.DatiCalcoloRimborsoVOAdapter;
import it.csi.stacore.stacoresrv.business.adapter.EsitoCalcoloRimborsoAdapter;
import it.csi.stacore.stacoresrv.business.adapter.EsitoCalcoloRimborsoNonGodutoAdapter;
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
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborsoNonGoduto;
import it.csi.stacore.staon.business.bo.factory.UtenteFactory;
import it.csi.stacore.staon.business.bo.utente.Utente;

@Service("rimborsiHelper")
public class RimborsiHelperImpl extends CommonHelperImpl implements RimborsiHelper {

	
	@Autowired
	private ServizioRimborsi servizioRimborsi;
	
	@Autowired
	private DatiCalcoloRimborsoVOAdapter datiCalcoloRimborsoVOAdapter;
	
	@Autowired
	private DatiCalcoloRimborsoNonGodutoVOAdapter datiCalcoloRimborsoNonGodutoVOAdapter;
	
	@Autowired
	private EsitoCalcoloRimborsoAdapter esitoCalcoloRimborsoAdapter;
	
	@Autowired
	private EsitoCalcoloRimborsoNonGodutoAdapter esitoCalcoloRimborsoNonGodutoAdapter;
	

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
	
	@Override
	public EsitoCalcoloRimborsoVO calcolaRimborso(DatiCalcoloRimborsoVO datiCalcoloVO) throws HelperException {
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
			else {
				try {
					Date dataScadenza = DateUtil.parse(datiCalcoloVO.getDataScadenza(), DateUtil.YEAR_MONTH_NO_SEPARATOR);
				}
				catch(Exception e) {
					Tracer.error(LOG, getClass().getName(), method, "Errore nel parsing della data scadenza "  + datiCalcoloVO.getDataScadenza());
					errors.add(new ErrorDetailDto("data_scadenza", "il formato data deve essere " + DateUtil.YEAR_MONTH_NO_SEPARATOR));
				}
			}
			if(datiCalcoloVO.getMesiValidita() == null) {
				errors.add(new ErrorDetailDto("mesi_validita", "mesi validita non valorizzato"));
			}
			if (!errors.isEmpty()) {
				throw new ValidationException("Campi richiesti non valorizzati!", errors);
			}
			
			DatiCalcolo datiCalcolo =  datiCalcoloRimborsoVOAdapter.convertFrom(datiCalcoloVO);
					
					
			Utente utente = UtenteFactory.getInstance().buildByIdentificativoFiscale("AAAA");	
					
			
			EsitoCalcoloRimborso e = servizioRimborsi.calcolaRimborso(datiCalcolo, utente);
					
			Tracer.debug(LOG, getClass().getName(), method, "EsitoCalcoloRimborso\n "  +XmlSerializer.objectToXml(e));
			
			
			EsitoCalcoloRimborsoVO esito = esitoCalcoloRimborsoAdapter.convertTo(e);
			
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



	@Override
	public EsitoCalcoloRimborsoNonGodutoVO calcolaRimborso(DatiCalcoloRimborsoNonGodutoVO datiCalcoloVO) throws HelperException {
		final String method = "calcolaRimborso";
		try {
			List<ErrorDetailDto> errors = new ArrayList<>();
			
			if(datiCalcoloVO == null) {
				throw new ValidationException("dati_calcolo_rimborso_non_goduto_vo non valorizzato");
			}
			if(StringUtils.isBlank(datiCalcoloVO.getTarga())) {
				errors.add(new ErrorDetailDto("targa", "targa non valorizzata"));
			}
			if(StringUtils.isBlank(datiCalcoloVO.getTipoVeicolo())) {
				errors.add(new ErrorDetailDto("tipo_veicolo", "tipo veicolo non valorizzato"));
			}
			if(StringUtils.isBlank(datiCalcoloVO.getTipoCompensazione())) {
				errors.add(new ErrorDetailDto("tipo_compensazione", "tipo compensazione non valorizzato"));
			}
			if(datiCalcoloVO.getDataScadenza() == null) {
				errors.add(new ErrorDetailDto("data_scadenza", "data scadenza non valorizzata"));
			}
			if(datiCalcoloVO.getDataEventoChiusura() == null) {
				errors.add(new ErrorDetailDto("data_evento_chiusura", "data evento chiusura non valorizzata"));
			}
			
			
			
			else {
				try {
					Date dataScadenza = DateUtil.parse(datiCalcoloVO.getDataScadenza(), DateUtil.YEAR_MONTH_NO_SEPARATOR);
				}
				catch(Exception e) {
					Tracer.error(LOG, getClass().getName(), method, "Errore nel parsing della data scadenza "  + datiCalcoloVO.getDataScadenza());
					errors.add(new ErrorDetailDto("data_scadenza", "il formato data deve essere " + DateUtil.YEAR_MONTH_NO_SEPARATOR));
				}
			}
			if(datiCalcoloVO.getMesiValidita() == null) {
				errors.add(new ErrorDetailDto("mesi_validita", "mesi validita non valorizzato"));
			}
			if (!errors.isEmpty()) {
				throw new ValidationException("Campi richiesti non valorizzati!", errors);
			}
			
			DatiCalcolo datiCalcolo =  datiCalcoloRimborsoNonGodutoVOAdapter.convertFrom(datiCalcoloVO);
					
					
			Utente utente = UtenteFactory.getInstance().buildByIdentificativoFiscale("AAAA");	
					
			EsitoCalcoloRimborsoNonGoduto e = servizioRimborsi.calcolaRimborsoNonGoduto(datiCalcolo, utente);
					
			Tracer.debug(LOG, getClass().getName(), method, "EsitoCalcoloRimborso\n "  +XmlSerializer.objectToXml(e));
			
			
			EsitoCalcoloRimborsoNonGodutoVO esito = esitoCalcoloRimborsoNonGodutoAdapter.convertTo(e);
			
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
