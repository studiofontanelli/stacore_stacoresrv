package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto per eseguire la ricerca della posizioni")

public class VincoliRicercaPosizioniVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idVeicolo = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_veicolo") 
 
  public Long getIdVeicolo() {
    return idVeicolo;
  }
  public void setIdVeicolo(Long idVeicolo) {
    this.idVeicolo = idVeicolo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaPosizioniVO vincoliRicercaPosizioniVO = (VincoliRicercaPosizioniVO) o;
    return Objects.equals(idVeicolo, vincoliRicercaPosizioniVO.idVeicolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idVeicolo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaPosizioniVO {\n");
    
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
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

