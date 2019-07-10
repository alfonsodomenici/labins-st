/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.lab.entity;

import java.time.LocalDate;
import java.util.Set;

/**
 *
 * @author utente
 */

public class Apparecchiatura extends BaseEntity {

    private String codice;


    private String descrizione;


    private Laboratorio laboratorio;


    private Dominio dominio;


    private Set<CatenaMisura> cateneMisura;


    private TipoApparecchiatura tipologia;


    private Azienda costruttore;


    private Azienda distributore;


    private Azienda taratore;


    private Azienda manutentore; //deve esserci ???


    private String matricola;

    private boolean riferimento;


    private Grandezza grandezza;


    private UnitaMisura um;

    private double campoMin;

    private double campoMax;

    private String incertezza;

    private String campoOperativo;

    private String criterioAccettazione;

    private LocalDate fabbricatoIl;

    private LocalDate acquistatoIl;


    private LocalDate inFunzioneDal;

    private GestioneApparecchiatura gestioneTaratura;

    private GestioneApparecchiatura gestioneManutenzione;


    private Set<Documento> documenti;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

    public Set<CatenaMisura> getCateneMisura() {
        return cateneMisura;
    }

    public void setCateneMisura(Set<CatenaMisura> cateneMisura) {
        this.cateneMisura = cateneMisura;
    }

    public TipoApparecchiatura getTipologia() {
        return tipologia;
    }

    public void setTipologia(TipoApparecchiatura tipologia) {
        this.tipologia = tipologia;
    }

    public Azienda getCostruttore() {
        return costruttore;
    }

    public void setCostruttore(Azienda costruttore) {
        this.costruttore = costruttore;
    }

    public Azienda getDistributore() {
        return distributore;
    }

    public void setDistributore(Azienda distributore) {
        this.distributore = distributore;
    }

    public Azienda getTaratore() {
        return taratore;
    }

    public void setTaratore(Azienda taratore) {
        this.taratore = taratore;
    }

    public Azienda getManutentore() {
        return manutentore;
    }

    public void setManutentore(Azienda manutentore) {
        this.manutentore = manutentore;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public boolean isRiferimento() {
        return riferimento;
    }

    public void setRiferimento(boolean riferimento) {
        this.riferimento = riferimento;
    }

    public Grandezza getGrandezza() {
        return grandezza;
    }

    public void setGrandezza(Grandezza grandezza) {
        this.grandezza = grandezza;
    }

    public UnitaMisura getUm() {
        return um;
    }

    public void setUm(UnitaMisura um) {
        this.um = um;
    }

    public double getCampoMin() {
        return campoMin;
    }

    public void setCampoMin(double campoMin) {
        this.campoMin = campoMin;
    }

    public double getCampoMax() {
        return campoMax;
    }

    public void setCampoMax(double campoMax) {
        this.campoMax = campoMax;
    }

    public String getIncertezza() {
        return incertezza;
    }

    public void setIncertezza(String incertezza) {
        this.incertezza = incertezza;
    }

    public String getCampoOperativo() {
        return campoOperativo;
    }

    public void setCampoOperativo(String campoOperativo) {
        this.campoOperativo = campoOperativo;
    }

    public String getCriterioAccettazione() {
        return criterioAccettazione;
    }

    public void setCriterioAccettazione(String criterioAccettazione) {
        this.criterioAccettazione = criterioAccettazione;
    }

    public LocalDate getFabbricatoIl() {
        return fabbricatoIl;
    }

    public void setFabbricatoIl(LocalDate fabbricatoIl) {
        this.fabbricatoIl = fabbricatoIl;
    }

    public LocalDate getAcquistatoIl() {
        return acquistatoIl;
    }

    public void setAcquistatoIl(LocalDate acquistatoIl) {
        this.acquistatoIl = acquistatoIl;
    }

    public LocalDate getInFunzioneDal() {
        return inFunzioneDal;
    }

    public void setInFunzioneDal(LocalDate inFunzioneDal) {
        this.inFunzioneDal = inFunzioneDal;
    }

    public GestioneApparecchiatura getGestioneTaratura() {
        return gestioneTaratura;
    }

    public void setGestioneTaratura(GestioneApparecchiatura gestioneTaratura) {
        this.gestioneTaratura = gestioneTaratura;
    }

    public GestioneApparecchiatura getGestioneManutenzione() {
        return gestioneManutenzione;
    }

    public void setGestioneManutenzione(GestioneApparecchiatura gestioneManutenzione) {
        this.gestioneManutenzione = gestioneManutenzione;
    }

    public Set<Documento> getDocumenti() {
        return documenti;
    }

    public void setDocumenti(Set<Documento> documenti) {
        this.documenti = documenti;
    }

    @Override
    public String toString() {
        return codice;
    }
}
