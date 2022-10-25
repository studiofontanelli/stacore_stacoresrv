package it.csi.stacore.stacoresrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Oggetto utilizzato per effettuare il calcolo tassa")

public class DatiCalcoloVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String denomonazione = null;
  private Date dataScadenza = null;

  /**
   * il nome della nazione 
   **/
  
  @ApiModelProperty(example = "FRANCIA", value = "il nome della nazione ")
  @JsonProperty("denomonazione") 
 
  public String getDenomonazione() {
    return denomonazione;
  }
  public void setDenomonazione(String denomonazione) {
    this.denomonazione = denomonazione;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiCalcoloVO datiCalcoloVO = (DatiCalcoloVO) o;
    return Objects.equals(denomonazione, datiCalcoloVO.denomonazione) &&
        Objects.equals(dataScadenza, datiCalcoloVO.dataScadenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomonazione, dataScadenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiCalcoloVO {\n");
    
    sb.append("    denomonazione: ").append(toIndentedString(denomonazione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
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

