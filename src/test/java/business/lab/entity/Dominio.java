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

public class Dominio extends BaseEntity {


    private String denominazione;


    private Laboratorio laboratorio;


    private Set<CatenaMisura> cateneMisura;

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Set<CatenaMisura> getCateneMisura() {
        return cateneMisura;
    }

    public void setCateneMisura(Set<CatenaMisura> cateneMisura) {
        this.cateneMisura = cateneMisura;
    }

    @Override
    public String toString() {
        return denominazione;
    }

}
