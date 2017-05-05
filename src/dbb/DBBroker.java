/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbb;

import domen.KartonPacijenta;
import domen.TipUsluge;
import domen.Usluga;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

/**
 *
 * @author User
 */
public class DBBroker {

    Connection konekcija;

    public void ucitajDrajver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void otvoriKonekciju() throws IOException {
        DBUtil dbutil=new DBUtil();
        String url = dbutil.vratiUrl();
        String user = dbutil.vratiKorisnika();
        String pass = dbutil.vratiSifru();
        try {
            konekcija = DriverManager.getConnection(url, user, pass);
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void potvrdiTransakciju() {
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ponistitransakciju() {
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void zatvoriKonekciju() {
        try {
            konekcija.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void sacuvajKartonPacijenta(KartonPacijenta k) {
//        String upit="insert into kartonipacijenata values(?,?,?,?,?,?,?,?)";
//        try {
//            PreparedStatement ps=konekcija.prepareStatement(upit);
//            ps.setString(1, k.getJmbg());
//            ps.setInt(2, k.getLbo());
//            ps.setString(3, k.getIme());
//            ps.setString(4, k.getPrezime());
//            ps.setString(5, k.getPol());
//            ps.setDate(6, new Date(k.getDatumRođenja().getTime()));
//            ps.setString(7, k.getAdresa()); 
//            ps.setString(8, k.getKontaktTelefon());
//            ps.setString(9, k.getKrvnaGrupa());
//            
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    public ArrayList<TipUsluge> vratilistuTipovaUsluga() {
        ArrayList<TipUsluge> listaTipovaUsluga = new ArrayList<>();
        String upit = "select * from tipusluge order by NazivTipaUsluge asc";

        try {
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                int sifraUsluge = rs.getInt("ŠifraTipaUsluge");
                String nazivUsluge = rs.getString("NazivTipaUsluge");
                TipUsluge tu = new TipUsluge(sifraUsluge, nazivUsluge);
                listaTipovaUsluga.add(tu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTipovaUsluga;
    }

    public ArrayList<Usluga> vratiListuUsluga() {
        ArrayList<Usluga> listaUsluga = new ArrayList<>();
        String upit = "select * from usluga join tipusluge using(ŠifraTipaUsluge) order by ŠifraUsluge asc";

        try {
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Usluga u = new Usluga(rs.getInt("ŠifraUsluge"), rs.getString("NazivUsluge"), rs.getString("OpisUsluge"), rs.getDouble("CenaUsluge"), new TipUsluge(rs.getInt("ŠifraTipaUsluge"), rs.getString("NazivTipaUsluge")));
                listaUsluga.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsluga;
    }

    public int vratiID() {
        int id = 0;
        String upit = "select max(ŠifraUsluge) as id from usluga";

        try {
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                id = rs.getInt("id");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ++id;
    }

    public boolean sacuvajUslugu(Usluga u) {
        boolean uspesno;
        String upit = "insert into usluga values(?,?,?,?,?)";
        try {
            PreparedStatement ps = konekcija.prepareStatement(upit);
            ps.setInt(1, u.getSifraUsluge());
            ps.setString(2, u.getNazivUsluge());
            ps.setString(3, u.getOpisUsluge());
            ps.setDouble(4, u.getCenaUsluge());
            ps.setInt(5, u.getTu().getSifraTipaUsluge());

            ps.executeUpdate();
            uspesno = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            uspesno = false;
        }
        return uspesno;
    }

    public void obrisiUslugu(Usluga usluga) {
        String upit = "delete from usluga where ŠifraUsluge=?";

        PreparedStatement ps;
        try {
            ps = konekcija.prepareStatement(upit);
            ps.setInt(1, usluga.getSifraUsluge());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void izmeniUslugu(Usluga u) {
        String upit = "update usluga set ŠifraUsluge=?, NazivUsluge=?,  OpisUsluge=?, CenaUsluge=?, ŠifraTipaUsluge=? where ŠifraUsluge=? ";
        try {
            PreparedStatement ps = konekcija.prepareStatement(upit);
            ps.setInt(1, u.getSifraUsluge());
            ps.setString(2, u.getNazivUsluge());
            ps.setString(3, u.getOpisUsluge());
            ps.setDouble(4, u.getCenaUsluge());
            ps.setInt(5, u.getTu().getSifraTipaUsluge());
            ps.setInt(6, u.getSifraUsluge());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
