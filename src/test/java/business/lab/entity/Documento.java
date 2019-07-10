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

public class Documento extends AbstractEntity {

    public static enum Tipo {
        CERTIFICATO, MANUALE_TECNICO
    }


    private String denominazione;
    

    private String file;


    private Tipo tipo;
    

    private String mediaType;

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
    
    @Override
    public String toString() {
        return denominazione;
    }
}
