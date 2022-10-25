package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.Nazione;
import it.csi.stacore.stacoresrv.api.dto.SearchNazioneRequest;
import it.csi.stacore.stacoresrv.business.adapter.NazioneAdapter;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.NazioneHelper;
import it.csi.stacore.stacoresrv.integration.dao.TavoleTrasversaliDAO;
import it.csi.stacore.stacoresrv.util.DateUtil;
import it.csi.stacore.stacoresrv.util.Tracer;

@Service("nazioneHelper")
public class NazioneHelperImpl extends CommonHelperImpl implements NazioneHelper {
	
	@Autowired
	private TavoleTrasversaliDAO tavoleTrasversaliDAO;
	
	@Autowired
	private NazioneAdapter nazioneAdapter;
	
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
	public Nazione getNazioneById(Long id) throws HelperException {
		final String method = "getNazioneById";
		try {
			if(id == null) {
				throw new ValidationException("ID non valorizzato");
			}
			it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione nazione = tavoleTrasversaliDAO.findNazione(id);
			if(nazione == null) {
				throw new NoDataFoundException("Nazione non trovata");
			}
			return nazioneAdapter.convertTo(nazione);
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
	public List<Nazione> findNazione(SearchNazioneRequest request) throws HelperException {
		final String method = "findNazione";
		try {
			if(request == null) {
				throw new ValidationException("Request non valorizzata");
			}
			if(StringUtils.isBlank(request.getDenomonazione())) {
				throw new ValidationException("Denominazione non valorizzata");
			}
			
			Date dataValidita =  null; 
			try {
				dataValidita = DateUtil.parse(request.getDataValidita(), DateUtil.RFC_FORMAT);
				if(dataValidita == null)
					dataValidita = DateUtil.getCurrentDate();
			}
			catch(Exception e) {
				Tracer.error(LOG, getClass().getName(), method, "Formato data non corretto "  +e);
				throw new ValidationException("La data non e' nel formato corretto  [" + DateUtil.RFC_FORMAT + "]");
			}
			String denominazioneNazione = StringUtils.upperCase(request.getDenomonazione());
			
			List<it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione> l = tavoleTrasversaliDAO.findNazione(denominazioneNazione, dataValidita);
			
			return nazioneAdapter.convertTo(l);
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
