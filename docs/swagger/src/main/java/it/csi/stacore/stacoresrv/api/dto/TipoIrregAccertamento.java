package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum TipoIrregAccertamento {
  MANCANTE,
  INSUFF,
  INSUFF_RITARDATO,
  RITARDATO;
}
