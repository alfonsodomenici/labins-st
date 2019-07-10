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

public class GestioneApparecchiatura  {


    public static enum Tipo {
        TEMPORALE, DESCRITTIVA, PRIMA_USO
    }


    private Tipo tipo;


    private GestioneTemporale temporale;


    private GestioneDescrittiva descrittiva;


    private Azienda azienda;


    private String attivita;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public GestioneTemporale getTemporale() {
        return temporale;
    }

    public void setTemporale(GestioneTemporale temporale) {
        this.temporale = temporale;
    }

    public GestioneDescrittiva getDescrittiva() {
        return descrittiva;
    }

    public void setDescrittiva(GestioneDescrittiva descrittiva) {
        this.descrittiva = descrittiva;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public String getAttivita() {
        return attivita;
    }

    public void setAttivita(String attivita) {
        this.attivita = attivita;
    }

    @Override
    public String toString() {
        return tipo.toString();
    }
}
