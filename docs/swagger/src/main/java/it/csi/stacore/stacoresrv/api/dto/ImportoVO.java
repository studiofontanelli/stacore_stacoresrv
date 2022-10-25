package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.ValutaVO;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto importo")

public class ImportoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private ValutaVO tassa = null;
  private ValutaVO sanzioni = null;
  private ValutaVO interessi = null;
  private ValutaVO totale = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tassa") 
 
  public ValutaVO getTassa() {
    return tassa;
  }
  public void setTassa(ValutaVO tassa) {
    this.tassa = tassa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sanzioni") 
 
  public ValutaVO getSanzioni() {
    return sanzioni;
  }
  public void setSanzioni(ValutaVO sanzioni) {
    this.sanzioni = sanzioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("interessi") 
 
  public ValutaVO getInteressi() {
    return interessi;
  }
  public void setInteressi(ValutaVO interessi) {
    this.interessi = interessi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totale") 
 
  public ValutaVO getTotale() {
    return totale;
  }
  public void setTotale(ValutaVO totale) {
    this.totale = totale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportoVO importoVO = (ImportoVO) o;
    return Objects.equals(tassa, importoVO.tassa) &&
        Objects.equals(sanzioni, importoVO.sanzioni) &&
        Objects.equals(interessi, importoVO.interessi) &&
        Objects.equals(totale, importoVO.totale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tassa, sanzioni, interessi, totale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportoVO {\n");
    
    sb.append("    tassa: ").append(toIndentedString(tassa)).append("\n");
    sb.append("    sanzioni: ").append(toIndentedString(sanzioni)).append("\n");
    sb.append("    interessi: ").append(toIndentedString(interessi)).append("\n");
    sb.append("    totale: ").append(toIndentedString(totale)).append("\n");
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

