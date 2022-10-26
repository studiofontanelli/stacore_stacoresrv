package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Oggetto utilizzato per calcolare il rimborso")

public class DatiCalcoloRimborsoNonGodutoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String targa = null;
  private String tipoVeicolo = null;
  private String dataScadenza = null;
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
        Objects.equals(dataScadenza, datiCalcoloRimborsoNonGodutoVO.dataScadenza) &&
        Objects.equals(mesiValidita, datiCalcoloRimborsoNonGodutoVO.mesiValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targa, tipoVeicolo, dataScadenza, mesiValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiCalcoloRimborsoNonGodutoVO {\n");
    
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
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

