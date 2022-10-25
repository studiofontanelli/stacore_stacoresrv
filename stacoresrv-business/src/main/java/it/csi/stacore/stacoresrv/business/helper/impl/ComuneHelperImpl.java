package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.Comune;
import it.csi.stacore.stacoresrv.api.dto.SearchComuneRequest;
import it.csi.stacore.stacoresrv.business.adapter.ComuneAdapter;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.NoDataFoundException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.ComuneHelper;
import it.csi.stacore.stacoresrv.integration.dao.TavoleTrasversaliDAO;
import it.csi.stacore.stacoresrv.util.DateUtil;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.XmlSerializer;

@Service("comuneHelper")
public class ComuneHelperImpl extends CommonHelperImpl implements ComuneHelper {
	
	
	@Autowired
	private TavoleTrasversaliDAO tavoleTrasversaliDAO;
	
	@Autowired
	private ComuneAdapter comuneAdapter;
	
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
	public Comune findComune(String istat, Date data) throws HelperException {
		final String method = "findComune";
		Comune result = null;
		
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
			
			result = new Comune();
			result.setIstat(istat);
			
			return result;
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
	public Comune getComune(Long id) throws HelperException {
		final String method = "getComune";
		try {
			if(id == null) {
				throw new ValidationException("ID non valorizzato");
			}
			it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune c = tavoleTrasversaliDAO.findComune(id);
			if(c == null) {
				throw new NoDataFoundException("Comune non trovato");
			}
			return comuneAdapter.convertTo(c);
			
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
	public Comune getComuneByIstat(String istat) throws HelperException {
		final String method = "getComuneByIstat";
		try {
			if(StringUtils.isBlank(istat)) {
				throw new ValidationException("ISTAT non valorizzato");
			}
			it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune c = tavoleTrasversaliDAO.findComune(istat);
			if(c == null) {
				throw new NoDataFoundException("Comune non trovato");
			}
			c = tavoleTrasversaliDAO.findComune(c.getIdComune());
			return comuneAdapter.convertTo(c);
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
	public List<Comune> findComune(SearchComuneRequest request) throws HelperException {
		final String method = "findComune";
		try {
			if(request == null) {
				throw new ValidationException("Request non valorizzata");
			}
			if(StringUtils.isBlank(request.getDenomonazione())) {
				throw new ValidationException("Denominazione non valorizzata");
			}
			
			String denominazioneComune = StringUtils.upperCase(request.getDenomonazione());
			String istatRegione = null;
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
			
			List<it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune> list = tavoleTrasversaliDAO.findComune(denominazioneComune, istatRegione, dataValidita);
			
			return comuneAdapter.convertTo(list);
			
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
