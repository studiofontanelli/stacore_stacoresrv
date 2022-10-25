package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;

import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;

public class SelectNazioneById extends SelectNazione {

	/**
	 * @uml.property  name="idNazione"
	 */
	private Long idNazione = null;

	public SelectNazioneById(Long idNazione) {
		super();
		this.idNazione = idNazione;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		if (idNazione == null) {
			throw new InvalidSearchObjectException("Parametri di ricerca errati.");
		}
		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());

		String query = q.getBody() + q.getWhere();

		return query;
	}

	protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
		int iPos = 1;
		stmt.setLong(iPos++, idNazione);
	}
}