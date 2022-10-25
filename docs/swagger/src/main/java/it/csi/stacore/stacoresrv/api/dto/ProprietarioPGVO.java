package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.AttivitaVO;
import it.csi.stacore.stacoresrv.api.dto.NaturaGiuridicaVO;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Entità che definisce gli attributi afferenti alla persona giuridica")

public class ProprietarioPGVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String denominazione = null;
  private String ragioneSociale = null;
  private Date dataCostituzione = null;
  private NaturaGiuridicaVO naturaGiuridica = null;
  private AttivitaVO attivita = null;

  /**
   * Denominazione Impresa
   **/
  
  @ApiModelProperty(value = "Denominazione Impresa")
  @JsonProperty("denominazione") 
 
  public String getDenominazione() {
    return denominazione;
  }
  public void setDenominazione(String denominazione) {
    this.denominazione = denominazione;
  }

  /**
   * Ragione Sociale impresa
   **/
  
  @ApiModelProperty(value = "Ragione Sociale impresa")
  @JsonProperty("ragioneSociale") 
 
  public String getRagioneSociale() {
    return ragioneSociale;
  }
  public void setRagioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataCostituzione") 
 
  public Date getDataCostituzione() {
    return dataCostituzione;
  }
  public void setDataCostituzione(Date dataCostituzione) {
    this.dataCostituzione = dataCostituzione;
  }

  /**
   * natura giuridica impresa
   **/
  
  @ApiModelProperty(value = "natura giuridica impresa")
  @JsonProperty("naturaGiuridica") 
 
  public NaturaGiuridicaVO getNaturaGiuridica() {
    return naturaGiuridica;
  }
  public void setNaturaGiuridica(NaturaGiuridicaVO naturaGiuridica) {
    this.naturaGiuridica = naturaGiuridica;
  }

  /**
   * attività impresa
   **/
  
  @ApiModelProperty(value = "attività impresa")
  @JsonProperty("attivita") 
 
  public AttivitaVO getAttivita() {
    return attivita;
  }
  public void setAttivita(AttivitaVO attivita) {
    this.attivita = attivita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietarioPGVO proprietarioPGVO = (ProprietarioPGVO) o;
    return Objects.equals(denominazione, proprietarioPGVO.denominazione) &&
        Objects.equals(ragioneSociale, proprietarioPGVO.ragioneSociale) &&
        Objects.equals(dataCostituzione, proprietarioPGVO.dataCostituzione) &&
        Objects.equals(naturaGiuridica, proprietarioPGVO.naturaGiuridica) &&
        Objects.equals(attivita, proprietarioPGVO.attivita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominazione, ragioneSociale, dataCostituzione, naturaGiuridica, attivita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietarioPGVO {\n");
    
    sb.append("    denominazione: ").append(toIndentedString(denominazione)).append("\n");
    sb.append("    ragioneSociale: ").append(toIndentedString(ragioneSociale)).append("\n");
    sb.append("    dataCostituzione: ").append(toIndentedString(dataCostituzione)).append("\n");
    sb.append("    naturaGiuridica: ").append(toIndentedString(naturaGiuridica)).append("\n");
    sb.append("    attivita: ").append(toIndentedString(attivita)).append("\n");
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

