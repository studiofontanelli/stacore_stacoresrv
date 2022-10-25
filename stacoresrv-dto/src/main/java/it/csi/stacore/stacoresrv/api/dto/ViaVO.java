package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Via")

public class ViaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String sedime = null;
  private String nomeVia = null;
  private String valoreCompleto = null;

  /**
   * Sedime
   **/
  
  @ApiModelProperty(value = "Sedime")
  @JsonProperty("sedime") 
 
  public String getSedime() {
    return sedime;
  }
  public void setSedime(String sedime) {
    this.sedime = sedime;
  }

  /**
   * nomeVia
   **/
  
  @ApiModelProperty(value = "nomeVia")
  @JsonProperty("nomeVia") 
 
  public String getNomeVia() {
    return nomeVia;
  }
  public void setNomeVia(String nomeVia) {
    this.nomeVia = nomeVia;
  }

  /**
   * valoreCompleto
   **/
  
  @ApiModelProperty(value = "valoreCompleto")
  @JsonProperty("valoreCompleto") 
 
  public String getValoreCompleto() {
    return valoreCompleto;
  }
  public void setValoreCompleto(String valoreCompleto) {
    this.valoreCompleto = valoreCompleto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViaVO viaVO = (ViaVO) o;
    return Objects.equals(sedime, viaVO.sedime) &&
        Objects.equals(nomeVia, viaVO.nomeVia) &&
        Objects.equals(valoreCompleto, viaVO.valoreCompleto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sedime, nomeVia, valoreCompleto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViaVO {\n");
    
    sb.append("    sedime: ").append(toIndentedString(sedime)).append("\n");
    sb.append("    nomeVia: ").append(toIndentedString(nomeVia)).append("\n");
    sb.append("    valoreCompleto: ").append(toIndentedString(valoreCompleto)).append("\n");
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

