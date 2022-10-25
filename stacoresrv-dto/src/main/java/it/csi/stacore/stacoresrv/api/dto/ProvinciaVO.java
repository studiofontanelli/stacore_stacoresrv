package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Provincia")

public class ProvinciaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private String istat = null;
  private String descrizione = null;
  private String sigla = null;

  /**
   * id provincia
   **/
  
  @ApiModelProperty(value = "id provincia")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * istat provincia
   **/
  
  @ApiModelProperty(value = "istat provincia")
  @JsonProperty("istat") 
 
  public String getIstat() {
    return istat;
  }
  public void setIstat(String istat) {
    this.istat = istat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sigla") 
 
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvinciaVO provinciaVO = (ProvinciaVO) o;
    return Objects.equals(id, provinciaVO.id) &&
        Objects.equals(istat, provinciaVO.istat) &&
        Objects.equals(descrizione, provinciaVO.descrizione) &&
        Objects.equals(sigla, provinciaVO.sigla);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, istat, descrizione, sigla);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvinciaVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    istat: ").append(toIndentedString(istat)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    sigla: ").append(toIndentedString(sigla)).append("\n");
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

