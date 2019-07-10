/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.lab.entity;

import java.time.LocalDate;

/**
 *
 * @author utente
 */

public class Deroga extends BaseEntity {


    private LocalDate derogaScadenza;

    private String motivazione;

    private GestioneTemporale gestione;

    public LocalDate getDerogaScadenza() {
        return derogaScadenza;
    }

    public void setDerogaScadenza(LocalDate derogaScadenza) {
        this.derogaScadenza = derogaScadenza;
    }

    public String getMotivazione() {
        return motivazione;
    }

    public void setMotivazione(String motivazione) {
        this.motivazione = motivazione;
    }

    public GestioneTemporale getGestione() {
        return gestione;
    }

    public void setGestione(GestioneTemporale gestione) {
        this.gestione = gestione;
    }

    @Override
    public String toString() {
        return motivazione;
    }
}
