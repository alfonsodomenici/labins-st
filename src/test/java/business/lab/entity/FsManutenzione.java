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

public class FsManutenzione extends AbstractEntity {


    private LocalDate certificatoIl;
    private boolean accreditato;

    private Azienda azienda;

    private Apparecchiatura riferimento;

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public Apparecchiatura getRiferimento() {
        return riferimento;
    }

    public void setRiferimento(Apparecchiatura riferimento) {
        this.riferimento = riferimento;
    }

    public LocalDate getCertificatoIl() {
        return certificatoIl;
    }

    public void setCertificatoIl(LocalDate certificatoIl) {
        this.certificatoIl = certificatoIl;
    }

    public boolean isAccreditato() {
        return accreditato;
    }

    public void setAccreditato(boolean accreditato) {
        this.accreditato = accreditato;
    }
}
