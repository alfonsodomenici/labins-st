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

public class GestioneDescrittiva extends BaseEntity{
    
    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    @Override
    public String toString() {
        return descrizione;
    }
}
