package it.csi.stacore.stacoresrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Oggetto utilizzato per calcolare il rimborso")

public class DatiCalcoloRimborsoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String targa = null;
  private String tipoVeicolo = null;
  private Date dataScadenza = null;
  private Integer mesiValidita = null;
  private Date dataRiferimento = null;

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
   * la data di scadenza nel formato DD-MM-YYYY     
   **/
  
  @ApiModelProperty(example = "15-08-2022", value = "la data di scadenza nel formato DD-MM-YYYY     ")
  @JsonProperty("data_scadenza") 
 
  public Date getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(Date dataScadenza) {
    this.dataScadenza = dataScadenza;
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

  /**
   * la data di riferimento nel formato DD-MM-YYYY     
   **/
  
  @ApiModelProperty(example = "15-08-2022", value = "la data di riferimento nel formato DD-MM-YYYY     ")
  @JsonProperty("data_riferimento") 
 
  public Date getDataRiferimento() {
    return dataRiferimento;
  }
  public void setDataRiferimento(Date dataRiferimento) {
    this.dataRiferimento = dataRiferimento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiCalcoloRimborsoVO datiCalcoloRimborsoVO = (DatiCalcoloRimborsoVO) o;
    return Objects.equals(targa, datiCalcoloRimborsoVO.targa) &&
        Objects.equals(tipoVeicolo, datiCalcoloRimborsoVO.tipoVeicolo) &&
        Objects.equals(dataScadenza, datiCalcoloRimborsoVO.dataScadenza) &&
        Objects.equals(mesiValidita, datiCalcoloRimborsoVO.mesiValidita) &&
        Objects.equals(dataRiferimento, datiCalcoloRimborsoVO.dataRiferimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targa, tipoVeicolo, dataScadenza, mesiValidita, dataRiferimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiCalcoloRimborsoVO {\n");
    
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    mesiValidita: ").append(toIndentedString(mesiValidita)).append("\n");
    sb.append("    dataRiferimento: ").append(toIndentedString(dataRiferimento)).append("\n");
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

