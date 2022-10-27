package it.csi.stacore.stacoresrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Il risultato ottenuto dal calcola rimborso")

public class EsitoCalcoloRimborsoNonGodutoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private ValutaVO importoTotaleDovuto = null;
  private ValutaVO importoTotalePagato = null;
  private ValutaVO importoEccedente = null;
  private ValutaVO importoNonGoduto = null;
  private Date dataUltimoGiornoUtilePagamento = null;
  private Integer mensilita = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_totale_dovuto") 
 
  public ValutaVO getImportoTotaleDovuto() {
    return importoTotaleDovuto;
  }
  public void setImportoTotaleDovuto(ValutaVO importoTotaleDovuto) {
    this.importoTotaleDovuto = importoTotaleDovuto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_totale_pagato") 
 
  public ValutaVO getImportoTotalePagato() {
    return importoTotalePagato;
  }
  public void setImportoTotalePagato(ValutaVO importoTotalePagato) {
    this.importoTotalePagato = importoTotalePagato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_eccedente") 
 
  public ValutaVO getImportoEccedente() {
    return importoEccedente;
  }
  public void setImportoEccedente(ValutaVO importoEccedente) {
    this.importoEccedente = importoEccedente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_non_goduto") 
 
  public ValutaVO getImportoNonGoduto() {
    return importoNonGoduto;
  }
  public void setImportoNonGoduto(ValutaVO importoNonGoduto) {
    this.importoNonGoduto = importoNonGoduto;
  }

  /**
   * la data ultimo giorno utile pagamento nel formato YYYY-MM-DD 
   **/
  
  @ApiModelProperty(example = "2017-07-21T00:00:00.000+0000", value = "la data ultimo giorno utile pagamento nel formato YYYY-MM-DD ")
  @JsonProperty("data_ultimo_giorno_utile_pagamento") 
 
  public Date getDataUltimoGiornoUtilePagamento() {
    return dataUltimoGiornoUtilePagamento;
  }
  public void setDataUltimoGiornoUtilePagamento(Date dataUltimoGiornoUtilePagamento) {
    this.dataUltimoGiornoUtilePagamento = dataUltimoGiornoUtilePagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mensilita") 
 
  public Integer getMensilita() {
    return mensilita;
  }
  public void setMensilita(Integer mensilita) {
    this.mensilita = mensilita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsitoCalcoloRimborsoNonGodutoVO esitoCalcoloRimborsoNonGodutoVO = (EsitoCalcoloRimborsoNonGodutoVO) o;
    return Objects.equals(importoTotaleDovuto, esitoCalcoloRimborsoNonGodutoVO.importoTotaleDovuto) &&
        Objects.equals(importoTotalePagato, esitoCalcoloRimborsoNonGodutoVO.importoTotalePagato) &&
        Objects.equals(importoEccedente, esitoCalcoloRimborsoNonGodutoVO.importoEccedente) &&
        Objects.equals(importoNonGoduto, esitoCalcoloRimborsoNonGodutoVO.importoNonGoduto) &&
        Objects.equals(dataUltimoGiornoUtilePagamento, esitoCalcoloRimborsoNonGodutoVO.dataUltimoGiornoUtilePagamento) &&
        Objects.equals(mensilita, esitoCalcoloRimborsoNonGodutoVO.mensilita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoTotaleDovuto, importoTotalePagato, importoEccedente, importoNonGoduto, dataUltimoGiornoUtilePagamento, mensilita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoCalcoloRimborsoNonGodutoVO {\n");
    
    sb.append("    importoTotaleDovuto: ").append(toIndentedString(importoTotaleDovuto)).append("\n");
    sb.append("    importoTotalePagato: ").append(toIndentedString(importoTotalePagato)).append("\n");
    sb.append("    importoEccedente: ").append(toIndentedString(importoEccedente)).append("\n");
    sb.append("    importoNonGoduto: ").append(toIndentedString(importoNonGoduto)).append("\n");
    sb.append("    dataUltimoGiornoUtilePagamento: ").append(toIndentedString(dataUltimoGiornoUtilePagamento)).append("\n");
    sb.append("    mensilita: ").append(toIndentedString(mensilita)).append("\n");
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

