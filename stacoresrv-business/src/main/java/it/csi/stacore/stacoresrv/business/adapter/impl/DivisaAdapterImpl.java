package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.DivisaVO;
import it.csi.stacore.stacoresrv.business.adapter.DecodificaAdapter;
import it.csi.stacore.stacoresrv.business.adapter.DivisaAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.Divisa;
import it.csi.stacore.staon.business.bo.id.IdDecodifica;


@Component
public class DivisaAdapterImpl extends CommonDtoAdapter<Divisa, DivisaVO> implements DivisaAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4970225386120426827L;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private DecodificaAdapter decodificaAdapter;


	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	@Override
	public DivisaVO convertTo(Divisa t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			DivisaVO divisaVo =  new DivisaVO();
			divisaVo.setDecodifica(decodificaAdapter.convertTo(t));
			return divisaVo;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public Divisa convertFrom(DivisaVO v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			return new Divisa(new IdDecodifica(v.getDecodifica().getIdDecodifica()), v.getDecodifica().getCodice(), v.getDecodifica().getDescrizione());
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
