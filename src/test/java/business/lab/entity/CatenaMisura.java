/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.lab.entity;

import java.util.Set;

/**
 *
 * @author utente
 */

public class CatenaMisura extends BaseEntity {


    private String denominazione;

    private Dominio dominio;

    private Set<Apparecchiatura> apparecchiature;

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

    public Set<Apparecchiatura> getApparecchiature() {
        return apparecchiature;
    }

    public void setApparecchiature(Set<Apparecchiatura> apparecchiature) {
        this.apparecchiature = apparecchiature;
    }

    @Override
    public String toString() {
        return denominazione;
    }
}
