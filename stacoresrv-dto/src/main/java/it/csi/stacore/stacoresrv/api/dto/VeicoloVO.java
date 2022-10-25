package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.DatiTecniciVO;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Veicolo")

public class VeicoloVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private TipoVeicoloVO tipoVeicolo = null;
  private String telaio = null;
  private Date dataUltimaRevisione = null;
  private List<DatiTecniciVO> storicoDatiTecnici = new ArrayList<>();
  private Boolean flagRicercaAg = null;
  private Long idDatiTecnici = null;
  private Long nuovoIdDatiTecnici = null;

  /**
   * id veicolo
   **/
  
  @ApiModelProperty(value = "id veicolo")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("telaio") 
 
  public String getTelaio() {
    return telaio;
  }
  public void setTelaio(String telaio) {
    this.telaio = telaio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataUltimaRevisione") 
 
  public Date getDataUltimaRevisione() {
    return dataUltimaRevisione;
  }
  public void setDataUltimaRevisione(Date dataUltimaRevisione) {
    this.dataUltimaRevisione = dataUltimaRevisione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("storicoDatiTecnici") 
 
  public List<DatiTecniciVO> getStoricoDatiTecnici() {
    return storicoDatiTecnici;
  }
  public void setStoricoDatiTecnici(List<DatiTecniciVO> storicoDatiTecnici) {
    this.storicoDatiTecnici = storicoDatiTecnici;
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
   * nuovo id dati tecnici
   **/
  
  @ApiModelProperty(value = "nuovo id dati tecnici")
  @JsonProperty("nuovoIdDatiTecnici") 
 
  public Long getNuovoIdDatiTecnici() {
    return nuovoIdDatiTecnici;
  }
  public void setNuovoIdDatiTecnici(Long nuovoIdDatiTecnici) {
    this.nuovoIdDatiTecnici = nuovoIdDatiTecnici;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VeicoloVO veicoloVO = (VeicoloVO) o;
    return Objects.equals(id, veicoloVO.id) &&
        Objects.equals(tipoVeicolo, veicoloVO.tipoVeicolo) &&
        Objects.equals(telaio, veicoloVO.telaio) &&
        Objects.equals(dataUltimaRevisione, veicoloVO.dataUltimaRevisione) &&
        Objects.equals(storicoDatiTecnici, veicoloVO.storicoDatiTecnici) &&
        Objects.equals(flagRicercaAg, veicoloVO.flagRicercaAg) &&
        Objects.equals(idDatiTecnici, veicoloVO.idDatiTecnici) &&
        Objects.equals(nuovoIdDatiTecnici, veicoloVO.nuovoIdDatiTecnici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoVeicolo, telaio, dataUltimaRevisione, storicoDatiTecnici, flagRicercaAg, idDatiTecnici, nuovoIdDatiTecnici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeicoloVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    telaio: ").append(toIndentedString(telaio)).append("\n");
    sb.append("    dataUltimaRevisione: ").append(toIndentedString(dataUltimaRevisione)).append("\n");
    sb.append("    storicoDatiTecnici: ").append(toIndentedString(storicoDatiTecnici)).append("\n");
    sb.append("    flagRicercaAg: ").append(toIndentedString(flagRicercaAg)).append("\n");
    sb.append("    idDatiTecnici: ").append(toIndentedString(idDatiTecnici)).append("\n");
    sb.append("    nuovoIdDatiTecnici: ").append(toIndentedString(nuovoIdDatiTecnici)).append("\n");
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

