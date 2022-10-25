package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto per eseguire la ricerca veicolo")

public class VincoliRicercaVeicoloVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idTipoVeicolo = null;
  private String targa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_tipo_veicolo") 
 
  public Long getIdTipoVeicolo() {
    return idTipoVeicolo;
  }
  public void setIdTipoVeicolo(Long idTipoVeicolo) {
    this.idTipoVeicolo = idTipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaVeicoloVO vincoliRicercaVeicoloVO = (VincoliRicercaVeicoloVO) o;
    return Objects.equals(idTipoVeicolo, vincoliRicercaVeicoloVO.idTipoVeicolo) &&
        Objects.equals(targa, vincoliRicercaVeicoloVO.targa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoVeicolo, targa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaVeicoloVO {\n");
    
    sb.append("    idTipoVeicolo: ").append(toIndentedString(idTipoVeicolo)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
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

