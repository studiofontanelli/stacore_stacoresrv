package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.business.adapter.DivisaAdapter;
import it.csi.stacore.stacoresrv.business.adapter.EsitoCalcoloRimborsoNonGodutoAdapter;
import it.csi.stacore.stacoresrv.business.adapter.ImportoAdapter;
import it.csi.stacore.stacoresrv.business.adapter.ValutaAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborso;
import it.csi.stacore.staon.business.bo.EsitoCalcoloRimborsoNonGoduto;
import it.csi.stacore.staon.business.bo.Valuta;


@Component
public class EsitoCalcoloRimborsoNonGodutoAdapterImpl extends CommonDtoAdapter<EsitoCalcoloRimborsoNonGoduto, EsitoCalcoloRimborsoNonGodutoVO> 
	implements EsitoCalcoloRimborsoNonGodutoAdapter {

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
	
	@Override
	public EsitoCalcoloRimborsoNonGodutoVO convertTo(EsitoCalcoloRimborsoNonGoduto t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null) return null;
			
			
			EsitoCalcoloRimborsoNonGodutoVO esitoRimborsoVo = new  EsitoCalcoloRimborsoNonGodutoVO();
			
			
			esitoRimborsoVo.setDataUltimoGiornoUtilePagamento(t.getUltimoGiornoUtilePagamento());
			
			esitoRimborsoVo.setImportoEccedente(valutaAdapter.convertTo(t.getImportoEccedente()));
			esitoRimborsoVo.setImportoTotaleDovuto(valutaAdapter.convertTo(t.getImportoTotaleDovuto()));
			esitoRimborsoVo.setImportoTotalePagato(valutaAdapter.convertTo(t.getImportoTotalePagato()));
			esitoRimborsoVo.setImportoNonGoduto(valutaAdapter.convertTo(t.getImportoNonGoduto()));
			esitoRimborsoVo.setMensilita(t.getMensilita());
			
			
			return esitoRimborsoVo;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}



	@Override
	public EsitoCalcoloRimborsoNonGoduto convertFrom(EsitoCalcoloRimborsoNonGodutoVO v) throws DtoConversionException {
		final String method = "convertTo";
		try {
			
			Valuta importoTotaleDovuto = valutaAdapter.convertFrom(v.getImportoTotaleDovuto());
			Valuta importoTotalePagato = valutaAdapter.convertFrom(v.getImportoTotalePagato());
			Valuta importoEccedente = valutaAdapter.convertFrom(v.getImportoEccedente());
			Valuta importoNonGoduto = valutaAdapter.convertFrom(v.getImportoNonGoduto());
			Integer mensilita = v.getMensilita();
			
			EsitoCalcoloRimborsoNonGoduto esitoRimborso = new  EsitoCalcoloRimborsoNonGoduto(
					importoTotaleDovuto,importoTotalePagato, importoEccedente, importoNonGoduto, mensilita);
			esitoRimborso.setUltimoGiornoUtilePagamento(v.getDataUltimoGiornoUtilePagamento());
			return esitoRimborso;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
