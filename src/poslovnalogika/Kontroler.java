/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poslovnalogika;

import dbb.DBBroker;
import domen.TipUsluge;
import domen.Usluga;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Kontroler {

    private static Kontroler instance;
    private DBBroker dbb;

    private Kontroler() {
        dbb = new DBBroker();
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

//    public void sacuvajKartonPacijenta(KartonPacijenta karton) {
//        dbb.ucitajDrajver();
//        dbb.otvoriKonekciju();
//        dbb.sacuvajKartonPacijenta(karton);
////        dbb.zatvoriKonekciju();
//    }
    public ArrayList<TipUsluge> vratiListuTipovaUsluga() {
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
        ArrayList<TipUsluge> listaTipovaUsluga = dbb.vratilistuTipovaUsluga();
        dbb.zatvoriKonekciju();
        return listaTipovaUsluga;
    }

    public int vratiID() {
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
        int id = dbb.vratiID();
        dbb.zatvoriKonekciju();
        return id++;
    }

    public boolean sacuvajUslugu(Usluga u) {
        boolean uspesno;
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
//        int id = dbb.vratiID();
        uspesno = dbb.sacuvajUslugu(u);
        if (uspesno) {
            dbb.potvrdiTransakciju();
        } else {
            dbb.ponistitransakciju();
        }
//        id++;
        dbb.zatvoriKonekciju();
        return uspesno;
    }

    public ArrayList<Usluga> vratiListuUsluga() {
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
        ArrayList<Usluga> listaUsluga = dbb.vratiListuUsluga();
        dbb.zatvoriKonekciju();
        return listaUsluga;
    }

    public void obrisiUslugu(Usluga usluga) {
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
        dbb.obrisiUslugu(usluga);
        dbb.potvrdiTransakciju();
        dbb.zatvoriKonekciju();
    }

    public void izmeniUslugu(Usluga usluga) {
        dbb.ucitajDrajver();
        dbb.otvoriKonekciju();
        dbb.izmeniUslugu(usluga);
        dbb.potvrdiTransakciju();
        dbb.zatvoriKonekciju();
    }

}
