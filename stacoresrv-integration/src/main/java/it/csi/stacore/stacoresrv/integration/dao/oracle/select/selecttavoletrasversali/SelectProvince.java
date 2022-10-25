package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;

import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Provincia;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.AbstractSelect;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TAURDEResultSet;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;

public class SelectProvince extends AbstractSelect {

    private String codIstatRegione = null;

    public SelectProvince() {
        super();
    }

    public SelectProvince(String codIstatRegione) {
        this.codIstatRegione = codIstatRegione;
    }

    public String getSQLStatement() throws InvalidSearchObjectException {
        OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());
        String query = q.getBody() + q.getFrom();
        if (codIstatRegione != null && codIstatRegione.length() > 0) {
            query += q.getWhere();
            query += q.getParamWhere("idRegione");
        }
        query += q.getOrderBy();
        return query;
    }

    protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
        if (codIstatRegione != null && codIstatRegione.length() > 0)
            stmt.setUpperCaseString(1, codIstatRegione);
    }

    public Object createBO(TAURDEResultSet rs) throws SQLException {
        Long id = rs.getLong("ID");
        String codice = rs.getString("CODICE");
        String descrizione = rs.getString("DESCRIZIONE");
        String istat = rs.getString("ISTAT");
        return new Provincia(id, codice, descrizione, istat);
    }
}
