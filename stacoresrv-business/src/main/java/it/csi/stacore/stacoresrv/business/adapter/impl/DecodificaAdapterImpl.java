package it.csi.stacore.stacoresrv.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import it.csi.stacore.stacoresrv.business.adapter.DecodificaAdapter;
import it.csi.stacore.stacoresrv.util.Tracer;
import it.csi.stacore.stacoresrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stacoresrv.util.adapter.exception.DtoConversionException;
import it.csi.stacore.staon.business.bo.Decodifica;


@Component
public class DecodificaAdapterImpl extends CommonDtoAdapter<Decodifica, DecodificaVO> implements DecodificaAdapter {

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

	
	@Override
	public DecodificaVO convertTo(Decodifica t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			DecodificaVO decodificaVO =  new DecodificaVO();
			decodificaVO.setIdDecodifica(t.getId().getId());
			decodificaVO.setCodice(t.getCodice());
			decodificaVO.setDescrizione(t.getDescrizione());
			return decodificaVO;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}


	@Override
	public Decodifica convertFrom(DecodificaVO v) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}


	
	
}
