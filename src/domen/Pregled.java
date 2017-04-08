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
    
    Integer brojPregleda;
    Date datumPregleda;
    Date vremePregleda;
    Integer sistolniKrvniPritisak;
    Integer dijastolniKrvniPritisak;
    Integer puls;
    String anamneza;

    public Pregled(Integer brojPregleda, Date datumPregleda, Date vremePregleda, Integer sistolniKrvniPritisak, Integer dijastolniKrvniPritisak, Integer puls, String anamneza) {
        this.brojPregleda = brojPregleda;
        this.datumPregleda = datumPregleda;
        this.vremePregleda = vremePregleda;
        this.sistolniKrvniPritisak = sistolniKrvniPritisak;
        this.dijastolniKrvniPritisak = dijastolniKrvniPritisak;
        this.puls = puls;
        this.anamneza = anamneza;
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

    public Integer getSistolniKrvniPritisak() {
        return sistolniKrvniPritisak;
    }

    public void setSistolniKrvniPritisak(Integer sistolniKrvniPritisak) {
        this.sistolniKrvniPritisak = sistolniKrvniPritisak;
    }

    public Integer getDijastolniKrvniPritisak() {
        return dijastolniKrvniPritisak;
    }

    public void setDijastolniKrvniPritisak(Integer dijastolniKrvniPritisak) {
        this.dijastolniKrvniPritisak = dijastolniKrvniPritisak;
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
    
    
 
    
  
    
}
