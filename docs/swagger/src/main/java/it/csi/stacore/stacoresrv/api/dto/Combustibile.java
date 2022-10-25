package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum Combustibile {
  BENZ,
  CODICE_B_OLIO,
  CODICE_B_WANK,
  CODICE_ELETTR,
  CODICE_GASOL,
  CODICE_GPL,
  CODICE_B_GPL,
  CODICE_B_MET,
  CODICE_METANO,
  CODICE_MISCELA,
  CODICE_PETROLIO,
  CODICE_BENZINA_ELETTRICO,
  CODICE_GASOL_ELETTRICO,
  CODICE_BENZINA_ETANOLO,
  CODICE_GASOLIO_METANO,
  CODICE_GASOLIO_GPL,
  CODICE_GASOLIO_GAS_NATURALE_LIQUEFATTO,
  CODICE_GAS_NATURALE_LIQUEFATTO,
  CODICE_IDROGENO,
  CODICE_IDROGENO_ELETTRICO;
}
