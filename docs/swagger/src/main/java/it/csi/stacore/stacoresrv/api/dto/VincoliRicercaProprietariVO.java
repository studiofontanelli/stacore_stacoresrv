package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="fields applicati nella ricerca")

public class VincoliRicercaProprietariVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String identificativoFiscale = null;
  private Boolean personaFisica = null;
  private String cognome = null;
  private String nome = null;
  private Date dataNascita = null;
  private String demonimazionePG = null;

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(value = "codice fiscale")
  @JsonProperty("identificativoFiscale") 
 
  public String getIdentificativoFiscale() {
    return identificativoFiscale;
  }
  public void setIdentificativoFiscale(String identificativoFiscale) {
    this.identificativoFiscale = identificativoFiscale;
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
   * cognome persona fisica
   **/
  
  @ApiModelProperty(value = "cognome persona fisica")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * nome persona fisica
   **/
  
  @ApiModelProperty(value = "nome persona fisica")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataNascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * denominazione qualora si tratta di persona giuridica
   **/
  
  @ApiModelProperty(value = "denominazione qualora si tratta di persona giuridica")
  @JsonProperty("demonimazionePG") 
 
  public String getDemonimazionePG() {
    return demonimazionePG;
  }
  public void setDemonimazionePG(String demonimazionePG) {
    this.demonimazionePG = demonimazionePG;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VincoliRicercaProprietariVO vincoliRicercaProprietariVO = (VincoliRicercaProprietariVO) o;
    return Objects.equals(identificativoFiscale, vincoliRicercaProprietariVO.identificativoFiscale) &&
        Objects.equals(personaFisica, vincoliRicercaProprietariVO.personaFisica) &&
        Objects.equals(cognome, vincoliRicercaProprietariVO.cognome) &&
        Objects.equals(nome, vincoliRicercaProprietariVO.nome) &&
        Objects.equals(dataNascita, vincoliRicercaProprietariVO.dataNascita) &&
        Objects.equals(demonimazionePG, vincoliRicercaProprietariVO.demonimazionePG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificativoFiscale, personaFisica, cognome, nome, dataNascita, demonimazionePG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VincoliRicercaProprietariVO {\n");
    
    sb.append("    identificativoFiscale: ").append(toIndentedString(identificativoFiscale)).append("\n");
    sb.append("    personaFisica: ").append(toIndentedString(personaFisica)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    demonimazionePG: ").append(toIndentedString(demonimazionePG)).append("\n");
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

