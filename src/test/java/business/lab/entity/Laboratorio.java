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

public class Laboratorio extends BaseEntity {


    private String denominazione;


    private Set<Dominio> domini;


    private Set<TipoApparecchiatura> tipiApparecchiatura;
    
    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public Set<Dominio> getDomini() {
        return domini;
    }

    public void setDomini(Set<Dominio> domini) {
        this.domini = domini;
    }

    @Override
    public String toString() {
        return denominazione;
    }

}
