package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Civico")

public class CivicoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Integer radice = null;
  private String stringaCivico = null;

  /**
   * radice
   **/
  
  @ApiModelProperty(value = "radice")
  @JsonProperty("radice") 
 
  public Integer getRadice() {
    return radice;
  }
  public void setRadice(Integer radice) {
    this.radice = radice;
  }

  /**
   * civico in formato stringa
   **/
  
  @ApiModelProperty(value = "civico in formato stringa")
  @JsonProperty("stringaCivico") 
 
  public String getStringaCivico() {
    return stringaCivico;
  }
  public void setStringaCivico(String stringaCivico) {
    this.stringaCivico = stringaCivico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CivicoVO civicoVO = (CivicoVO) o;
    return Objects.equals(radice, civicoVO.radice) &&
        Objects.equals(stringaCivico, civicoVO.stringaCivico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radice, stringaCivico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CivicoVO {\n");
    
    sb.append("    radice: ").append(toIndentedString(radice)).append("\n");
    sb.append("    stringaCivico: ").append(toIndentedString(stringaCivico)).append("\n");
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

