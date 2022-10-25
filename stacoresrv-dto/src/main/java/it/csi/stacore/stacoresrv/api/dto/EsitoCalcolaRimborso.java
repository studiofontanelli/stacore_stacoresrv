package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Il risultato ottenuto dal calcola rimborso")

public class EsitoCalcolaRimborso  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String denomonazione = null;
  private Date dataUltimoGiornoUtilePagamento = null;

  /**
   * il nome della nazione 
   **/
  
  @ApiModelProperty(example = "FRANCIA", value = "il nome della nazione ")
  @JsonProperty("denomonazione") 
 
  public String getDenomonazione() {
    return denomonazione;
  }
  public void setDenomonazione(String denomonazione) {
    this.denomonazione = denomonazione;
  }

  /**
   * la data ultimo giorno utile pagamento nel formato DD-MM-YYYY     
   **/
  
  @ApiModelProperty(example = "15-08-2022", value = "la data ultimo giorno utile pagamento nel formato DD-MM-YYYY     ")
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
    EsitoCalcolaRimborso esitoCalcolaRimborso = (EsitoCalcolaRimborso) o;
    return Objects.equals(denomonazione, esitoCalcolaRimborso.denomonazione) &&
        Objects.equals(dataUltimoGiornoUtilePagamento, esitoCalcolaRimborso.dataUltimoGiornoUtilePagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomonazione, dataUltimoGiornoUtilePagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoCalcolaRimborso {\n");
    
    sb.append("    denomonazione: ").append(toIndentedString(denomonazione)).append("\n");
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

