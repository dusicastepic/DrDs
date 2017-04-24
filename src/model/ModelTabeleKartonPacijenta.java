/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.KartonPacijenta;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ModelTabeleKartonPacijenta extends AbstractTableModel {

    ArrayList<KartonPacijenta> listaKartonaPacijenata = new ArrayList<>();
    String[] kolone = {"JMBG", "LBO", "Ime", "Prezime", "Pol", "Datum rođenja", "Adresa", "Kontakt telefon", "Krvna grupa"};

    @Override
    public int getRowCount() {
        return listaKartonaPacijenata.size();
    }

    @Override
    public int getColumnCount() {

        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KartonPacijenta kp = listaKartonaPacijenata.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return kp.getJmbg();
            case 1:
                return kp.getLbo();
            case 2:
                return kp.getIme();
            case 3:
                return kp.getPrezime();
            case 4:
                return kp.getPol();
            case 5:
                return kp.getDatumRođenja();
            case 6:
                return kp.getAdresa();
            case 7:
                return kp.getKontaktTelefon();
            case 8:
                return kp.getKrvnaGrupa();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

}
