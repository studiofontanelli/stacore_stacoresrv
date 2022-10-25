package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Contiene i parametri di ricerca dei comuni")

public class SearchComuneRequest  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String denomonazione = null;
  private String dataValidita = null;
  private Long idNazione = null;

  /**
   * il nome del comune 
   **/
  
  @ApiModelProperty(example = "TORINO", value = "il nome del comune ")
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
  
  @ApiModelProperty(example = "22-01-2022", value = "la data di validità nel formato DD-MM-YYYY     ")
  @JsonProperty("data_validita") 
 
  @Pattern(regexp="^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$")
  public String getDataValidita() {
    return dataValidita;
  }
  public void setDataValidita(String dataValidita) {
    this.dataValidita = dataValidita;
  }

  /**
   * id nazione
   **/
  
  @ApiModelProperty(value = "id nazione")
  @JsonProperty("id_nazione") 
 
  public Long getIdNazione() {
    return idNazione;
  }
  public void setIdNazione(Long idNazione) {
    this.idNazione = idNazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchComuneRequest searchComuneRequest = (SearchComuneRequest) o;
    return Objects.equals(denomonazione, searchComuneRequest.denomonazione) &&
        Objects.equals(dataValidita, searchComuneRequest.dataValidita) &&
        Objects.equals(idNazione, searchComuneRequest.idNazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomonazione, dataValidita, idNazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchComuneRequest {\n");
    
    sb.append("    denomonazione: ").append(toIndentedString(denomonazione)).append("\n");
    sb.append("    dataValidita: ").append(toIndentedString(dataValidita)).append("\n");
    sb.append("    idNazione: ").append(toIndentedString(idNazione)).append("\n");
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

