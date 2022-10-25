package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum Fonte {
  DTT,
  PRA,
  RIV,
  SGATA,
  POSTE,
  RISC,
  REG,
  NN;
}
