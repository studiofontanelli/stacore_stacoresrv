package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;

import java.io.Serializable;
import javax.validation.constraints.*;
public enum TipoVeicolo {
  AUTOVEICOLO,
  MOTOVEICOLO,
  RIMORCHIO,
  CICLOMOTORE,
  QUADRICICLO_LEGGERO,
  TARGA_PROVA_AUTOVEICOLO,
  TARGA_PROVA_MOTOVEICOLO,
  TARGA_PROVA_RIMORCHIO,
  TARGA_PROVA_CICLOMOTORE,
  TARGA_PROVA_QUADRICICLO_LEGGERO,
  TARGA_PROVA_AUTOSCAFO,
  TARGA_PROVA_MOTORE_FUORIBORDO;
}
