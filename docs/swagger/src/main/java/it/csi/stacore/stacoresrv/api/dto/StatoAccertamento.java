package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum StatoAccertamento {
  NUMBER_DA_INOLTRARE,
  NUMBER_INOLTRATA,
  NUMBER_CHIUSA,
  NUMBER_ISCRITTA_A_RUOLO,
  NUMBER_RATEIZZATA,
  NUMBER_SOSPESA;
}
