package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.TipoEventoVO;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Evento")

public class EventoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Date dataEvento = null;
  private TipoEventoVO tipoEvento = null;

  /**
   * data evento
   **/
  
  @ApiModelProperty(value = "data evento")
  @JsonProperty("dataEvento") 
 
  public Date getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoEvento") 
 
  public TipoEventoVO getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoVO tipoEvento) {
    this.tipoEvento = tipoEvento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventoVO eventoVO = (EventoVO) o;
    return Objects.equals(dataEvento, eventoVO.dataEvento) &&
        Objects.equals(tipoEvento, eventoVO.tipoEvento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEvento, tipoEvento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoVO {\n");
    
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
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

