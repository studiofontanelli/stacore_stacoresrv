package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.ContributoVO;
import it.csi.stacore.stacoresrv.api.dto.PagamentoVO;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto scadenza")

public class ScadenzaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Boolean hasBollettino = null;
  private String numeroRicevuta = null;
  private List<PagamentoVO> listaPagamenti = new ArrayList<>();
  private List<ContributoVO> listaContributi = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("has_bollettino") 
 
  public Boolean isHasBollettino() {
    return hasBollettino;
  }
  public void setHasBollettino(Boolean hasBollettino) {
    this.hasBollettino = hasBollettino;
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
  @JsonProperty("lista_pagamenti") 
 
  public List<PagamentoVO> getListaPagamenti() {
    return listaPagamenti;
  }
  public void setListaPagamenti(List<PagamentoVO> listaPagamenti) {
    this.listaPagamenti = listaPagamenti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_contributi") 
 
  public List<ContributoVO> getListaContributi() {
    return listaContributi;
  }
  public void setListaContributi(List<ContributoVO> listaContributi) {
    this.listaContributi = listaContributi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScadenzaVO scadenzaVO = (ScadenzaVO) o;
    return Objects.equals(hasBollettino, scadenzaVO.hasBollettino) &&
        Objects.equals(numeroRicevuta, scadenzaVO.numeroRicevuta) &&
        Objects.equals(listaPagamenti, scadenzaVO.listaPagamenti) &&
        Objects.equals(listaContributi, scadenzaVO.listaContributi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasBollettino, numeroRicevuta, listaPagamenti, listaContributi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScadenzaVO {\n");
    
    sb.append("    hasBollettino: ").append(toIndentedString(hasBollettino)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
    sb.append("    listaPagamenti: ").append(toIndentedString(listaPagamenti)).append("\n");
    sb.append("    listaContributi: ").append(toIndentedString(listaContributi)).append("\n");
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

