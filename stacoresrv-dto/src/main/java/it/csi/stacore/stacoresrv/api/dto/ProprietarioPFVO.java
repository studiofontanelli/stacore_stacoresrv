package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.LuogoVO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Entità che definisce gli attributi afferenti alla persona fisica")

public class ProprietarioPFVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String nome = null;
  private String cognome = null;
  private String sesso = null;
  private Date dataNascita = null;
  private LuogoVO luogoNascita = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
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
   * Luogo Nascita
   **/
  
  @ApiModelProperty(value = "Luogo Nascita")
  @JsonProperty("luogoNascita") 
 
  public LuogoVO getLuogoNascita() {
    return luogoNascita;
  }
  public void setLuogoNascita(LuogoVO luogoNascita) {
    this.luogoNascita = luogoNascita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietarioPFVO proprietarioPFVO = (ProprietarioPFVO) o;
    return Objects.equals(nome, proprietarioPFVO.nome) &&
        Objects.equals(cognome, proprietarioPFVO.cognome) &&
        Objects.equals(sesso, proprietarioPFVO.sesso) &&
        Objects.equals(dataNascita, proprietarioPFVO.dataNascita) &&
        Objects.equals(luogoNascita, proprietarioPFVO.luogoNascita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, sesso, dataNascita, luogoNascita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietarioPFVO {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    luogoNascita: ").append(toIndentedString(luogoNascita)).append("\n");
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

