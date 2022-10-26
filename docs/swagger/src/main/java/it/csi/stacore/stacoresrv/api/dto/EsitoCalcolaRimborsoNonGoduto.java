package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.ValutaVO;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Il risultato ottenuto dal calcola rimborso")

public class EsitoCalcolaRimborsoNonGoduto  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private ValutaVO importoTotaleDovuto = null;
  private ValutaVO importoTotalePagato = null;
  private ValutaVO importoTotaleEccedente = null;
  private ValutaVO importoTotaleNonGoduto = null;
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
  @JsonProperty("importo_totale_eccedente") 
 
  public ValutaVO getImportoTotaleEccedente() {
    return importoTotaleEccedente;
  }
  public void setImportoTotaleEccedente(ValutaVO importoTotaleEccedente) {
    this.importoTotaleEccedente = importoTotaleEccedente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_totale_non_goduto") 
 
  public ValutaVO getImportoTotaleNonGoduto() {
    return importoTotaleNonGoduto;
  }
  public void setImportoTotaleNonGoduto(ValutaVO importoTotaleNonGoduto) {
    this.importoTotaleNonGoduto = importoTotaleNonGoduto;
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
    EsitoCalcolaRimborsoNonGoduto esitoCalcolaRimborsoNonGoduto = (EsitoCalcolaRimborsoNonGoduto) o;
    return Objects.equals(importoTotaleDovuto, esitoCalcolaRimborsoNonGoduto.importoTotaleDovuto) &&
        Objects.equals(importoTotalePagato, esitoCalcolaRimborsoNonGoduto.importoTotalePagato) &&
        Objects.equals(importoTotaleEccedente, esitoCalcolaRimborsoNonGoduto.importoTotaleEccedente) &&
        Objects.equals(importoTotaleNonGoduto, esitoCalcolaRimborsoNonGoduto.importoTotaleNonGoduto) &&
        Objects.equals(dataUltimoGiornoUtilePagamento, esitoCalcolaRimborsoNonGoduto.dataUltimoGiornoUtilePagamento) &&
        Objects.equals(mensilita, esitoCalcolaRimborsoNonGoduto.mensilita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoTotaleDovuto, importoTotalePagato, importoTotaleEccedente, importoTotaleNonGoduto, dataUltimoGiornoUtilePagamento, mensilita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoCalcolaRimborsoNonGoduto {\n");
    
    sb.append("    importoTotaleDovuto: ").append(toIndentedString(importoTotaleDovuto)).append("\n");
    sb.append("    importoTotalePagato: ").append(toIndentedString(importoTotalePagato)).append("\n");
    sb.append("    importoTotaleEccedente: ").append(toIndentedString(importoTotaleEccedente)).append("\n");
    sb.append("    importoTotaleNonGoduto: ").append(toIndentedString(importoTotaleNonGoduto)).append("\n");
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
