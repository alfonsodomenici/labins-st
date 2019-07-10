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

public class FuoriServizio extends AbstractEntity {


    public static enum Motivo {
        MANUTENZIONE, TARATURA, VERIFICA_INTERMEDIA, FS_STRAORDINARIO
    }

    public static enum Esito {
        POSITIVO, NEGATIVO
    }


    private Motivo motivo;

    private Apparecchiatura apparecchiatura;


    private LocalDate inizio;


    private LocalDate fine;


    private String utenteInizio;


    private String utenteFine;


    private Esito esito;


    private String descrizione;


    private Set<Documento> documenti;


    private FsTaratura taratura;


    private FsManutenzione manutenzione;

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public Apparecchiatura getApparecchiatura() {
        return apparecchiatura;
    }

    public void setApparecchiatura(Apparecchiatura apparecchiatura) {
        this.apparecchiatura = apparecchiatura;
    }

    public LocalDate getInizio() {
        return inizio;
    }

    public void setInizio(LocalDate inizio) {
        this.inizio = inizio;
    }

    public LocalDate getFine() {
        return fine;
    }

    public void setFine(LocalDate fine) {
        this.fine = fine;
    }

    public String getUtenteInizio() {
        return utenteInizio;
    }

    public void setUtenteInizio(String utenteInizio) {
        this.utenteInizio = utenteInizio;
    }

    public String getUtenteFine() {
        return utenteFine;
    }

    public void setUtenteFine(String utenteFine) {
        this.utenteFine = utenteFine;
    }

    public Esito getEsito() {
        return esito;
    }

    public void setEsito(Esito esito) {
        this.esito = esito;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set<Documento> getDocumenti() {
        return documenti;
    }

    public void setDocumenti(Set<Documento> documenti) {
        this.documenti = documenti;
    }

    public FsTaratura getTaratura() {
        return taratura;
    }

    public void setTaratura(FsTaratura taratura) {
        this.taratura = taratura;
    }

    public FsManutenzione getManutenzione() {
        return manutenzione;
    }

    public void setManutenzione(FsManutenzione manutenzione) {
        this.manutenzione = manutenzione;
    }

    @Override
    public String toString() {
        return descrizione;
    }

}
