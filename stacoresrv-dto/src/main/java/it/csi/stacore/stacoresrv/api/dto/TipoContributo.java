package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;

import java.io.Serializable;
import javax.validation.constraints.*;
public enum TipoContributo {
  TASSA_NON_DOVUTA,
  INTERESSI_SANZIONI_NON_DOVUTA,
  CONTRIBUTO_SU_IMPORTO_POSITIVO,
  CONTRIBUTO_SU_IMPORTO_NEGATIVO,
  SANZIONI_NON_DOVUTA;
}
