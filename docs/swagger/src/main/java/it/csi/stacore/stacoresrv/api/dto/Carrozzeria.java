package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum Carrozzeria {
  CARRELLO_TRASPORTO_VEICOLI_FERROVIARI,
  RIMORCHIO_TRASPORTO_IMBARCAZIONI,
  AUTOVETTURA_SCUOLA_GUIDA,
  AUTOVEICOLO_TRASPORTO_LATTE,
  AUTOVEICOLO_TRASPORTO_CARNI_MACELLATE,
  AUTOVEICOLO_RSU,
  AUTOVEICOLO_TRASPORTO_GENERI_MONOPOLIO,
  AUTOVEICOLO_BOTTE_VUOTATURA_POZZI_NERI,
  AMBULANZA,
  AUTOVEICOLO_ESTINZIONE_INCENDI,
  AUTOCARRO_KW;
}
