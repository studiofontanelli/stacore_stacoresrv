package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Contiene i parametri di ricerca delle nazioni")

public class SearchNazioneRequest  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String denomonazione = null;
  private String dataValidita = null;

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
   * la data di validità nel formato DD-MM-YYYY     
   **/
  
  @ApiModelProperty(example = "15-08-2022", value = "la data di validità nel formato DD-MM-YYYY     ")
  @JsonProperty("data_validita") 
 
  @Pattern(regexp="^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$")
  public String getDataValidita() {
    return dataValidita;
  }
  public void setDataValidita(String dataValidita) {
    this.dataValidita = dataValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchNazioneRequest searchNazioneRequest = (SearchNazioneRequest) o;
    return Objects.equals(denomonazione, searchNazioneRequest.denomonazione) &&
        Objects.equals(dataValidita, searchNazioneRequest.dataValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomonazione, dataValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchNazioneRequest {\n");
    
    sb.append("    denomonazione: ").append(toIndentedString(denomonazione)).append("\n");
    sb.append("    dataValidita: ").append(toIndentedString(dataValidita)).append("\n");
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

