package it.csi.stacore.stacoresrv.integration.dao.oracle.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.stacoresrv.integration.dao.oracle.select.TAURDEResultSet;
import it.csi.stacore.staon.business.bo.TipoVeicolo;
import it.csi.stacore.staon.business.bo.id.IdDecodifica;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoVeicolo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoVeicolo object.
   */
  public SelectTipoVeicolo() {
    super();
  }

  /**
   * Creates a new SelectTipoVeicolo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoVeicolo(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoVeicolo object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoVeicolo(IdDecodifica id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_VEICOLO", "TAU_D_TIPOVEICOLO");
  }

  /**
   * DOCUMENT ME!
   *
   * @param rs DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws SQLException DOCUMENT ME!
   */
  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new TipoVeicolo(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
