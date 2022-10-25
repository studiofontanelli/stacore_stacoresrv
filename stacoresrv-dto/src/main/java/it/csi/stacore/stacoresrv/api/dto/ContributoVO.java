package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.TipoContributoVO;
import it.csi.stacore.stacoresrv.api.dto.ValutaVO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="oggetto contributo")

public class ContributoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idContributo = null;
  private Long idVeicolo = null;
  private TipoContributoVO tipoContributo = null;
  private ValutaVO importo = null;
  private String motivazione = null;
  private String note = null;
  private Date dataConcessione = null;
  private Date dataCancellazione = null;
  private String divisaOriginale = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_contributo") 
 
  public Long getIdContributo() {
    return idContributo;
  }
  public void setIdContributo(Long idContributo) {
    this.idContributo = idContributo;
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
  @JsonProperty("tipo_contributo") 
 
  public TipoContributoVO getTipoContributo() {
    return tipoContributo;
  }
  public void setTipoContributo(TipoContributoVO tipoContributo) {
    this.tipoContributo = tipoContributo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo") 
 
  public ValutaVO getImporto() {
    return importo;
  }
  public void setImporto(ValutaVO importo) {
    this.importo = importo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_concessione") 
 
  public Date getDataConcessione() {
    return dataConcessione;
  }
  public void setDataConcessione(Date dataConcessione) {
    this.dataConcessione = dataConcessione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_cancellazione") 
 
  public Date getDataCancellazione() {
    return dataCancellazione;
  }
  public void setDataCancellazione(Date dataCancellazione) {
    this.dataCancellazione = dataCancellazione;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributoVO contributoVO = (ContributoVO) o;
    return Objects.equals(idContributo, contributoVO.idContributo) &&
        Objects.equals(idVeicolo, contributoVO.idVeicolo) &&
        Objects.equals(tipoContributo, contributoVO.tipoContributo) &&
        Objects.equals(importo, contributoVO.importo) &&
        Objects.equals(motivazione, contributoVO.motivazione) &&
        Objects.equals(note, contributoVO.note) &&
        Objects.equals(dataConcessione, contributoVO.dataConcessione) &&
        Objects.equals(dataCancellazione, contributoVO.dataCancellazione) &&
        Objects.equals(divisaOriginale, contributoVO.divisaOriginale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idContributo, idVeicolo, tipoContributo, importo, motivazione, note, dataConcessione, dataCancellazione, divisaOriginale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributoVO {\n");
    
    sb.append("    idContributo: ").append(toIndentedString(idContributo)).append("\n");
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
    sb.append("    tipoContributo: ").append(toIndentedString(tipoContributo)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    dataConcessione: ").append(toIndentedString(dataConcessione)).append("\n");
    sb.append("    dataCancellazione: ").append(toIndentedString(dataCancellazione)).append("\n");
    sb.append("    divisaOriginale: ").append(toIndentedString(divisaOriginale)).append("\n");
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

