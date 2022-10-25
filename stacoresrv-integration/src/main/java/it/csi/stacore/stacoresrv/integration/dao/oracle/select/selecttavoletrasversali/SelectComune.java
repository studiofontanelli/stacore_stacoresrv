package it.csi.stacore.stacoresrv.integration.dao.oracle.select.selecttavoletrasversali;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.stacoresrv.integration.bo.tavoletrasversali.Comune;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.AbstractSelect;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TAURDEResultSet;
import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.stacoresrv.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.stacoresrv.integration.exception.InvalidSearchObjectException;

public class SelectComune extends AbstractSelect {

    /**
		 * @uml.property  name="comune"
		 */
    private String comune = null;
    /**
		 * @uml.property  name="dataRiferimento"
		 */
    private Date dataRiferimento = null;
    
    /**
     * @uml.property  name="codIstatRegione"
     */
    private String codIstatRegione = null;

    public SelectComune() {
        super();
    }

    public SelectComune(String comune, String codIstatRegione, Date dataRiferimento) {
        this.comune = comune;
        this.dataRiferimento = dataRiferimento;
        this.codIstatRegione = codIstatRegione;
    }

    public String getSQLStatement()throws InvalidSearchObjectException {
        if (comune==null) {
            throw new InvalidSearchObjectException("Parametri di ricerca errati.");
        }
        String query;
        
        OracleQuery q = OracleQueryList.getInstance().getQuery(
				getClass().getName());
		query = q.getBody();
		query += q.getFrom();
		query += q.getWhere();
		if (dataRiferimento != null)
			query += q.getParamWhere("dataFine");
		else 
			query += q.getParamWhere("dataInizioMaggiore");
		
		if (codIstatRegione != null)
			query += q.getParamWhere("codIstatRegione");
			
		query += q.getOrderBy();

        return query;
    }

    protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
        int iPos = 1;
        
        stmt.setUpperCaseString(iPos++, comune + "%");
        if (dataRiferimento != null){
	        stmt.setDate(iPos++, dataRiferimento);
	        stmt.setDate(iPos++, dataRiferimento);
        }
        if (codIstatRegione != null)
        	stmt.setUpperCaseString(iPos++, codIstatRegione);
    }

    public Object createBO(TAURDEResultSet rs) throws SQLException {
        Comune comune = new Comune(rs.getLong("ID_LUOGO"), rs.getString("DENOMINAZIONE"), rs.getString("COD_ISTAT"));

        String descrizioneEstesa = rs.getString("DENOMINAZIONE") +  " (" + rs.getString("SIGLA_PROVINCIA") + ")";
        comune.setDescrizioneEstesa(descrizioneEstesa);
        comune.setCapRiferimento(rs.getString("CAP"));
        comune.setProvincia(rs.getString("SIGLA_PROVINCIA"));
        comune.setCodiceCatastale(rs.getString("COD_CATASTALE"));

        return comune;
    }
}