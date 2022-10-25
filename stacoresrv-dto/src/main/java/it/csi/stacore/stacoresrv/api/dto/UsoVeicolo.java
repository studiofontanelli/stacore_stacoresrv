package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;

import java.io.Serializable;
import javax.validation.constraints.*;
public enum UsoVeicolo {
  PROPRIO,
  TERZI_DA_NOLEGGIO_CON_CONDUC,
  TERZI_DA_LOCARE_SENZA_CONDUC,
  DI_TERZI,
  PROPRIO_4,
  PROPRIO_5,
  DI_TERZI_CON_AUTORIZZAZIONI_VINCOLATE,
  DI_TERZI_CON_AUTORIZZAZIONE_LIBERA,
  USO_SPECIALE,
  PRIV_LOCAZIONE_FAC_COMPERA;
}
