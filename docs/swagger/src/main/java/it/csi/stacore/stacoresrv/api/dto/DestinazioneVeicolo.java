package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import java.io.Serializable;
import javax.validation.constraints.*;
public enum DestinazioneVeicolo {
  AUTOVEICOLO_IN_SERVIZIO_PUBBLICO_DI_LINEA_INTEGRATIVO,
  AUTOVEICOLO_USO_ESCLUSIVO_DI_POLIZIA,
  AUTOVETTURA_PER_TRASPORTO_DI_PERSONE,
  AUTOBUS_PER_TRASPORTO_DI_PERSONE,
  AUTOCARRO_PER_TRASPORTO_DI_COSE,
  AUTOCARAVAN,
  AUTOVEICOLO_PER_USO_SPECIALE,
  TRAS_SPECIFICO_PERSONE_PART_CONDIZIONI,
  AUTOVEICOLO_TRASPORTO_PROMISCUO_PERSONE_COSE,
  TRATTORE_STRADALE_PER_RIMORCHIO,
  TRATTORE_PER_SEMIRIMORCHIO,
  AUTOVEICOLO_PER_TRASPORTO_SPECIFICO,
  QUADRICICLO_PER_TRASP_DI_PERSONE,
  QUADRICICLO_PER_TRASP_DI_COSE,
  QUADRICICLO_PER_USO_SPECIALE,
  QUADRICICLO_TRASP_SPECIFICO,
  MOTOVEICOLO_USO_ESCLUSIVO_DI_POLIZIA,
  TRICICLO_PER_TRASPORTO_PROMISCUO,
  TRICICLO_PER_USO_SPECIALE,
  TRICICLO_PER_TRASPORTO_SPECIFICO,
  MOTOCICLO_PER_TRASPORTO_PERSONE,
  TRICICLO_PER_TRASPORTO_COSE,
  TRICICLO_PER_TRASPORTO_DI_PERSONE,
  SEMIRIMORCHIO_PER_TRASPORTO_SPECIFICO,
  SEMIRIMORCHIO_PER_TRASPORTO_COSE,
  RIMORCHIO_PER_TRASPORTO_ATTREZZATURE_TURISTICHE_E_SPORTIVE,
  RIMORCHIO_PER_TRASPORTI_SPECIFICI,
  SEMIRIMORCHIO_PER_TRASPORTO_PERSONE,
  RIMORCHIO_PER_TRASPORTO_COSE,
  CARAVAN,
  RIMORCHIO_PER_TRASPORTO_PERSONE,
  RIMORCHIO_PER_USO_SPECIALE,
  SEMIRIMORCHIO_PER_USO_SPECIALE;
}