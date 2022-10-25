package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto Tipo Sanzionamento")

public class TipoSanzionamentoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private DecodificaVO decodifica = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("decodifica") 
 
  public DecodificaVO getDecodifica() {
    return decodifica;
  }
  public void setDecodifica(DecodificaVO decodifica) {
    this.decodifica = decodifica;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoSanzionamentoVO tipoSanzionamentoVO = (TipoSanzionamentoVO) o;
    return Objects.equals(decodifica, tipoSanzionamentoVO.decodifica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decodifica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoSanzionamentoVO {\n");
    
    sb.append("    decodifica: ").append(toIndentedString(decodifica)).append("\n");
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

