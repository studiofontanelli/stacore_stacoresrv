package it.csi.stacore.stacoresrv.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.stacore.stacoresrv.api.dto.CarrozzeriaVO;
import it.csi.stacore.stacoresrv.api.dto.CategoriaEuroVO;
import it.csi.stacore.stacoresrv.api.dto.CombustibileVO;
import it.csi.stacore.stacoresrv.api.dto.DestinazioneVeicoloVO;
import it.csi.stacore.stacoresrv.api.dto.EventoVO;
import it.csi.stacore.stacoresrv.api.dto.UsoVeicoloVO;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="DatiTecnici")

public class DatiTecniciVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long id = null;
  private EventoVO eventoInizio = null;
  private EventoVO eventoFine = null;
  private String targa = null;
  private Integer scadenzaAttribuita = null;
  private DestinazioneVeicoloVO destinazione = null;
  private UsoVeicoloVO uso = null;
  private String trasportoMerci = null;
  private CarrozzeriaVO carrozzeria = null;
  private String massaComplessiva = null;
  private BigDecimal kiloWatt = null;
  private Integer portata = null;
  private CombustibileVO alimentazione = null;
  private Boolean hasSospensionePneum = null;
  private Integer numPosti = null;
  private Integer numAssi = null;
  private Integer potenzaFiscale = null;
  private Integer cilindrata = null;
  private Boolean isEcoDiesel = null;
  private Boolean isGancioPresente = null;
  private Integer massaRimorchiabile = null;
  private Boolean isRimorchiabile = null;
  private CategoriaEuroVO categoriaEuro = null;
  private Boolean isImpiantoAGas = null;
  private String emissioneCO2 = null;
  private Date dataInstallazioneGas = null;
  private Date dataCollaudoGas = null;
  private CombustibileVO alimentazioneImpiantoGas = null;
  private Date dataDisinstallazioneGas = null;

  /**
   * id dato tecnico
   **/
  
  @ApiModelProperty(value = "id dato tecnico")
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
  @JsonProperty("eventoInizio") 
 
  public EventoVO getEventoInizio() {
    return eventoInizio;
  }
  public void setEventoInizio(EventoVO eventoInizio) {
    this.eventoInizio = eventoInizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventoFine") 
 
  public EventoVO getEventoFine() {
    return eventoFine;
  }
  public void setEventoFine(EventoVO eventoFine) {
    this.eventoFine = eventoFine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scadenzaAttribuita") 
 
  public Integer getScadenzaAttribuita() {
    return scadenzaAttribuita;
  }
  public void setScadenzaAttribuita(Integer scadenzaAttribuita) {
    this.scadenzaAttribuita = scadenzaAttribuita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("destinazione") 
 
  public DestinazioneVeicoloVO getDestinazione() {
    return destinazione;
  }
  public void setDestinazione(DestinazioneVeicoloVO destinazione) {
    this.destinazione = destinazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uso") 
 
  public UsoVeicoloVO getUso() {
    return uso;
  }
  public void setUso(UsoVeicoloVO uso) {
    this.uso = uso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trasportoMerci") 
 
  public String getTrasportoMerci() {
    return trasportoMerci;
  }
  public void setTrasportoMerci(String trasportoMerci) {
    this.trasportoMerci = trasportoMerci;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrozzeria") 
 
  public CarrozzeriaVO getCarrozzeria() {
    return carrozzeria;
  }
  public void setCarrozzeria(CarrozzeriaVO carrozzeria) {
    this.carrozzeria = carrozzeria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massaComplessiva") 
 
  public String getMassaComplessiva() {
    return massaComplessiva;
  }
  public void setMassaComplessiva(String massaComplessiva) {
    this.massaComplessiva = massaComplessiva;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("kiloWatt") 
 
  public BigDecimal getKiloWatt() {
    return kiloWatt;
  }
  public void setKiloWatt(BigDecimal kiloWatt) {
    this.kiloWatt = kiloWatt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("portata") 
 
  public Integer getPortata() {
    return portata;
  }
  public void setPortata(Integer portata) {
    this.portata = portata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alimentazione") 
 
  public CombustibileVO getAlimentazione() {
    return alimentazione;
  }
  public void setAlimentazione(CombustibileVO alimentazione) {
    this.alimentazione = alimentazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasSospensionePneum") 
 
  public Boolean isHasSospensionePneum() {
    return hasSospensionePneum;
  }
  public void setHasSospensionePneum(Boolean hasSospensionePneum) {
    this.hasSospensionePneum = hasSospensionePneum;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numPosti") 
 
  public Integer getNumPosti() {
    return numPosti;
  }
  public void setNumPosti(Integer numPosti) {
    this.numPosti = numPosti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numAssi") 
 
  public Integer getNumAssi() {
    return numAssi;
  }
  public void setNumAssi(Integer numAssi) {
    this.numAssi = numAssi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("potenzaFiscale") 
 
  public Integer getPotenzaFiscale() {
    return potenzaFiscale;
  }
  public void setPotenzaFiscale(Integer potenzaFiscale) {
    this.potenzaFiscale = potenzaFiscale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cilindrata") 
 
  public Integer getCilindrata() {
    return cilindrata;
  }
  public void setCilindrata(Integer cilindrata) {
    this.cilindrata = cilindrata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isEcoDiesel") 
 
  public Boolean isIsEcoDiesel() {
    return isEcoDiesel;
  }
  public void setIsEcoDiesel(Boolean isEcoDiesel) {
    this.isEcoDiesel = isEcoDiesel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isGancioPresente") 
 
  public Boolean isIsGancioPresente() {
    return isGancioPresente;
  }
  public void setIsGancioPresente(Boolean isGancioPresente) {
    this.isGancioPresente = isGancioPresente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massaRimorchiabile") 
 
  public Integer getMassaRimorchiabile() {
    return massaRimorchiabile;
  }
  public void setMassaRimorchiabile(Integer massaRimorchiabile) {
    this.massaRimorchiabile = massaRimorchiabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isRimorchiabile") 
 
  public Boolean isIsRimorchiabile() {
    return isRimorchiabile;
  }
  public void setIsRimorchiabile(Boolean isRimorchiabile) {
    this.isRimorchiabile = isRimorchiabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoriaEuro") 
 
  public CategoriaEuroVO getCategoriaEuro() {
    return categoriaEuro;
  }
  public void setCategoriaEuro(CategoriaEuroVO categoriaEuro) {
    this.categoriaEuro = categoriaEuro;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isImpiantoAGas") 
 
  public Boolean isIsImpiantoAGas() {
    return isImpiantoAGas;
  }
  public void setIsImpiantoAGas(Boolean isImpiantoAGas) {
    this.isImpiantoAGas = isImpiantoAGas;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emissioneCO2") 
 
  public String getEmissioneCO2() {
    return emissioneCO2;
  }
  public void setEmissioneCO2(String emissioneCO2) {
    this.emissioneCO2 = emissioneCO2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataInstallazioneGas") 
 
  public Date getDataInstallazioneGas() {
    return dataInstallazioneGas;
  }
  public void setDataInstallazioneGas(Date dataInstallazioneGas) {
    this.dataInstallazioneGas = dataInstallazioneGas;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataCollaudoGas") 
 
  public Date getDataCollaudoGas() {
    return dataCollaudoGas;
  }
  public void setDataCollaudoGas(Date dataCollaudoGas) {
    this.dataCollaudoGas = dataCollaudoGas;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alimentazioneImpiantoGas") 
 
  public CombustibileVO getAlimentazioneImpiantoGas() {
    return alimentazioneImpiantoGas;
  }
  public void setAlimentazioneImpiantoGas(CombustibileVO alimentazioneImpiantoGas) {
    this.alimentazioneImpiantoGas = alimentazioneImpiantoGas;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataDisinstallazioneGas") 
 
  public Date getDataDisinstallazioneGas() {
    return dataDisinstallazioneGas;
  }
  public void setDataDisinstallazioneGas(Date dataDisinstallazioneGas) {
    this.dataDisinstallazioneGas = dataDisinstallazioneGas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiTecniciVO datiTecniciVO = (DatiTecniciVO) o;
    return Objects.equals(id, datiTecniciVO.id) &&
        Objects.equals(eventoInizio, datiTecniciVO.eventoInizio) &&
        Objects.equals(eventoFine, datiTecniciVO.eventoFine) &&
        Objects.equals(targa, datiTecniciVO.targa) &&
        Objects.equals(scadenzaAttribuita, datiTecniciVO.scadenzaAttribuita) &&
        Objects.equals(destinazione, datiTecniciVO.destinazione) &&
        Objects.equals(uso, datiTecniciVO.uso) &&
        Objects.equals(trasportoMerci, datiTecniciVO.trasportoMerci) &&
        Objects.equals(carrozzeria, datiTecniciVO.carrozzeria) &&
        Objects.equals(massaComplessiva, datiTecniciVO.massaComplessiva) &&
        Objects.equals(kiloWatt, datiTecniciVO.kiloWatt) &&
        Objects.equals(portata, datiTecniciVO.portata) &&
        Objects.equals(alimentazione, datiTecniciVO.alimentazione) &&
        Objects.equals(hasSospensionePneum, datiTecniciVO.hasSospensionePneum) &&
        Objects.equals(numPosti, datiTecniciVO.numPosti) &&
        Objects.equals(numAssi, datiTecniciVO.numAssi) &&
        Objects.equals(potenzaFiscale, datiTecniciVO.potenzaFiscale) &&
        Objects.equals(cilindrata, datiTecniciVO.cilindrata) &&
        Objects.equals(isEcoDiesel, datiTecniciVO.isEcoDiesel) &&
        Objects.equals(isGancioPresente, datiTecniciVO.isGancioPresente) &&
        Objects.equals(massaRimorchiabile, datiTecniciVO.massaRimorchiabile) &&
        Objects.equals(isRimorchiabile, datiTecniciVO.isRimorchiabile) &&
        Objects.equals(categoriaEuro, datiTecniciVO.categoriaEuro) &&
        Objects.equals(isImpiantoAGas, datiTecniciVO.isImpiantoAGas) &&
        Objects.equals(emissioneCO2, datiTecniciVO.emissioneCO2) &&
        Objects.equals(dataInstallazioneGas, datiTecniciVO.dataInstallazioneGas) &&
        Objects.equals(dataCollaudoGas, datiTecniciVO.dataCollaudoGas) &&
        Objects.equals(alimentazioneImpiantoGas, datiTecniciVO.alimentazioneImpiantoGas) &&
        Objects.equals(dataDisinstallazioneGas, datiTecniciVO.dataDisinstallazioneGas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventoInizio, eventoFine, targa, scadenzaAttribuita, destinazione, uso, trasportoMerci, carrozzeria, massaComplessiva, kiloWatt, portata, alimentazione, hasSospensionePneum, numPosti, numAssi, potenzaFiscale, cilindrata, isEcoDiesel, isGancioPresente, massaRimorchiabile, isRimorchiabile, categoriaEuro, isImpiantoAGas, emissioneCO2, dataInstallazioneGas, dataCollaudoGas, alimentazioneImpiantoGas, dataDisinstallazioneGas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiTecniciVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventoInizio: ").append(toIndentedString(eventoInizio)).append("\n");
    sb.append("    eventoFine: ").append(toIndentedString(eventoFine)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    scadenzaAttribuita: ").append(toIndentedString(scadenzaAttribuita)).append("\n");
    sb.append("    destinazione: ").append(toIndentedString(destinazione)).append("\n");
    sb.append("    uso: ").append(toIndentedString(uso)).append("\n");
    sb.append("    trasportoMerci: ").append(toIndentedString(trasportoMerci)).append("\n");
    sb.append("    carrozzeria: ").append(toIndentedString(carrozzeria)).append("\n");
    sb.append("    massaComplessiva: ").append(toIndentedString(massaComplessiva)).append("\n");
    sb.append("    kiloWatt: ").append(toIndentedString(kiloWatt)).append("\n");
    sb.append("    portata: ").append(toIndentedString(portata)).append("\n");
    sb.append("    alimentazione: ").append(toIndentedString(alimentazione)).append("\n");
    sb.append("    hasSospensionePneum: ").append(toIndentedString(hasSospensionePneum)).append("\n");
    sb.append("    numPosti: ").append(toIndentedString(numPosti)).append("\n");
    sb.append("    numAssi: ").append(toIndentedString(numAssi)).append("\n");
    sb.append("    potenzaFiscale: ").append(toIndentedString(potenzaFiscale)).append("\n");
    sb.append("    cilindrata: ").append(toIndentedString(cilindrata)).append("\n");
    sb.append("    isEcoDiesel: ").append(toIndentedString(isEcoDiesel)).append("\n");
    sb.append("    isGancioPresente: ").append(toIndentedString(isGancioPresente)).append("\n");
    sb.append("    massaRimorchiabile: ").append(toIndentedString(massaRimorchiabile)).append("\n");
    sb.append("    isRimorchiabile: ").append(toIndentedString(isRimorchiabile)).append("\n");
    sb.append("    categoriaEuro: ").append(toIndentedString(categoriaEuro)).append("\n");
    sb.append("    isImpiantoAGas: ").append(toIndentedString(isImpiantoAGas)).append("\n");
    sb.append("    emissioneCO2: ").append(toIndentedString(emissioneCO2)).append("\n");
    sb.append("    dataInstallazioneGas: ").append(toIndentedString(dataInstallazioneGas)).append("\n");
    sb.append("    dataCollaudoGas: ").append(toIndentedString(dataCollaudoGas)).append("\n");
    sb.append("    alimentazioneImpiantoGas: ").append(toIndentedString(alimentazioneImpiantoGas)).append("\n");
    sb.append("    dataDisinstallazioneGas: ").append(toIndentedString(dataDisinstallazioneGas)).append("\n");
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

