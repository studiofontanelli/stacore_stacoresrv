package it.csi.stacore.stacoresrv.business.helper.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stacoresrv.api.dto.Provincia;
import it.csi.stacore.stacoresrv.business.adapter.ProvinciaAdapter;
import it.csi.stacore.stacoresrv.business.exception.HelperException;
import it.csi.stacore.stacoresrv.business.exception.ValidationException;
import it.csi.stacore.stacoresrv.business.helper.ProvinciaHelper;
import it.csi.stacore.stacoresrv.integration.dao.TavoleTrasversaliDAO;
import it.csi.stacore.stacoresrv.util.Tracer;

@Service("provinciaHelper")
public class PrivinciaHelperImpl extends CommonHelperImpl implements ProvinciaHelper {

	
	private final String CODICE_ISTAT_REGIONE_PIEMONTE = "01";
	
	@Autowired
	private TavoleTrasversaliDAO tavoleTrasversaliDAO;

	@Autowired
	private ProvinciaAdapter provinciaAdapter;

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
	public List<Provincia> findProvince(String searchType) throws HelperException {
		final String method = "findAllProvince";
		try {
			if(StringUtils.isBlank(searchType)) {
				throw new ValidationException("search_type non valorizzato");
			}
			
			String st = StringUtils.upperCase(searchType);
			try {
				SearchType.valueOf(st);
			}
			catch(Exception e) {
				throw new ValidationException("valore search_type non corretto");
			}
			
			List<it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Provincia> result = null;
			
			if(StringUtils.equals(SearchType.ALL.toString(), st)) {
				result = tavoleTrasversaliDAO.findProvince();
				
			}
			else if(StringUtils.equals(SearchType.PIEMONTE.toString(), st)) {
				result = tavoleTrasversaliDAO.findProvince(CODICE_ISTAT_REGIONE_PIEMONTE);
				
			}
			return provinciaAdapter.convertTo(result);
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
