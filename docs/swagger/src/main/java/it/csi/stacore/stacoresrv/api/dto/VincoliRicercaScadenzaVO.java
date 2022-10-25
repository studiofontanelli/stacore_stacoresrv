package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto per eseguire la ricerca scadenza")

public class VincoliRicercaScadenzaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idTipologiaVeicolo = null;
  private String targa = null;
  private Integer scadenza = null;
  private Integer validita = null;
  private Boolean hasBollettino = null;
  private String numeroRicevuta = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_tipologia_veicolo") 
 
  public Long getIdTipologiaVeicolo() {
    return idTipologiaVeicolo;
  }
  public void setIdTipologiaVeicolo(Long idTipologiaVeicolo) {
    this.idTipologiaVeicolo = idTipologiaVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scadenza") 
 
  public Integer getScadenza() {
    return scadenza;
  }
  public void setScadenza(Integer scadenza) {
    this.scadenza = scadenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validita") 
 
  public Integer getValidita() {
    return validita;
  }
  public void setValidita(Integer validita) {
    this.validita = validita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("has_bollettino") 
 
  public Boolean isHasBollettino() {
    return hasBollettino;
  }
  public void setHasBollettino(Boolean hasBollettino) {
    this.hasBollettino = hasBollettino;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_ricevuta") 
 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaScadenzaVO vincoliRicercaScadenzaVO = (VincoliRicercaScadenzaVO) o;
    return Objects.equals(idTipologiaVeicolo, vincoliRicercaScadenzaVO.idTipologiaVeicolo) &&
        Objects.equals(targa, vincoliRicercaScadenzaVO.targa) &&
        Objects.equals(scadenza, vincoliRicercaScadenzaVO.scadenza) &&
        Objects.equals(validita, vincoliRicercaScadenzaVO.validita) &&
        Objects.equals(hasBollettino, vincoliRicercaScadenzaVO.hasBollettino) &&
        Objects.equals(numeroRicevuta, vincoliRicercaScadenzaVO.numeroRicevuta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipologiaVeicolo, targa, scadenza, validita, hasBollettino, numeroRicevuta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaScadenzaVO {\n");
    
    sb.append("    idTipologiaVeicolo: ").append(toIndentedString(idTipologiaVeicolo)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validita: ").append(toIndentedString(validita)).append("\n");
    sb.append("    hasBollettino: ").append(toIndentedString(hasBollettino)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
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

