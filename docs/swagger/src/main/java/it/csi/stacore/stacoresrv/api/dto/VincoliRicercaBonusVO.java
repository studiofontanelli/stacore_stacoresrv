package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto bonus")

public class VincoliRicercaBonusVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String anno = null;
  private Long idProprietario = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anno") 
 
  public String getAnno() {
    return anno;
  }
  public void setAnno(String anno) {
    this.anno = anno;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_proprietario") 
 
  public Long getIdProprietario() {
    return idProprietario;
  }
  public void setIdProprietario(Long idProprietario) {
    this.idProprietario = idProprietario;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaBonusVO vincoliRicercaBonusVO = (VincoliRicercaBonusVO) o;
    return Objects.equals(anno, vincoliRicercaBonusVO.anno) &&
        Objects.equals(idProprietario, vincoliRicercaBonusVO.idProprietario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anno, idProprietario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaBonusVO {\n");
    
    sb.append("    anno: ").append(toIndentedString(anno)).append("\n");
    sb.append("    idProprietario: ").append(toIndentedString(idProprietario)).append("\n");
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

