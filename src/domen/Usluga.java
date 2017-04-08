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
public class Usluga {
    
    Integer sifraUsluge;
    String  nazivUsluge;
    String  opisUsluge;
    Double  cenaUsluge;

    public Usluga(Integer sifraUsluge, String nazivUsluge, String opisUsluge, Double cenaUsluge) {
        this.sifraUsluge = sifraUsluge;
        this.nazivUsluge = nazivUsluge;
        this.opisUsluge = opisUsluge;
        this.cenaUsluge = cenaUsluge;
    }

    public Integer getSifraUsluge() {
        return sifraUsluge;
    }

    public void setSifraUsluge(Integer sifraUsluge) {
        this.sifraUsluge = sifraUsluge;
    }

    public String getNazivUsluge() {
        return nazivUsluge;
    }

    public void setNazivUsluge(String nazivUsluge) {
        this.nazivUsluge = nazivUsluge;
    }

    public String getOpisUsluge() {
        return opisUsluge;
    }

    public void setOpisUsluge(String opisUsluge) {
        this.opisUsluge = opisUsluge;
    }

    public Double getCenaUsluge() {
        return cenaUsluge;
    }

    public void setCenaUsluge(Double cenaUsluge) {
        this.cenaUsluge = cenaUsluge;
    }
    
}
