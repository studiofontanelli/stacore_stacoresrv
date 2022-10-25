package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.FonteVO;
import it.csi.stacore.stacoresrv.api.dto.TipoAgevolazioneVO;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Agevolazione")

public class AgevolazioneVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private Long idVeicolo = null;
  private TipoVeicoloVO tipoVeicolo = null;
  private FonteVO fonte = null;
  private TipoAgevolazioneVO tipoAgevolazione = null;
  private Date dataInizio = null;
  private String numProtocolloApertura = null;
  private Date dataFine = null;
  private String numProtocolloChiusura = null;
  private String tipoVeicoloOriginale = null;
  private String targaOriginale = null;
  private String identificativoFiscaleProprietarioOriginale = null;
  private String tipoAgevolazioneOriginale = null;
  private Date dataAcquisizione = null;
  private String numeroPatente = null;
  private Date dataScadenzaPatente = null;
  private Boolean flagRicercaAg = null;
  private Long idDatiTecnici = null;
  private Long idOperazioneLogica = null;
  private Long idOperazione = null;
  private String prorogaEuro6 = null;

  /**
   * id agevolazione
   **/
  
  @ApiModelProperty(value = "id agevolazione")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * id veicolo
   **/
  
  @ApiModelProperty(value = "id veicolo")
  @JsonProperty("idVeicolo") 
 
  public Long getIdVeicolo() {
    return idVeicolo;
  }
  public void setIdVeicolo(Long idVeicolo) {
    this.idVeicolo = idVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoVeicolo") 
 
  public TipoVeicoloVO getTipoVeicolo() {
    return tipoVeicolo;
  }
  public void setTipoVeicolo(TipoVeicoloVO tipoVeicolo) {
    this.tipoVeicolo = tipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fonte") 
 
  public FonteVO getFonte() {
    return fonte;
  }
  public void setFonte(FonteVO fonte) {
    this.fonte = fonte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoAgevolazione") 
 
  public TipoAgevolazioneVO getTipoAgevolazione() {
    return tipoAgevolazione;
  }
  public void setTipoAgevolazione(TipoAgevolazioneVO tipoAgevolazione) {
    this.tipoAgevolazione = tipoAgevolazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataInizio") 
 
  public Date getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numProtocolloApertura") 
 
  public String getNumProtocolloApertura() {
    return numProtocolloApertura;
  }
  public void setNumProtocolloApertura(String numProtocolloApertura) {
    this.numProtocolloApertura = numProtocolloApertura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataFine") 
 
  public Date getDataFine() {
    return dataFine;
  }
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numProtocolloChiusura") 
 
  public String getNumProtocolloChiusura() {
    return numProtocolloChiusura;
  }
  public void setNumProtocolloChiusura(String numProtocolloChiusura) {
    this.numProtocolloChiusura = numProtocolloChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoVeicoloOriginale") 
 
  public String getTipoVeicoloOriginale() {
    return tipoVeicoloOriginale;
  }
  public void setTipoVeicoloOriginale(String tipoVeicoloOriginale) {
    this.tipoVeicoloOriginale = tipoVeicoloOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targaOriginale") 
 
  public String getTargaOriginale() {
    return targaOriginale;
  }
  public void setTargaOriginale(String targaOriginale) {
    this.targaOriginale = targaOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identificativoFiscaleProprietarioOriginale") 
 
  public String getIdentificativoFiscaleProprietarioOriginale() {
    return identificativoFiscaleProprietarioOriginale;
  }
  public void setIdentificativoFiscaleProprietarioOriginale(String identificativoFiscaleProprietarioOriginale) {
    this.identificativoFiscaleProprietarioOriginale = identificativoFiscaleProprietarioOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoAgevolazioneOriginale") 
 
  public String getTipoAgevolazioneOriginale() {
    return tipoAgevolazioneOriginale;
  }
  public void setTipoAgevolazioneOriginale(String tipoAgevolazioneOriginale) {
    this.tipoAgevolazioneOriginale = tipoAgevolazioneOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataAcquisizione") 
 
  public Date getDataAcquisizione() {
    return dataAcquisizione;
  }
  public void setDataAcquisizione(Date dataAcquisizione) {
    this.dataAcquisizione = dataAcquisizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numeroPatente") 
 
  public String getNumeroPatente() {
    return numeroPatente;
  }
  public void setNumeroPatente(String numeroPatente) {
    this.numeroPatente = numeroPatente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataScadenzaPatente") 
 
  public Date getDataScadenzaPatente() {
    return dataScadenzaPatente;
  }
  public void setDataScadenzaPatente(Date dataScadenzaPatente) {
    this.dataScadenzaPatente = dataScadenzaPatente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagRicercaAg") 
 
  public Boolean isFlagRicercaAg() {
    return flagRicercaAg;
  }
  public void setFlagRicercaAg(Boolean flagRicercaAg) {
    this.flagRicercaAg = flagRicercaAg;
  }

  /**
   * id dati tecnici
   **/
  
  @ApiModelProperty(value = "id dati tecnici")
  @JsonProperty("idDatiTecnici") 
 
  public Long getIdDatiTecnici() {
    return idDatiTecnici;
  }
  public void setIdDatiTecnici(Long idDatiTecnici) {
    this.idDatiTecnici = idDatiTecnici;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idOperazioneLogica") 
 
  public Long getIdOperazioneLogica() {
    return idOperazioneLogica;
  }
  public void setIdOperazioneLogica(Long idOperazioneLogica) {
    this.idOperazioneLogica = idOperazioneLogica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idOperazione") 
 
  public Long getIdOperazione() {
    return idOperazione;
  }
  public void setIdOperazione(Long idOperazione) {
    this.idOperazione = idOperazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prorogaEuro6") 
 
  public String getProrogaEuro6() {
    return prorogaEuro6;
  }
  public void setProrogaEuro6(String prorogaEuro6) {
    this.prorogaEuro6 = prorogaEuro6;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgevolazioneVO agevolazioneVO = (AgevolazioneVO) o;
    return Objects.equals(id, agevolazioneVO.id) &&
        Objects.equals(idVeicolo, agevolazioneVO.idVeicolo) &&
        Objects.equals(tipoVeicolo, agevolazioneVO.tipoVeicolo) &&
        Objects.equals(fonte, agevolazioneVO.fonte) &&
        Objects.equals(tipoAgevolazione, agevolazioneVO.tipoAgevolazione) &&
        Objects.equals(dataInizio, agevolazioneVO.dataInizio) &&
        Objects.equals(numProtocolloApertura, agevolazioneVO.numProtocolloApertura) &&
        Objects.equals(dataFine, agevolazioneVO.dataFine) &&
        Objects.equals(numProtocolloChiusura, agevolazioneVO.numProtocolloChiusura) &&
        Objects.equals(tipoVeicoloOriginale, agevolazioneVO.tipoVeicoloOriginale) &&
        Objects.equals(targaOriginale, agevolazioneVO.targaOriginale) &&
        Objects.equals(identificativoFiscaleProprietarioOriginale, agevolazioneVO.identificativoFiscaleProprietarioOriginale) &&
        Objects.equals(tipoAgevolazioneOriginale, agevolazioneVO.tipoAgevolazioneOriginale) &&
        Objects.equals(dataAcquisizione, agevolazioneVO.dataAcquisizione) &&
        Objects.equals(numeroPatente, agevolazioneVO.numeroPatente) &&
        Objects.equals(dataScadenzaPatente, agevolazioneVO.dataScadenzaPatente) &&
        Objects.equals(flagRicercaAg, agevolazioneVO.flagRicercaAg) &&
        Objects.equals(idDatiTecnici, agevolazioneVO.idDatiTecnici) &&
        Objects.equals(idOperazioneLogica, agevolazioneVO.idOperazioneLogica) &&
        Objects.equals(idOperazione, agevolazioneVO.idOperazione) &&
        Objects.equals(prorogaEuro6, agevolazioneVO.prorogaEuro6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idVeicolo, tipoVeicolo, fonte, tipoAgevolazione, dataInizio, numProtocolloApertura, dataFine, numProtocolloChiusura, tipoVeicoloOriginale, targaOriginale, identificativoFiscaleProprietarioOriginale, tipoAgevolazioneOriginale, dataAcquisizione, numeroPatente, dataScadenzaPatente, flagRicercaAg, idDatiTecnici, idOperazioneLogica, idOperazione, prorogaEuro6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgevolazioneVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    fonte: ").append(toIndentedString(fonte)).append("\n");
    sb.append("    tipoAgevolazione: ").append(toIndentedString(tipoAgevolazione)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    numProtocolloApertura: ").append(toIndentedString(numProtocolloApertura)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
    sb.append("    numProtocolloChiusura: ").append(toIndentedString(numProtocolloChiusura)).append("\n");
    sb.append("    tipoVeicoloOriginale: ").append(toIndentedString(tipoVeicoloOriginale)).append("\n");
    sb.append("    targaOriginale: ").append(toIndentedString(targaOriginale)).append("\n");
    sb.append("    identificativoFiscaleProprietarioOriginale: ").append(toIndentedString(identificativoFiscaleProprietarioOriginale)).append("\n");
    sb.append("    tipoAgevolazioneOriginale: ").append(toIndentedString(tipoAgevolazioneOriginale)).append("\n");
    sb.append("    dataAcquisizione: ").append(toIndentedString(dataAcquisizione)).append("\n");
    sb.append("    numeroPatente: ").append(toIndentedString(numeroPatente)).append("\n");
    sb.append("    dataScadenzaPatente: ").append(toIndentedString(dataScadenzaPatente)).append("\n");
    sb.append("    flagRicercaAg: ").append(toIndentedString(flagRicercaAg)).append("\n");
    sb.append("    idDatiTecnici: ").append(toIndentedString(idDatiTecnici)).append("\n");
    sb.append("    idOperazioneLogica: ").append(toIndentedString(idOperazioneLogica)).append("\n");
    sb.append("    idOperazione: ").append(toIndentedString(idOperazione)).append("\n");
    sb.append("    prorogaEuro6: ").append(toIndentedString(prorogaEuro6)).append("\n");
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

