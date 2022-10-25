package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.ImportoVO;
import it.csi.stacore.stacoresrv.api.dto.RegioneVO;
import it.csi.stacore.stacoresrv.api.dto.RiduzioneVO;
import it.csi.stacore.stacoresrv.api.dto.TipoIntermediarioVO;
import it.csi.stacore.stacoresrv.api.dto.TipoSanzionamentoVO;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto pagamento")

public class PagamentoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idPagamento = null;
  private List<RiduzioneVO> listaRiduzioni = new ArrayList<>();
  private Long idVeicolo = null;
  private RegioneVO regioneBenificiaria = null;
  private RegioneVO regioneIncasso = null;
  private String datiCalcolo = null;
  private TipoIntermediarioVO tipoIntermediario = null;
  private TipoSanzionamentoVO tipoSanzionamento = null;
  private TipoVeicoloVO tipoVeicolo = null;
  private Date dataPagamento = null;
  private String numeroRicevuta = null;
  private ImportoVO importo = null;
  private Boolean isBollettino = null;
  private String tipoIntermediarioOriginale = null;
  private String codiceIntermediarioOriginale = null;
  private String tipoSanzionamentoOriginale = null;
  private String divisaOriginale = null;
  private String identificativoFiscaleProprietarioOriginale = null;
  private String tipoVeicoloOriginale = null;
  private Boolean hasVariato = null;
  private String iuvPag = null;
  private Long idOperazioneLogica = null;
  private Long idOperazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_pagamento") 
 
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_riduzioni") 
 
  public List<RiduzioneVO> getListaRiduzioni() {
    return listaRiduzioni;
  }
  public void setListaRiduzioni(List<RiduzioneVO> listaRiduzioni) {
    this.listaRiduzioni = listaRiduzioni;
  }

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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regione_benificiaria") 
 
  public RegioneVO getRegioneBenificiaria() {
    return regioneBenificiaria;
  }
  public void setRegioneBenificiaria(RegioneVO regioneBenificiaria) {
    this.regioneBenificiaria = regioneBenificiaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regione_incasso") 
 
  public RegioneVO getRegioneIncasso() {
    return regioneIncasso;
  }
  public void setRegioneIncasso(RegioneVO regioneIncasso) {
    this.regioneIncasso = regioneIncasso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dati_calcolo") 
 
  public String getDatiCalcolo() {
    return datiCalcolo;
  }
  public void setDatiCalcolo(String datiCalcolo) {
    this.datiCalcolo = datiCalcolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_intermediario") 
 
  public TipoIntermediarioVO getTipoIntermediario() {
    return tipoIntermediario;
  }
  public void setTipoIntermediario(TipoIntermediarioVO tipoIntermediario) {
    this.tipoIntermediario = tipoIntermediario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_sanzionamento") 
 
  public TipoSanzionamentoVO getTipoSanzionamento() {
    return tipoSanzionamento;
  }
  public void setTipoSanzionamento(TipoSanzionamentoVO tipoSanzionamento) {
    this.tipoSanzionamento = tipoSanzionamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_veicolo") 
 
  public TipoVeicoloVO getTipoVeicolo() {
    return tipoVeicolo;
  }
  public void setTipoVeicolo(TipoVeicoloVO tipoVeicolo) {
    this.tipoVeicolo = tipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_pagamento") 
 
  public Date getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_ricevuta") 
 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo") 
 
  public ImportoVO getImporto() {
    return importo;
  }
  public void setImporto(ImportoVO importo) {
    this.importo = importo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_bollettino") 
 
  public Boolean isIsBollettino() {
    return isBollettino;
  }
  public void setIsBollettino(Boolean isBollettino) {
    this.isBollettino = isBollettino;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_intermediario_originale") 
 
  public String getTipoIntermediarioOriginale() {
    return tipoIntermediarioOriginale;
  }
  public void setTipoIntermediarioOriginale(String tipoIntermediarioOriginale) {
    this.tipoIntermediarioOriginale = tipoIntermediarioOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_intermediario_originale") 
 
  public String getCodiceIntermediarioOriginale() {
    return codiceIntermediarioOriginale;
  }
  public void setCodiceIntermediarioOriginale(String codiceIntermediarioOriginale) {
    this.codiceIntermediarioOriginale = codiceIntermediarioOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_sanzionamento_originale") 
 
  public String getTipoSanzionamentoOriginale() {
    return tipoSanzionamentoOriginale;
  }
  public void setTipoSanzionamentoOriginale(String tipoSanzionamentoOriginale) {
    this.tipoSanzionamentoOriginale = tipoSanzionamentoOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("divisa_originale") 
 
  public String getDivisaOriginale() {
    return divisaOriginale;
  }
  public void setDivisaOriginale(String divisaOriginale) {
    this.divisaOriginale = divisaOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identificativo_fiscale_proprietario_originale") 
 
  public String getIdentificativoFiscaleProprietarioOriginale() {
    return identificativoFiscaleProprietarioOriginale;
  }
  public void setIdentificativoFiscaleProprietarioOriginale(String identificativoFiscaleProprietarioOriginale) {
    this.identificativoFiscaleProprietarioOriginale = identificativoFiscaleProprietarioOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_veicolo_originale") 
 
  public String getTipoVeicoloOriginale() {
    return tipoVeicoloOriginale;
  }
  public void setTipoVeicoloOriginale(String tipoVeicoloOriginale) {
    this.tipoVeicoloOriginale = tipoVeicoloOriginale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("has_variato") 
 
  public Boolean isHasVariato() {
    return hasVariato;
  }
  public void setHasVariato(Boolean hasVariato) {
    this.hasVariato = hasVariato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("iuv_pag") 
 
  public String getIuvPag() {
    return iuvPag;
  }
  public void setIuvPag(String iuvPag) {
    this.iuvPag = iuvPag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_operazione_logica") 
 
  public Long getIdOperazioneLogica() {
    return idOperazioneLogica;
  }
  public void setIdOperazioneLogica(Long idOperazioneLogica) {
    this.idOperazioneLogica = idOperazioneLogica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_operazione") 
 
  public Long getIdOperazione() {
    return idOperazione;
  }
  public void setIdOperazione(Long idOperazione) {
    this.idOperazione = idOperazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoVO pagamentoVO = (PagamentoVO) o;
    return Objects.equals(idPagamento, pagamentoVO.idPagamento) &&
        Objects.equals(listaRiduzioni, pagamentoVO.listaRiduzioni) &&
        Objects.equals(idVeicolo, pagamentoVO.idVeicolo) &&
        Objects.equals(regioneBenificiaria, pagamentoVO.regioneBenificiaria) &&
        Objects.equals(regioneIncasso, pagamentoVO.regioneIncasso) &&
        Objects.equals(datiCalcolo, pagamentoVO.datiCalcolo) &&
        Objects.equals(tipoIntermediario, pagamentoVO.tipoIntermediario) &&
        Objects.equals(tipoSanzionamento, pagamentoVO.tipoSanzionamento) &&
        Objects.equals(tipoVeicolo, pagamentoVO.tipoVeicolo) &&
        Objects.equals(dataPagamento, pagamentoVO.dataPagamento) &&
        Objects.equals(numeroRicevuta, pagamentoVO.numeroRicevuta) &&
        Objects.equals(importo, pagamentoVO.importo) &&
        Objects.equals(isBollettino, pagamentoVO.isBollettino) &&
        Objects.equals(tipoIntermediarioOriginale, pagamentoVO.tipoIntermediarioOriginale) &&
        Objects.equals(codiceIntermediarioOriginale, pagamentoVO.codiceIntermediarioOriginale) &&
        Objects.equals(tipoSanzionamentoOriginale, pagamentoVO.tipoSanzionamentoOriginale) &&
        Objects.equals(divisaOriginale, pagamentoVO.divisaOriginale) &&
        Objects.equals(identificativoFiscaleProprietarioOriginale, pagamentoVO.identificativoFiscaleProprietarioOriginale) &&
        Objects.equals(tipoVeicoloOriginale, pagamentoVO.tipoVeicoloOriginale) &&
        Objects.equals(hasVariato, pagamentoVO.hasVariato) &&
        Objects.equals(iuvPag, pagamentoVO.iuvPag) &&
        Objects.equals(idOperazioneLogica, pagamentoVO.idOperazioneLogica) &&
        Objects.equals(idOperazione, pagamentoVO.idOperazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPagamento, listaRiduzioni, idVeicolo, regioneBenificiaria, regioneIncasso, datiCalcolo, tipoIntermediario, tipoSanzionamento, tipoVeicolo, dataPagamento, numeroRicevuta, importo, isBollettino, tipoIntermediarioOriginale, codiceIntermediarioOriginale, tipoSanzionamentoOriginale, divisaOriginale, identificativoFiscaleProprietarioOriginale, tipoVeicoloOriginale, hasVariato, iuvPag, idOperazioneLogica, idOperazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoVO {\n");
    
    sb.append("    idPagamento: ").append(toIndentedString(idPagamento)).append("\n");
    sb.append("    listaRiduzioni: ").append(toIndentedString(listaRiduzioni)).append("\n");
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
    sb.append("    regioneBenificiaria: ").append(toIndentedString(regioneBenificiaria)).append("\n");
    sb.append("    regioneIncasso: ").append(toIndentedString(regioneIncasso)).append("\n");
    sb.append("    datiCalcolo: ").append(toIndentedString(datiCalcolo)).append("\n");
    sb.append("    tipoIntermediario: ").append(toIndentedString(tipoIntermediario)).append("\n");
    sb.append("    tipoSanzionamento: ").append(toIndentedString(tipoSanzionamento)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    isBollettino: ").append(toIndentedString(isBollettino)).append("\n");
    sb.append("    tipoIntermediarioOriginale: ").append(toIndentedString(tipoIntermediarioOriginale)).append("\n");
    sb.append("    codiceIntermediarioOriginale: ").append(toIndentedString(codiceIntermediarioOriginale)).append("\n");
    sb.append("    tipoSanzionamentoOriginale: ").append(toIndentedString(tipoSanzionamentoOriginale)).append("\n");
    sb.append("    divisaOriginale: ").append(toIndentedString(divisaOriginale)).append("\n");
    sb.append("    identificativoFiscaleProprietarioOriginale: ").append(toIndentedString(identificativoFiscaleProprietarioOriginale)).append("\n");
    sb.append("    tipoVeicoloOriginale: ").append(toIndentedString(tipoVeicoloOriginale)).append("\n");
    sb.append("    hasVariato: ").append(toIndentedString(hasVariato)).append("\n");
    sb.append("    iuvPag: ").append(toIndentedString(iuvPag)).append("\n");
    sb.append("    idOperazioneLogica: ").append(toIndentedString(idOperazioneLogica)).append("\n");
    sb.append("    idOperazione: ").append(toIndentedString(idOperazione)).append("\n");
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

