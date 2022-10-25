package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Comune")

public class ComuneVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private String istat = null;
  private String descrizione = null;
  private String descrizioneEstesa = null;
  private String capRiferimento = null;
  private String provincia = null;
  private String codiceCatastale = null;

  /**
   * pd comune
   **/
  
  @ApiModelProperty(value = "pd comune")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * istat comune
   **/
  
  @ApiModelProperty(value = "istat comune")
  @JsonProperty("istat") 
 
  public String getIstat() {
    return istat;
  }
  public void setIstat(String istat) {
    this.istat = istat;
  }

  /**
   * descrizione comune
   **/
  
  @ApiModelProperty(value = "descrizione comune")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * descrizione comune
   **/
  
  @ApiModelProperty(value = "descrizione comune")
  @JsonProperty("descrizioneEstesa") 
 
  public String getDescrizioneEstesa() {
    return descrizioneEstesa;
  }
  public void setDescrizioneEstesa(String descrizioneEstesa) {
    this.descrizioneEstesa = descrizioneEstesa;
  }

  /**
   * cap riferimento
   **/
  
  @ApiModelProperty(value = "cap riferimento")
  @JsonProperty("capRiferimento") 
 
  public String getCapRiferimento() {
    return capRiferimento;
  }
  public void setCapRiferimento(String capRiferimento) {
    this.capRiferimento = capRiferimento;
  }

  /**
   * provincia
   **/
  
  @ApiModelProperty(value = "provincia")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * codice catastale
   **/
  
  @ApiModelProperty(value = "codice catastale")
  @JsonProperty("codiceCatastale") 
 
  public String getCodiceCatastale() {
    return codiceCatastale;
  }
  public void setCodiceCatastale(String codiceCatastale) {
    this.codiceCatastale = codiceCatastale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComuneVO comuneVO = (ComuneVO) o;
    return Objects.equals(id, comuneVO.id) &&
        Objects.equals(istat, comuneVO.istat) &&
        Objects.equals(descrizione, comuneVO.descrizione) &&
        Objects.equals(descrizioneEstesa, comuneVO.descrizioneEstesa) &&
        Objects.equals(capRiferimento, comuneVO.capRiferimento) &&
        Objects.equals(provincia, comuneVO.provincia) &&
        Objects.equals(codiceCatastale, comuneVO.codiceCatastale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, istat, descrizione, descrizioneEstesa, capRiferimento, provincia, codiceCatastale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComuneVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    istat: ").append(toIndentedString(istat)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    descrizioneEstesa: ").append(toIndentedString(descrizioneEstesa)).append("\n");
    sb.append("    capRiferimento: ").append(toIndentedString(capRiferimento)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    codiceCatastale: ").append(toIndentedString(codiceCatastale)).append("\n");
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

