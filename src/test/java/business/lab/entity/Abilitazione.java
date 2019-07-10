/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.lab.entity;

/**
 *
 * @author utente
 */
public class Abilitazione extends BaseEntity {

    public static enum Livello {
        NO_ACCESS, LETTURA, MODIFICA
    }

    private String utente;

    private Laboratorio laboratorio;

    private Livello livello;

    public String getUtente() {
        return utente;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return "Abilitazione{" + "utente=" + utente + ", laboratorio=" + laboratorio + ", livello=" + livello + '}';
    }

}
