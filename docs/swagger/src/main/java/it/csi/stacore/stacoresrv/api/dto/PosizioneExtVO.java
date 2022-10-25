package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.PosizioneVO;
import it.csi.stacore.stacoresrv.api.dto.ProprietarioVO;
import it.csi.stacore.stacoresrv.api.dto.VeicoloVO;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Posizione Ext")

public class PosizioneExtVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private PosizioneVO posizione = null;
  private ProprietarioVO proprietario = null;
  private VeicoloVO veicolo = null;
  private String idComunicazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("posizione") 
 
  public PosizioneVO getPosizione() {
    return posizione;
  }
  public void setPosizione(PosizioneVO posizione) {
    this.posizione = posizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("proprietario") 
 
  public ProprietarioVO getProprietario() {
    return proprietario;
  }
  public void setProprietario(ProprietarioVO proprietario) {
    this.proprietario = proprietario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veicolo") 
 
  public VeicoloVO getVeicolo() {
    return veicolo;
  }
  public void setVeicolo(VeicoloVO veicolo) {
    this.veicolo = veicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idComunicazione") 
 
  public String getIdComunicazione() {
    return idComunicazione;
  }
  public void setIdComunicazione(String idComunicazione) {
    this.idComunicazione = idComunicazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosizioneExtVO posizioneExtVO = (PosizioneExtVO) o;
    return Objects.equals(posizione, posizioneExtVO.posizione) &&
        Objects.equals(proprietario, posizioneExtVO.proprietario) &&
        Objects.equals(veicolo, posizioneExtVO.veicolo) &&
        Objects.equals(idComunicazione, posizioneExtVO.idComunicazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posizione, proprietario, veicolo, idComunicazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosizioneExtVO {\n");
    
    sb.append("    posizione: ").append(toIndentedString(posizione)).append("\n");
    sb.append("    proprietario: ").append(toIndentedString(proprietario)).append("\n");
    sb.append("    veicolo: ").append(toIndentedString(veicolo)).append("\n");
    sb.append("    idComunicazione: ").append(toIndentedString(idComunicazione)).append("\n");
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

