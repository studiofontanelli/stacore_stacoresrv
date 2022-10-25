package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;

import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;

public class SelectComuneById extends SelectComune {

    /**
		 * @uml.property  name="idComune"
		 */
    private Long idComune = null;

    public SelectComuneById(Long idComune) {
        super();
        this.idComune = idComune;
    }

    public String getSQLStatement()throws InvalidSearchObjectException {
        if (idComune==null) {
            throw new InvalidSearchObjectException("Parametri di ricerca errati.");
        }
        
        OracleQuery q = getOracleQueryList().getQuery(getClass().getName());

        return q.getQuery();
    }

    protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
        int iPos = 1;
        stmt.setLong(iPos++, idComune);
    }
}