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

    private String jmbg;
    private int lbo;
    private String ime;
    private String prezime;
    private String pol;
    private Date datumRođenja;
    private String adresa;
    private String kontaktTelefon;
    private String krvnaGrupa;

    public KartonPacijenta() {
    }

    public KartonPacijenta(String jmbg, int lbo, String ime, String prezime, String pol, Date datumRođenja, String adresa, String kontaktTelefon, String krvnaGrupa) {
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

    public int getLbo() {
        return lbo;
    }

    public void setLbo(int lbo) {
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

    public Date getDatumRođenja() {
        return datumRođenja;
    }

    public void setDatumRođenja(Date datumRođenja) {
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
