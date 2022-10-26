package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoVO;
import it.csi.stacore.stacoresrv.api.dto.ValutaVO;
import it.csi.stacore.stacoresrv.business.adapter.DivisaAdapter;
import it.csi.stacore.stacoresrv.business.adapter.EsitoCalcoloRimborsoAdapter;
import it.csi.stacore.stacoresrv.business.adapter.ImportoAdapter;
import it.csi.stacore.stacoresrv.business.adapter.ValutaAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.Divisa;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborso;
import it.csi.stacore.staon.business.bo.Valuta;


@Component
public class EsitoCalcoloRimborsoAdapterImpl extends CommonDtoAdapter<EsitoCalcoloRimborso, EsitoCalcoloRimborsoVO> implements EsitoCalcoloRimborsoAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4970225386120426827L;
	
	@Autowired
	private ApplicationContext applicationContext;


	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Autowired
	private DivisaAdapter divisaAdapter;
	
	@Autowired
	private ImportoAdapter importoAdapter;
	
	@Autowired
	private ValutaAdapter valutaAdapter;
	
	
	public ValutaVO convertTo(Valuta t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			ValutaVO valutaVO = new  ValutaVO();
			valutaVO.setDivisa(divisaAdapter.convertTo(t.getDivisa()));
			valutaVO.setImporto(importoAdapter.convertTo(t.getImporto()));
			return valutaVO;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	public Valuta convertFrom(ValutaVO v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			Divisa divisa = divisaAdapter.convertFrom(v.getDivisa());
			return new Valuta(divisa, importoAdapter.convertFrom(v.getImporto()));
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}



	@Override
	public EsitoCalcoloRimborsoVO convertTo(EsitoCalcoloRimborso t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null) return null;
			
			EsitoCalcoloRimborsoVO esitoRimborsoVo = new  EsitoCalcoloRimborsoVO();
			esitoRimborsoVo.setCifraDaRimborsare(valutaAdapter.convertTo(t.getCifraDaRimborsare()));
			esitoRimborsoVo.setDataUltimoGiornoUtilePagamento(t.getUltimoGiornoUtilePagamento());
			esitoRimborsoVo.setImportoTotaleDovuto(valutaAdapter.convertTo(t.getImportoTotaleDovuto()));
			esitoRimborsoVo.setImportoTotalePagato(valutaAdapter.convertTo(t.getImportoTotalePagato()));
			return esitoRimborsoVo;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}



	@Override
	public EsitoCalcoloRimborso convertFrom(EsitoCalcoloRimborsoVO v) throws DtoConversionException {
		final String method = "convertTo";
		try {
			
			Valuta importoTotaleDovuto = valutaAdapter.convertFrom(v.getImportoTotaleDovuto());
			Valuta importoTotalePagato = valutaAdapter.convertFrom(v.getImportoTotalePagato());
			Valuta cifraDaRimborsare = valutaAdapter.convertFrom(v.getCifraDaRimborsare());
			
			EsitoCalcoloRimborso esitoRimborso = new  EsitoCalcoloRimborso(importoTotaleDovuto,importoTotalePagato, cifraDaRimborsare);
			esitoRimborso.setUltimoGiornoUtilePagamento(v.getDataUltimoGiornoUtilePagamento());
			return esitoRimborso;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
