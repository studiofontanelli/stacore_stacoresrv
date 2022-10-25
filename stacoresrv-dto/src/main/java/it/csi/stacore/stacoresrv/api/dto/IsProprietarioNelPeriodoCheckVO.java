package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="response true / false")

public class IsProprietarioNelPeriodoCheckVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Boolean check = null;

  /**
   * output della verifica
   **/
  
  @ApiModelProperty(value = "output della verifica")
  @JsonProperty("check") 
 
  public Boolean isCheck() {
    return check;
  }
  public void setCheck(Boolean check) {
    this.check = check;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsProprietarioNelPeriodoCheckVO isProprietarioNelPeriodoCheckVO = (IsProprietarioNelPeriodoCheckVO) o;
    return Objects.equals(check, isProprietarioNelPeriodoCheckVO.check);
  }

  @Override
  public int hashCode() {
    return Objects.hash(check);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsProprietarioNelPeriodoCheckVO {\n");
    
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
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

