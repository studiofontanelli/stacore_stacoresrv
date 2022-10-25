package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Regione")

public class RegioneVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idRegione = null;
  private String codice = null;
  private String istat = null;
  private String descrizione = null;

  /**
   * id_regione utilizzato in loadRegioneByCodice
   **/
  
  @ApiModelProperty(value = "id_regione utilizzato in loadRegioneByCodice")
  @JsonProperty("id_regione") 
 
  public Long getIdRegione() {
    return idRegione;
  }
  public void setIdRegione(Long idRegione) {
    this.idRegione = idRegione;
  }

  /**
   * codice utilizzato in loadRegioneByCodice
   **/
  
  @ApiModelProperty(value = "codice utilizzato in loadRegioneByCodice")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * istat
   **/
  
  @ApiModelProperty(value = "istat")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegioneVO regioneVO = (RegioneVO) o;
    return Objects.equals(idRegione, regioneVO.idRegione) &&
        Objects.equals(codice, regioneVO.codice) &&
        Objects.equals(istat, regioneVO.istat) &&
        Objects.equals(descrizione, regioneVO.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRegione, codice, istat, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegioneVO {\n");
    
    sb.append("    idRegione: ").append(toIndentedString(idRegione)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    istat: ").append(toIndentedString(istat)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

