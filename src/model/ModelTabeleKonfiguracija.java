/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ModelTabeleKonfiguracija extends AbstractTableModel{

    String[]kolone={"URL","Korisnik","Lozinka"};
    @Override
    public int getRowCount() {
        return kolone.length;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
