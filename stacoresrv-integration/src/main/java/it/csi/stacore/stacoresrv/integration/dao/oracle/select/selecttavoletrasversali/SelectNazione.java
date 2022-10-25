package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.stacoresrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Nazione;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.AbstractSelect;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TAURDEResultSet;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;


public class SelectNazione extends AbstractSelect {

	/**
	 * @uml.property  name="dataRiferimento"
	 */
	private Date dataRiferimento = null;

	/**
	 * @uml.property  name="nazione"
	 */
	private String nazione = null;

	public SelectNazione() {
		super();

	}

	public SelectNazione(String nazione, Date dataRiferimento) {
		this.nazione = nazione;
		this.dataRiferimento = dataRiferimento;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		if (dataRiferimento == null) {
			throw new InvalidSearchObjectException("Parametri di ricerca errati.");
		}
		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());

		String query = q.getBody() + q.getWhere();

		if (nazione != null && nazione.length() > 0) {
			query += q.getParamWhere("nazione");
		}

		query += q.getOrderBy();

		return query;
	}

	protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
		int iPos = 1;
		stmt.setDate(iPos++, dataRiferimento);

		if (nazione != null && nazione.length() > 0) {
			stmt.setUpperCaseString(iPos++, nazione + "%");
		}
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		IdDecodifica idDecodifica = new IdDecodifica(rs.getLong("ID_NAZIONE").longValue());
		Nazione nazione = new Nazione(idDecodifica, rs.getString("DESC_NAZIONE"));
		return nazione;
	}
}
