/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Pregled {
//dodaj da cuvas trajanje pregleda hm?? tacno vreme dolaska posete i odlaska
    private Integer brojPregleda;
    private Date datumPregleda;
    private Date vremePregleda;
    private String krvniPritisak;
    private Integer puls;
    private String anamneza;
    private KartonPacijenta kartonPacijenta;

    public Pregled() {
    }

    public Pregled(Integer brojPregleda, Date datumPregleda, Date vremePregleda, String krvniPritisak, Integer puls, String anamneza, KartonPacijenta kartonPacijenta) {
        this.brojPregleda = brojPregleda;
        this.datumPregleda = datumPregleda;
        this.vremePregleda = vremePregleda;
        this.krvniPritisak = krvniPritisak;
        this.puls = puls;
        this.anamneza = anamneza;
        this.kartonPacijenta = kartonPacijenta;
    }

    public Integer getBrojPregleda() {
        return brojPregleda;
    }

    public void setBrojPregleda(Integer brojPregleda) {
        this.brojPregleda = brojPregleda;
    }

    public Date getDatumPregleda() {
        return datumPregleda;
    }

    public void setDatumPregleda(Date datumPregleda) {
        this.datumPregleda = datumPregleda;
    }

    public Date getVremePregleda() {
        return vremePregleda;
    }

    public void setVremePregleda(Date vremePregleda) {
        this.vremePregleda = vremePregleda;
    }

    public String getKrvniPritisak() {
        return krvniPritisak;
    }

    public void setKrvniPritisak(String krvniPritisak) {
        this.krvniPritisak = krvniPritisak;
    }

    public Integer getPuls() {
        return puls;
    }

    public void setPuls(Integer puls) {
        this.puls = puls;
    }

    public String getAnamneza() {
        return anamneza;
    }

    public void setAnamneza(String anamneza) {
        this.anamneza = anamneza;
    }

    public KartonPacijenta getKartonPacijenta() {
        return kartonPacijenta;
    }

    public void setKartonPacijenta(KartonPacijenta kartonPacijenta) {
        this.kartonPacijenta = kartonPacijenta;
    }

     

}
