/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author User
 */
public class TipUsluge {
  Integer sifraTipaUsluge;
  String nazivTipaUsluge;

    public TipUsluge(Integer sifraTipaUsluge, String nazivTipaUsluge) {
        this.sifraTipaUsluge = sifraTipaUsluge;
        this.nazivTipaUsluge = nazivTipaUsluge;
    }

    public Integer getSifraTipaUsluge() {
        return sifraTipaUsluge;
    }

    public void setSifraTipaUsluge(Integer sifraTipaUsluge) {
        this.sifraTipaUsluge = sifraTipaUsluge;
    }

    public String getNazivTipaUsluge() {
        return nazivTipaUsluge;
    }

    public void setNazivTipaUsluge(String nazivTipaUsluge) {
        this.nazivTipaUsluge = nazivTipaUsluge;
    }
  
}
