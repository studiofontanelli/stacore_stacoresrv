package it.csi.stacore.stacoresrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Oggetto utilizzato per calcolare il rimborso")

public class DatiCalcoloRimborsoNonGodutoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String targa = null;
  private String tipoVeicolo = null;
  private String tipoCompensazione = null;
  private String dataScadenza = null;
  private Date dataEventoChiusura = null;
  private Integer mesiValidita = null;

  /**
   * la targa del veicolo 
   **/
  
  @ApiModelProperty(value = "la targa del veicolo ")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   * Il codice tipo veicolo (A &#x3D; Autoveicolo, M&#x3D; Motoveicolo, ecc ) 
   **/
  
  @ApiModelProperty(value = "Il codice tipo veicolo (A = Autoveicolo, M= Motoveicolo, ecc ) ")
  @JsonProperty("tipo_veicolo") 
 
  public String getTipoVeicolo() {
    return tipoVeicolo;
  }
  public void setTipoVeicolo(String tipoVeicolo) {
    this.tipoVeicolo = tipoVeicolo;
  }

  /**
   * Il codice tipo compensazione  
   **/
  
  @ApiModelProperty(example = "(P = ROTTAMAZIONE CON PERMUTA)", value = "Il codice tipo compensazione  ")
  @JsonProperty("tipo_compensazione") 
 
  public String getTipoCompensazione() {
    return tipoCompensazione;
  }
  public void setTipoCompensazione(String tipoCompensazione) {
    this.tipoCompensazione = tipoCompensazione;
  }

  /**
   * la data di scadenza nel formato YYYYMM     
   **/
  
  @ApiModelProperty(example = "202212", value = "la data di scadenza nel formato YYYYMM     ")
  @JsonProperty("data_scadenza") 
 
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * data nel formato YYYY-MM-DD 
   **/
  
  @ApiModelProperty(example = "2017-07-21T00:00:00.000+0000", value = "data nel formato YYYY-MM-DD ")
  @JsonProperty("data_evento_chiusura") 
 
  public Date getDataEventoChiusura() {
    return dataEventoChiusura;
  }
  public void setDataEventoChiusura(Date dataEventoChiusura) {
    this.dataEventoChiusura = dataEventoChiusura;
  }

  /**
   * i mesi di validità ( 12 per validità annuale)
   **/
  
  @ApiModelProperty(value = "i mesi di validità ( 12 per validità annuale)")
  @JsonProperty("mesi_validita") 
 
  public Integer getMesiValidita() {
    return mesiValidita;
  }
  public void setMesiValidita(Integer mesiValidita) {
    this.mesiValidita = mesiValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiCalcoloRimborsoNonGodutoVO datiCalcoloRimborsoNonGodutoVO = (DatiCalcoloRimborsoNonGodutoVO) o;
    return Objects.equals(targa, datiCalcoloRimborsoNonGodutoVO.targa) &&
        Objects.equals(tipoVeicolo, datiCalcoloRimborsoNonGodutoVO.tipoVeicolo) &&
        Objects.equals(tipoCompensazione, datiCalcoloRimborsoNonGodutoVO.tipoCompensazione) &&
        Objects.equals(dataScadenza, datiCalcoloRimborsoNonGodutoVO.dataScadenza) &&
        Objects.equals(dataEventoChiusura, datiCalcoloRimborsoNonGodutoVO.dataEventoChiusura) &&
        Objects.equals(mesiValidita, datiCalcoloRimborsoNonGodutoVO.mesiValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targa, tipoVeicolo, tipoCompensazione, dataScadenza, dataEventoChiusura, mesiValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiCalcoloRimborsoNonGodutoVO {\n");
    
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    tipoCompensazione: ").append(toIndentedString(tipoCompensazione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    dataEventoChiusura: ").append(toIndentedString(dataEventoChiusura)).append("\n");
    sb.append("    mesiValidita: ").append(toIndentedString(mesiValidita)).append("\n");
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

