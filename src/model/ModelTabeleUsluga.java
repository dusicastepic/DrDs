/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Usluga;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import poslovnalogika.Kontroler;

/**
 *
 * @author User
 */
public class ModelTabeleUsluga extends AbstractTableModel {

    ArrayList<Usluga> listaUsluga;
    String[] kolone = {"Šifra usluge", "Naziv usluge", "Opis", "Cena", "Tip usluge"};

    public ModelTabeleUsluga() {
        listaUsluga = Kontroler.getInstance().vratiListuUsluga();
    }

    public ModelTabeleUsluga(ArrayList<Usluga> listaUsluga) {
        this.listaUsluga = listaUsluga;
    }

    @Override
    public int getRowCount() {
        return listaUsluga.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usluga u = listaUsluga.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getSifraUsluge();
            case 1:
                return u.getNazivUsluge();
            case 2:
                return u.getOpisUsluge();
            case 3:
                return u.getCenaUsluge();
            case 4:
                return u.getTu().getNazivTipaUsluge();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodaj(Usluga usluga) {
        listaUsluga.add(usluga);
        fireTableDataChanged();
    }

    public void obrisi(int red) throws SQLException {
        Usluga usluga=listaUsluga.get(red);
        Kontroler.getInstance().obrisiUslugu(usluga);
        listaUsluga.remove(red);
        fireTableDataChanged();

    }

    public void izmeniRed(int red,Usluga usluga) {
        listaUsluga.remove(red);
        fireTableDataChanged();
        Kontroler.getInstance().izmeniUslugu(usluga);
    }

    public ArrayList<Usluga> vratiListuUsluga() {
        return listaUsluga;
    }

}
