package it.csi.stacore.stacoresrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Il risultato ottenuto dal calcola rimborso")

public class EsitoCalcoloRimborsoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private ValutaVO importoTotaleDovuto = null;
  private ValutaVO importoTotalePagato = null;
  private ValutaVO cifraDaRimborsare = null;
  private Date dataUltimoGiornoUtilePagamento = null;

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
  @JsonProperty("cifra_da_rimborsare") 
 
  public ValutaVO getCifraDaRimborsare() {
    return cifraDaRimborsare;
  }
  public void setCifraDaRimborsare(ValutaVO cifraDaRimborsare) {
    this.cifraDaRimborsare = cifraDaRimborsare;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsitoCalcoloRimborsoVO esitoCalcoloRimborsoVO = (EsitoCalcoloRimborsoVO) o;
    return Objects.equals(importoTotaleDovuto, esitoCalcoloRimborsoVO.importoTotaleDovuto) &&
        Objects.equals(importoTotalePagato, esitoCalcoloRimborsoVO.importoTotalePagato) &&
        Objects.equals(cifraDaRimborsare, esitoCalcoloRimborsoVO.cifraDaRimborsare) &&
        Objects.equals(dataUltimoGiornoUtilePagamento, esitoCalcoloRimborsoVO.dataUltimoGiornoUtilePagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoTotaleDovuto, importoTotalePagato, cifraDaRimborsare, dataUltimoGiornoUtilePagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoCalcoloRimborsoVO {\n");
    
    sb.append("    importoTotaleDovuto: ").append(toIndentedString(importoTotaleDovuto)).append("\n");
    sb.append("    importoTotalePagato: ").append(toIndentedString(importoTotalePagato)).append("\n");
    sb.append("    cifraDaRimborsare: ").append(toIndentedString(cifraDaRimborsare)).append("\n");
    sb.append("    dataUltimoGiornoUtilePagamento: ").append(toIndentedString(dataUltimoGiornoUtilePagamento)).append("\n");
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

