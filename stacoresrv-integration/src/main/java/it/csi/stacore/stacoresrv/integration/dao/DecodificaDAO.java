package it.csi.stacore.stacoresrv.integration.dao;

import java.util.List;

import it.csi.stacore.stacoresrv.integration.exception.ResourceAccessException;
import it.csi.stacore.staon.business.bo.TipoVeicolo;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */

public interface DecodificaDAO {
    
	
	 public List<TipoVeicolo> findTipoVeicolo() throws ResourceAccessException;
	 
	 
	// public TipoVeicolo getTipoVeicoloByCodice(String codice) throws ResourceAccessException;
	 

	 /*
    public List findDestinazioneVeicolo(Connection connection) throws ResourceAccessException;

    public List findPercentualeInteresseESanzioniContenzioso(Connection connection) throws ResourceAccessException;

    
    public List findDivisa(Connection connection) throws ResourceAccessException;

    
    public List findFonte(Connection connection) throws ResourceAccessException;
    
    
    public List findRegioneIcar(Connection connection) throws ResourceAccessException;

   
    public List findTipoCarrozzeriaVeicolo(Connection connection) throws ResourceAccessException;

   
    public List findTipoCombustibile(Connection connection) throws ResourceAccessException;
    
    public List findTipoCombustibileImpiantoGas(Connection connection) throws ResourceAccessException;

   
    public List findTipoEvento(Connection connection) throws ResourceAccessException;

   
    public List findTipoUsoVeicolo(Connection connection) throws ResourceAccessException;

   
   
    
    public List findTipoAgevolazione(Connection connection) throws ResourceAccessException;

    public List findAbilitazioneAgevolazione(Connection connection) throws ResourceAccessException;

   
    public List findTipoOperazioneLogica(Connection connection) throws ResourceAccessException;

   
    public List findTipoIntermediario(Connection connection) throws ResourceAccessException;

   
    public List findEsplicativo(Connection connection) throws ResourceAccessException;

   
    public List findTipoSanzionamento(Connection connection) throws ResourceAccessException;

    public List findTipoContributo(Connection connection) throws ResourceAccessException;

   
    public List<TipoCalcolo> findTipoCalcolo(Connection connection) throws ResourceAccessException;

   
    public List findTipoCalcoloRimorchiabilita(Connection connection) throws ResourceAccessException;

   
    public List findTipoCompensazione(Connection connection) throws ResourceAccessException;

   
    public List findTipoAggregazione(Connection connection) throws ResourceAccessException;
    
   
    public List findTipiAggregazioneByIdEnte(Connection connection, IdDecodifica idEnte) throws ResourceAccessException;

   
    public List findTipoOperazioneBonificaIR(Connection connection) throws ResourceAccessException;

    
   
    public DestinazioneVeicolo loadDestinazioneVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public Divisa loadDivisaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    
    public Fonte loadFonteById(Connection connection, IdFonte id) throws ResourceAccessException;
    
    
    public Regione loadRegioneById(Connection connection, IdRegione id) throws ResourceAccessException;

   
    public Carrozzeria loadTipoCarrozzeriaVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public Combustibile loadTipoCombustibileById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public TipoEvento loadTipoEventoById(Connection connection, IdTipoEvento id) throws ResourceAccessException;

    
    public UsoVeicolo loadTipoUsoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    
    public CategoriaEuro loadCategoriaEuroById(Connection connection, IdDecodifica id) throws ResourceAccessException;
    
    public CategoriaEuro loadCategoriaEuroByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public TipoVeicolo loadTipoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    
    public TipoAgevolazione loadTipoAgevolazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public TipoOperazioneLogica loadTipoOperazioneLogicaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public TipoIntermediario loadTipoIntermediarioById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public Esplicativo loadEsplicativoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    
    public TipoSanzionamento loadTipoSanzionamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public TipoContributo loadTipoContributoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public TipoCalcolo loadTipoCalcoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

    
    public TipoCompensazione loadTipoCompensazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

   
    public DestinazioneVeicolo loadDestinazioneVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public Divisa loadDivisaByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public Fonte loadFonteByCodice(Connection connection, String codice) throws ResourceAccessException;

    
   
    public Carrozzeria loadTipoCarrozzeriaVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public Combustibile loadTipoCombustibileByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public TipoEvento loadTipoEventoByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public UsoVeicolo loadTipoUsoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public TipoVeicolo loadTipoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public TipoAgevolazione loadTipoAgevolazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public TipoIntermediario loadTipoIntermediarioByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public Esplicativo loadEsplicativoByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public TipoSanzionamento loadTipoSanzionamentoByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public TipoContributo loadTipoContributoByCodice(Connection connection, String codice) throws ResourceAccessException;

   
    public TipoCalcolo loadTipoCalcoloByCodice(Connection connection, String codice) throws ResourceAccessException;

    
    public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaByCodice(Connection connection,
            String codice) throws ResourceAccessException;

    
    public TipoCompensazione loadTipoCompensazioneByCodice(Connection connection, String codice) throws ResourceAccessException;


    public List findRegione(Connection connection) throws ResourceAccessException;

    public List findProvince(Connection connection) throws ResourceAccessException;

    public List findComuni(Connection connection, String codProvincia) throws ResourceAccessException;


    public List findSiglaToponomastica(Connection connection) throws ResourceAccessException;

    public List findEnte(Connection connection) throws ResourceAccessException;

    public List findTipoVeicoloPerRiscossione(Connection connection) throws ResourceAccessException;

    public List findEnteByUtente(Connection connection, Utente utente) throws ResourceAccessException;

    public List findSportelloByEnte(Connection connection, Ente ente) throws ResourceAccessException;

    public List findSportelloByEnteUtente(Connection connection, Ente ente, Utente utente) throws ResourceAccessException;

    public List findStatoSegnalazione(Connection connection) throws ResourceAccessException;

    public StatoSegnalazione loadStatoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findMotivoSegnalazione(Connection connection) throws ResourceAccessException;

    public MotivoSegnalazione loadMotivoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findCausaleSegnalazione(Connection connection) throws ResourceAccessException;

    public CausaleSegnalazione loadCausaleSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoSegnalazione(Connection connection) throws ResourceAccessException;

    public TipoAvvisoSegnalazione loadTipoAvvisoSegnalazioneById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoScadenza(Connection connection) throws ResourceAccessException;

    public TipoAvvisoScadenza loadTipoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoAvvisoScadenza(Connection connection) throws ResourceAccessException;

    public StatoAvvisoScadenza loadStatoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findCausaleChiusura(Connection connection) throws ResourceAccessException;
    
    public List findCausaleSospensione(Connection connection) throws ResourceAccessException;
    
    public List findCategoriaEuro(Integer tipoVeicolo, Connection connection) throws ResourceAccessException;

    public CausaleChiusura loadCausaleChiusuraById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoAccertamento(Connection connection) throws ResourceAccessException;

    public StatoAccertamento loadStatoAccertamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoAccertamento(Connection connection) throws ResourceAccessException;

    public TipoAvvisoAccertamento loadTipoAvvisoAccertamentoById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

    public List findTipoPeriodicita(Connection connection) throws ResourceAccessException;

    public TipoPeriodicita loadTipoPeriodicitaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoTassazione(Connection connection) throws ResourceAccessException;

    public TipoTassazione loadTipoTassazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoTributo(Connection connection) throws ResourceAccessException;

    public StatoTributo loadStatoTributoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoCredito(Connection connection) throws ResourceAccessException;
    
    public List findStatoPagamentoAvviso(Connection connection) throws ResourceAccessException;
    
    public List findRegoleCalcolo(Connection connection) throws ResourceAccessException;
    
    public TipoRiduzione loadTipoRiduzioneByCodiceAllaData(
			Connection connection, String codice, Date data)
			throws ResourceAccessException;

	public List findTipoRiduzioneAllaData(Connection connection, Date data)
			throws ResourceAccessException;

	public TipoRiduzione loadTipoRiduzioneByIdAllaData(Connection connection,
			IdDecodifica id, Date data) throws ResourceAccessException;
	
	public List findEntiRiscossori(Connection connection) throws ResourceAccessException;
	
	public Ente getEnteByIdSportello(Connection connection, Long idSportello) throws ResourceAccessException;
	
	public FonteComunicazione loadFonteComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException;
	
	public TipoComunicazContrib loadTipoComunicazContribByCodice(Connection connection, String codice) throws ResourceAccessException;
	
	public StatoComunicazione loadStatoComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException;
	
	public StatoLavorazione loadStatoLavorazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

	public List findEsitoNotifica(Connection connection) throws ResourceAccessException;
	
	public List findFonteComunicazione(Connection connection) throws ResourceAccessException;
	
	public List findStatoComunicazione(Connection connection) throws ResourceAccessException;
	
	public List findStatoLavorazione(Connection connection) throws ResourceAccessException;
	
	public List findChiusuraComunicazione(Connection connection) throws ResourceAccessException;
	
	public List findStatiLavorazioneByStatoAttuale(Connection connection, IdStatoLavorazione idStatoLavorazione, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException;
	
	public List findFonteComunicazioneAttiva(Connection connection) throws ResourceAccessException;

	public StatoComunicazione findStatoComunicazioneByStatoLav(Connection connection, IdStatoLavorazione idStatoLavorazione, IdStatoLavorazione idStatoLavPrec, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException;
	
	public List findParentela(Connection connection) throws ResourceAccessException;

	public List findEnteUA(Connection connection, String codiceFiscale) throws ResourceAccessException;

	public List findAgenziaUA(Connection connection, String enteDescrizione) throws ResourceAccessException;

	public List findUtenteUA(Connection connection, String codiceAgenzia) throws ResourceAccessException;

	public List findTipologiaBonifica(Connection conn)  throws ResourceAccessException;

	public List ricercaBonifiche(Connection conn, List idBonifica) throws ResourceAccessException;

	public List ricercaIdBonifiche(Connection conn, RicercaBonificheRequest request) throws ResourceAccessException;
	
	public List findTipoDocumento(Connection connection) throws ResourceAccessException;

	public List ricercaReportBonifiche(Connection conn, ReportBonificheRequest request)  throws ResourceAccessException;
	
	public List findCasseConUtenteDaSportello(Connection connection, Long idSportello) throws ResourceAccessException;
	
	public List findFonteRimborso(Connection connection) throws ResourceAccessException;

	public FonteRimborso loadFonteRimborsoByCodice(Connection connection, String codice) throws ResourceAccessException;
	
	
	public ModalitaPagamento getModalitaByCodice(String codice, Connection connection) throws ResourceAccessException;
	
	*/
	

}
