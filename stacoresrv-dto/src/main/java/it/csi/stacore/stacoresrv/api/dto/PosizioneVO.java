package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.EventoVO;
import it.csi.stacore.stacoresrv.api.dto.FonteVO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Posizione")

public class PosizioneVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private Long idOperazioneLogica = null;
  private EventoVO eventoInzio = null;
  private EventoVO eventoFine = null;
  private Long idProprietario = null;
  private Long idVeicolo = null;
  private FonteVO fonte = null;
  private Long idTipoSoggettoPassivo = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("evento_inzio") 
 
  public EventoVO getEventoInzio() {
    return eventoInzio;
  }
  public void setEventoInzio(EventoVO eventoInzio) {
    this.eventoInzio = eventoInzio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("evento_fine") 
 
  public EventoVO getEventoFine() {
    return eventoFine;
  }
  public void setEventoFine(EventoVO eventoFine) {
    this.eventoFine = eventoFine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_proprietario") 
 
  public Long getIdProprietario() {
    return idProprietario;
  }
  public void setIdProprietario(Long idProprietario) {
    this.idProprietario = idProprietario;
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
  @JsonProperty("id_tipo_soggetto_passivo") 
 
  public Long getIdTipoSoggettoPassivo() {
    return idTipoSoggettoPassivo;
  }
  public void setIdTipoSoggettoPassivo(Long idTipoSoggettoPassivo) {
    this.idTipoSoggettoPassivo = idTipoSoggettoPassivo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosizioneVO posizioneVO = (PosizioneVO) o;
    return Objects.equals(id, posizioneVO.id) &&
        Objects.equals(idOperazioneLogica, posizioneVO.idOperazioneLogica) &&
        Objects.equals(eventoInzio, posizioneVO.eventoInzio) &&
        Objects.equals(eventoFine, posizioneVO.eventoFine) &&
        Objects.equals(idProprietario, posizioneVO.idProprietario) &&
        Objects.equals(idVeicolo, posizioneVO.idVeicolo) &&
        Objects.equals(fonte, posizioneVO.fonte) &&
        Objects.equals(idTipoSoggettoPassivo, posizioneVO.idTipoSoggettoPassivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idOperazioneLogica, eventoInzio, eventoFine, idProprietario, idVeicolo, fonte, idTipoSoggettoPassivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosizioneVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOperazioneLogica: ").append(toIndentedString(idOperazioneLogica)).append("\n");
    sb.append("    eventoInzio: ").append(toIndentedString(eventoInzio)).append("\n");
    sb.append("    eventoFine: ").append(toIndentedString(eventoFine)).append("\n");
    sb.append("    idProprietario: ").append(toIndentedString(idProprietario)).append("\n");
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
    sb.append("    fonte: ").append(toIndentedString(fonte)).append("\n");
    sb.append("    idTipoSoggettoPassivo: ").append(toIndentedString(idTipoSoggettoPassivo)).append("\n");
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

