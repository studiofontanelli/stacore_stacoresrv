package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="fields applicati nella ricerca. Aggiunti secondo logica AND")

public class VincoliRicercaAgevolazioniVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private List<String> targa = new ArrayList<>();
  private String tipoVeicoloOriginale = null;
  private String identificativoFiscaleProprietarioOriginale = null;
  private String numProtocolloApertura = null;
  private Long idTipoVeicolo = null;
  private Long idTipoAgevolazione = null;

  /**
   * targa del veicolo
   **/
  
  @ApiModelProperty(value = "targa del veicolo")
  @JsonProperty("targa") 
 
  public List<String> getTarga() {
    return targa;
  }
  public void setTarga(List<String> targa) {
    this.targa = targa;
  }

  /**
   * tipo veicolo
   **/
  
  @ApiModelProperty(value = "tipo veicolo")
  @JsonProperty("tipoVeicoloOriginale") 
 
  public String getTipoVeicoloOriginale() {
    return tipoVeicoloOriginale;
  }
  public void setTipoVeicoloOriginale(String tipoVeicoloOriginale) {
    this.tipoVeicoloOriginale = tipoVeicoloOriginale;
  }

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(value = "codice fiscale")
  @JsonProperty("identificativoFiscaleProprietarioOriginale") 
 
  public String getIdentificativoFiscaleProprietarioOriginale() {
    return identificativoFiscaleProprietarioOriginale;
  }
  public void setIdentificativoFiscaleProprietarioOriginale(String identificativoFiscaleProprietarioOriginale) {
    this.identificativoFiscaleProprietarioOriginale = identificativoFiscaleProprietarioOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numProtocolloApertura") 
 
  public String getNumProtocolloApertura() {
    return numProtocolloApertura;
  }
  public void setNumProtocolloApertura(String numProtocolloApertura) {
    this.numProtocolloApertura = numProtocolloApertura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idTipoVeicolo") 
 
  public Long getIdTipoVeicolo() {
    return idTipoVeicolo;
  }
  public void setIdTipoVeicolo(Long idTipoVeicolo) {
    this.idTipoVeicolo = idTipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idTipoAgevolazione") 
 
  public Long getIdTipoAgevolazione() {
    return idTipoAgevolazione;
  }
  public void setIdTipoAgevolazione(Long idTipoAgevolazione) {
    this.idTipoAgevolazione = idTipoAgevolazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaAgevolazioniVO vincoliRicercaAgevolazioniVO = (VincoliRicercaAgevolazioniVO) o;
    return Objects.equals(targa, vincoliRicercaAgevolazioniVO.targa) &&
        Objects.equals(tipoVeicoloOriginale, vincoliRicercaAgevolazioniVO.tipoVeicoloOriginale) &&
        Objects.equals(identificativoFiscaleProprietarioOriginale, vincoliRicercaAgevolazioniVO.identificativoFiscaleProprietarioOriginale) &&
        Objects.equals(numProtocolloApertura, vincoliRicercaAgevolazioniVO.numProtocolloApertura) &&
        Objects.equals(idTipoVeicolo, vincoliRicercaAgevolazioniVO.idTipoVeicolo) &&
        Objects.equals(idTipoAgevolazione, vincoliRicercaAgevolazioniVO.idTipoAgevolazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targa, tipoVeicoloOriginale, identificativoFiscaleProprietarioOriginale, numProtocolloApertura, idTipoVeicolo, idTipoAgevolazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaAgevolazioniVO {\n");
    
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoVeicoloOriginale: ").append(toIndentedString(tipoVeicoloOriginale)).append("\n");
    sb.append("    identificativoFiscaleProprietarioOriginale: ").append(toIndentedString(identificativoFiscaleProprietarioOriginale)).append("\n");
    sb.append("    numProtocolloApertura: ").append(toIndentedString(numProtocolloApertura)).append("\n");
    sb.append("    idTipoVeicolo: ").append(toIndentedString(idTipoVeicolo)).append("\n");
    sb.append("    idTipoAgevolazione: ").append(toIndentedString(idTipoAgevolazione)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

