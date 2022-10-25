package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.CivicoVO;
import it.csi.stacore.stacoresrv.api.dto.ComuneVO;
import it.csi.stacore.stacoresrv.api.dto.ProvinciaVO;
import it.csi.stacore.stacoresrv.api.dto.RegioneVO;
import it.csi.stacore.stacoresrv.api.dto.TipoIndirizzoVO;
import it.csi.stacore.stacoresrv.api.dto.ViaVO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Indirizzo")

public class IndirizzoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Boolean luogoNazionale = null;
  private TipoIndirizzoVO tipoIndirizzo = null;
  private ViaVO via = null;
  private CivicoVO civico = null;
  private String cap = null;
  private ComuneVO comune = null;
  private ProvinciaVO provincia = null;
  private RegioneVO regione = null;
  private String fonteProvenienza = null;
  private String fonteRiferimento = null;
  private Date dataValidita = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("luogoNazionale") 
 
  public Boolean isLuogoNazionale() {
    return luogoNazionale;
  }
  public void setLuogoNazionale(Boolean luogoNazionale) {
    this.luogoNazionale = luogoNazionale;
  }

  /**
   * Tipo Indirizzo
   **/
  
  @ApiModelProperty(value = "Tipo Indirizzo")
  @JsonProperty("tipoIndirizzo") 
 
  public TipoIndirizzoVO getTipoIndirizzo() {
    return tipoIndirizzo;
  }
  public void setTipoIndirizzo(TipoIndirizzoVO tipoIndirizzo) {
    this.tipoIndirizzo = tipoIndirizzo;
  }

  /**
   * Via
   **/
  
  @ApiModelProperty(value = "Via")
  @JsonProperty("via") 
 
  public ViaVO getVia() {
    return via;
  }
  public void setVia(ViaVO via) {
    this.via = via;
  }

  /**
   * Il Civico
   **/
  
  @ApiModelProperty(value = "Il Civico")
  @JsonProperty("civico") 
 
  public CivicoVO getCivico() {
    return civico;
  }
  public void setCivico(CivicoVO civico) {
    this.civico = civico;
  }

  /**
   * il CAP
   **/
  
  @ApiModelProperty(value = "il CAP")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune") 
 
  public ComuneVO getComune() {
    return comune;
  }
  public void setComune(ComuneVO comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provincia") 
 
  public ProvinciaVO getProvincia() {
    return provincia;
  }
  public void setProvincia(ProvinciaVO provincia) {
    this.provincia = provincia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regione") 
 
  public RegioneVO getRegione() {
    return regione;
  }
  public void setRegione(RegioneVO regione) {
    this.regione = regione;
  }

  /**
   * Fonte provenienza
   **/
  
  @ApiModelProperty(value = "Fonte provenienza")
  @JsonProperty("fonteProvenienza") 
 
  public String getFonteProvenienza() {
    return fonteProvenienza;
  }
  public void setFonteProvenienza(String fonteProvenienza) {
    this.fonteProvenienza = fonteProvenienza;
  }

  /**
   * Fonte riferimento
   **/
  
  @ApiModelProperty(value = "Fonte riferimento")
  @JsonProperty("fonteRiferimento") 
 
  public String getFonteRiferimento() {
    return fonteRiferimento;
  }
  public void setFonteRiferimento(String fonteRiferimento) {
    this.fonteRiferimento = fonteRiferimento;
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
    IndirizzoVO indirizzoVO = (IndirizzoVO) o;
    return Objects.equals(luogoNazionale, indirizzoVO.luogoNazionale) &&
        Objects.equals(tipoIndirizzo, indirizzoVO.tipoIndirizzo) &&
        Objects.equals(via, indirizzoVO.via) &&
        Objects.equals(civico, indirizzoVO.civico) &&
        Objects.equals(cap, indirizzoVO.cap) &&
        Objects.equals(comune, indirizzoVO.comune) &&
        Objects.equals(provincia, indirizzoVO.provincia) &&
        Objects.equals(regione, indirizzoVO.regione) &&
        Objects.equals(fonteProvenienza, indirizzoVO.fonteProvenienza) &&
        Objects.equals(fonteRiferimento, indirizzoVO.fonteRiferimento) &&
        Objects.equals(dataValidita, indirizzoVO.dataValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(luogoNazionale, tipoIndirizzo, via, civico, cap, comune, provincia, regione, fonteProvenienza, fonteRiferimento, dataValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirizzoVO {\n");
    
    sb.append("    luogoNazionale: ").append(toIndentedString(luogoNazionale)).append("\n");
    sb.append("    tipoIndirizzo: ").append(toIndentedString(tipoIndirizzo)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    regione: ").append(toIndentedString(regione)).append("\n");
    sb.append("    fonteProvenienza: ").append(toIndentedString(fonteProvenienza)).append("\n");
    sb.append("    fonteRiferimento: ").append(toIndentedString(fonteRiferimento)).append("\n");
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

