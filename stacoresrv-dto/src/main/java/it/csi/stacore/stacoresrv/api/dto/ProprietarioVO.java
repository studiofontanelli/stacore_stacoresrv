package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.IndirizzoVO;
import it.csi.stacore.stacoresrv.api.dto.ProprietarioPFVO;
import it.csi.stacore.stacoresrv.api.dto.ProprietarioPGVO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Entità che definisce il soggetto proprietario di un veicolo")

public class ProprietarioVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private Long idGms = null;
  private Boolean personaFisica = null;
  private String identificativoFiscale = null;
  private IndirizzoVO indirizzoResidenza = null;
  private ProprietarioPGVO proprietarioPG = null;
  private ProprietarioPFVO proprietarioPF = null;
  private Date dataValidita = null;

  /**
   * pk proprietario
   **/
  
  @ApiModelProperty(value = "pk proprietario")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * id GMS
   **/
  
  @ApiModelProperty(value = "id GMS")
  @JsonProperty("idGms") 
 
  public Long getIdGms() {
    return idGms;
  }
  public void setIdGms(Long idGms) {
    this.idGms = idGms;
  }

  /**
   * se true si tratta di una persona fisica, altrimenti giuridica
   **/
  
  @ApiModelProperty(value = "se true si tratta di una persona fisica, altrimenti giuridica")
  @JsonProperty("personaFisica") 
 
  public Boolean isPersonaFisica() {
    return personaFisica;
  }
  public void setPersonaFisica(Boolean personaFisica) {
    this.personaFisica = personaFisica;
  }

  /**
   * CF/PI
   **/
  
  @ApiModelProperty(value = "CF/PI")
  @JsonProperty("identificativoFiscale") 
 
  public String getIdentificativoFiscale() {
    return identificativoFiscale;
  }
  public void setIdentificativoFiscale(String identificativoFiscale) {
    this.identificativoFiscale = identificativoFiscale;
  }

  /**
   * indirizzo
   **/
  
  @ApiModelProperty(value = "indirizzo")
  @JsonProperty("indirizzoResidenza") 
 
  public IndirizzoVO getIndirizzoResidenza() {
    return indirizzoResidenza;
  }
  public void setIndirizzoResidenza(IndirizzoVO indirizzoResidenza) {
    this.indirizzoResidenza = indirizzoResidenza;
  }

  /**
   * proprietario persona giuridica
   **/
  
  @ApiModelProperty(value = "proprietario persona giuridica")
  @JsonProperty("proprietarioPG") 
 
  public ProprietarioPGVO getProprietarioPG() {
    return proprietarioPG;
  }
  public void setProprietarioPG(ProprietarioPGVO proprietarioPG) {
    this.proprietarioPG = proprietarioPG;
  }

  /**
   * proprietario persona giuridica
   **/
  
  @ApiModelProperty(value = "proprietario persona giuridica")
  @JsonProperty("proprietarioPF") 
 
  public ProprietarioPFVO getProprietarioPF() {
    return proprietarioPF;
  }
  public void setProprietarioPF(ProprietarioPFVO proprietarioPF) {
    this.proprietarioPF = proprietarioPF;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataValidita") 
 
  public Date getDataValidita() {
    return dataValidita;
  }
  public void setDataValidita(Date dataValidita) {
    this.dataValidita = dataValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietarioVO proprietarioVO = (ProprietarioVO) o;
    return Objects.equals(id, proprietarioVO.id) &&
        Objects.equals(idGms, proprietarioVO.idGms) &&
        Objects.equals(personaFisica, proprietarioVO.personaFisica) &&
        Objects.equals(identificativoFiscale, proprietarioVO.identificativoFiscale) &&
        Objects.equals(indirizzoResidenza, proprietarioVO.indirizzoResidenza) &&
        Objects.equals(proprietarioPG, proprietarioVO.proprietarioPG) &&
        Objects.equals(proprietarioPF, proprietarioVO.proprietarioPF) &&
        Objects.equals(dataValidita, proprietarioVO.dataValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idGms, personaFisica, identificativoFiscale, indirizzoResidenza, proprietarioPG, proprietarioPF, dataValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietarioVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idGms: ").append(toIndentedString(idGms)).append("\n");
    sb.append("    personaFisica: ").append(toIndentedString(personaFisica)).append("\n");
    sb.append("    identificativoFiscale: ").append(toIndentedString(identificativoFiscale)).append("\n");
    sb.append("    indirizzoResidenza: ").append(toIndentedString(indirizzoResidenza)).append("\n");
    sb.append("    proprietarioPG: ").append(toIndentedString(proprietarioPG)).append("\n");
    sb.append("    proprietarioPF: ").append(toIndentedString(proprietarioPF)).append("\n");
    sb.append("    dataValidita: ").append(toIndentedString(dataValidita)).append("\n");
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

