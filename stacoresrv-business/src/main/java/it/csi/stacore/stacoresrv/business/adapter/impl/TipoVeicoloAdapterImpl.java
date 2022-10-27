package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.stacoresrv.business.adapter.DecodificaAdapter;
import it.csi.stacore.stacoresrv.business.adapter.TipoVeicoloAdapter;
import it.csi.stacore.stacoresrv.business.helper.DecodificaHelper;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.TipoVeicolo;
import it.csi.stacore.staon.business.bo.id.IdDecodifica;


@Component
public class TipoVeicoloAdapterImpl extends CommonDtoAdapter<TipoVeicolo, TipoVeicoloVO> implements TipoVeicoloAdapter {

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
	private DecodificaAdapter decodificaAdapter;
	
	
	@Override
	public TipoVeicoloVO convertTo(TipoVeicolo t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			TipoVeicoloVO tipoVeicoloVO =  new TipoVeicoloVO();
			tipoVeicoloVO.setDecodifica(decodificaAdapter.convertTo(t));
			return tipoVeicoloVO;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public TipoVeicolo convertFrom(TipoVeicoloVO v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			return new TipoVeicolo(new IdDecodifica(v.getDecodifica().getIdDecodifica()), v.getDecodifica().getCodice(), v.getDecodifica().getDescrizione());
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	
	
}
