package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;

import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.AbstractSelect;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TAURDEResultSet;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;

public class SelectComuneByCodiceIstat extends AbstractSelect {

    private final String codiceIstat;

		public SelectComuneByCodiceIstat(String codiceIstat) {
        super();
				this.codiceIstat = codiceIstat;
    }

    public String getSQLStatement()throws InvalidSearchObjectException {
        if (codiceIstat==null) {
            throw new InvalidSearchObjectException("Parametri di ricerca errati.");
        }
        
        return super.getSQLStatement();
    }

    protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
        int iPos = 1;
        stmt.setString(iPos++, codiceIstat);
    }

		public Object createBO(TAURDEResultSet rs) throws SQLException {
	    Comune comune = new Comune(rs.getLong("ID_LUOGO"), rs.getString("DENOMINAZIONE"), rs.getString("COD_ISTAT"));
	    return comune;
		}
}