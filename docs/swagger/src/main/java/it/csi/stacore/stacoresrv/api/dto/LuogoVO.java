package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.ComuneVO;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Luogo")

public class LuogoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private ComuneVO comune = null;
  private Long idNazione = null;
  private String nazione = null;

  /**
   * Comune
   **/
  
  @ApiModelProperty(value = "Comune")
  @JsonProperty("comune") 
 
  public ComuneVO getComune() {
    return comune;
  }
  public void setComune(ComuneVO comune) {
    this.comune = comune;
  }

  /**
   * id nazione
   **/
  
  @ApiModelProperty(value = "id nazione")
  @JsonProperty("idNazione") 
 
  public Long getIdNazione() {
    return idNazione;
  }
  public void setIdNazione(Long idNazione) {
    this.idNazione = idNazione;
  }

  /**
   * nazione
   **/
  
  @ApiModelProperty(value = "nazione")
  @JsonProperty("nazione") 
 
  public String getNazione() {
    return nazione;
  }
  public void setNazione(String nazione) {
    this.nazione = nazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LuogoVO luogoVO = (LuogoVO) o;
    return Objects.equals(comune, luogoVO.comune) &&
        Objects.equals(idNazione, luogoVO.idNazione) &&
        Objects.equals(nazione, luogoVO.nazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comune, idNazione, nazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LuogoVO {\n");
    
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    idNazione: ").append(toIndentedString(idNazione)).append("\n");
    sb.append("    nazione: ").append(toIndentedString(nazione)).append("\n");
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

