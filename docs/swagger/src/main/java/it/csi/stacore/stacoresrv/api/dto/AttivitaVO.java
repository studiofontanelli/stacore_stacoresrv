package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class AttivitaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String codiceAteco = null;
  private String categoria = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codiceAteco") 
 
  public String getCodiceAteco() {
    return codiceAteco;
  }
  public void setCodiceAteco(String codiceAteco) {
    this.codiceAteco = codiceAteco;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoria") 
 
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttivitaVO attivitaVO = (AttivitaVO) o;
    return Objects.equals(codiceAteco, attivitaVO.codiceAteco) &&
        Objects.equals(categoria, attivitaVO.categoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceAteco, categoria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttivitaVO {\n");
    
    sb.append("    codiceAteco: ").append(toIndentedString(codiceAteco)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
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

