package domen;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class KartonPacijenta {
    
    String jmbg;
    String lbo;
    String ime;
    String prezime;
    String pol;
    String datumRođenja;
    String adresa;
    String kontaktTelefon;
    String krvnaGrupa;

    public KartonPacijenta(String jmbg, String lbo, String ime, String prezime, String pol, String datumRođenja, String adresa, String kontaktTelefon, String krvnaGrupa) {
        this.jmbg = jmbg;
        this.lbo = lbo;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRođenja = datumRođenja;
        this.adresa = adresa;
        this.kontaktTelefon = kontaktTelefon;
        this.krvnaGrupa = krvnaGrupa;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getLbo() {
        return lbo;
    }

    public void setLbo(String lbo) {
        this.lbo = lbo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getDatumRođenja() {
        return datumRođenja;
    }

    public void setDatumRođenja(String datumRođenja) {
        this.datumRođenja = datumRođenja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    public void setKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
    }

    public String getKrvnaGrupa() {
        return krvnaGrupa;
    }

    public void setKrvnaGrupa(String krvnaGrupa) {
        this.krvnaGrupa = krvnaGrupa;
    }
    
    
            
   
            
    
}
