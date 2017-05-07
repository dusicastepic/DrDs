/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import forme.kartonpacijenta.FrmKartonPacijenta;
import forme.usluga.FrmUsluga;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.DBUtil;

/**
 *
 * @author User
 */
public class FrmGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FrmGlavna
     */
    public FrmGlavna() {
        initComponents();
        srediPanele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        JPanelBaza = new javax.swing.JPanel();
        jLabelURL = new javax.swing.JLabel();
        jLabelKorisničkoIme = new javax.swing.JLabel();
        jLabelLozinka = new javax.swing.JLabel();
        jTextFieldURL = new javax.swing.JTextField();
        jTextFieldKorisničkoIme = new javax.swing.JTextField();
        jTextFieldLozinka = new javax.swing.JTextField();
        jButtonPrijaviSe = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuKartoniPacijenata = new javax.swing.JMenu();
        JMenuItemNoviKarton = new javax.swing.JMenuItem();
        JMenuItemPrikazKartona = new javax.swing.JMenuItem();
        jMenuUsluge = new javax.swing.JMenu();
        jMenuItemPokreni = new javax.swing.JMenuItem();
        jMenuKonfiguracija = new javax.swing.JMenu();
        jMenuItemBaza = new javax.swing.JMenuItem();
        jMenuOAplikaciji = new javax.swing.JMenu();
        JMenuItemOAutoru = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelURL.setText("URL");

        jLabelKorisničkoIme.setText("Korisničko ime");

        jLabelLozinka.setText("Lozinka");

        jTextFieldKorisničkoIme.setText(" ");

        jTextFieldLozinka.setText(" ");

        jButtonPrijaviSe.setText("Prijavi se");
        jButtonPrijaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrijaviSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBazaLayout = new javax.swing.GroupLayout(JPanelBaza);
        JPanelBaza.setLayout(JPanelBazaLayout);
        JPanelBazaLayout.setHorizontalGroup(
            JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBazaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPrijaviSe)
                    .addGroup(JPanelBazaLayout.createSequentialGroup()
                        .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelURL)
                            .addComponent(jLabelKorisničkoIme)
                            .addComponent(jLabelLozinka))
                        .addGap(42, 42, 42)
                        .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldURL)
                            .addComponent(jTextFieldKorisničkoIme)
                            .addComponent(jTextFieldLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        JPanelBazaLayout.setVerticalGroup(
            JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBazaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelURL)
                    .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelKorisničkoIme)
                    .addComponent(jTextFieldKorisničkoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLozinka)
                    .addComponent(jTextFieldLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButtonPrijaviSe)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(JPanelBaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(JPanelBaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuKartoniPacijenata.setText("KartoniPacijenata");
        jMenuKartoniPacijenata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKartoniPacijenataActionPerformed(evt);
            }
        });

        JMenuItemNoviKarton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        JMenuItemNoviKarton.setText(" Novi karton");
        JMenuItemNoviKarton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemNoviKartonActionPerformed(evt);
            }
        });
        jMenuKartoniPacijenata.add(JMenuItemNoviKarton);

        JMenuItemPrikazKartona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        JMenuItemPrikazKartona.setText("Prikaz svih kartona");
        JMenuItemPrikazKartona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemPrikazKartonaActionPerformed(evt);
            }
        });
        jMenuKartoniPacijenata.add(JMenuItemPrikazKartona);

        jMenuBar1.add(jMenuKartoniPacijenata);

        jMenuUsluge.setText("Usluge");

        jMenuItemPokreni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        jMenuItemPokreni.setText("Pokreni");
        jMenuItemPokreni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPokreniActionPerformed(evt);
            }
        });
        jMenuUsluge.add(jMenuItemPokreni);

        jMenuBar1.add(jMenuUsluge);

        jMenuKonfiguracija.setText("Konfiguracija");

        jMenuItemBaza.setText("Baza");
        jMenuItemBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBazaActionPerformed(evt);
            }
        });
        jMenuKonfiguracija.add(jMenuItemBaza);

        jMenuBar1.add(jMenuKonfiguracija);

        jMenuOAplikaciji.setText("O aplikaciji");

        JMenuItemOAutoru.setText("O autoru");
        JMenuItemOAutoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemOAutoruActionPerformed(evt);
            }
        });
        jMenuOAplikaciji.add(JMenuItemOAutoru);

        jMenuBar1.add(jMenuOAplikaciji);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemOAutoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemOAutoruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuItemOAutoruActionPerformed

    private void jMenuKartoniPacijenataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKartoniPacijenataActionPerformed

    }//GEN-LAST:event_jMenuKartoniPacijenataActionPerformed

    private void JMenuItemNoviKartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemNoviKartonActionPerformed
        FrmKartonPacijenta jfkartonpacijenta = new FrmKartonPacijenta(this, true);
        jfkartonpacijenta.getJtabpanelistakartona().setSelectedIndex(0);
        jfkartonpacijenta.setVisible(true);    }//GEN-LAST:event_JMenuItemNoviKartonActionPerformed

    private void JMenuItemPrikazKartonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemPrikazKartonaActionPerformed
        FrmKartonPacijenta jdialoglistakartona = new FrmKartonPacijenta(this, true);
        jdialoglistakartona.getJtabpanelistakartona().setSelectedIndex(1);
        jdialoglistakartona.setLayout(new BorderLayout());
        //  jdialoglistakartona.add(new FrmPrikazKartonaPacijenataTabela(),BorderLayout.CENTER);
        pack();
        jdialoglistakartona.setVisible(true);
    }//GEN-LAST:event_JMenuItemPrikazKartonaActionPerformed

    private void jMenuItemPokreniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPokreniActionPerformed
        JFrame frmu = new FrmUsluga();
        frmu.setVisible(true);
    }//GEN-LAST:event_jMenuItemPokreniActionPerformed

    private void jMenuItemBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBazaActionPerformed
        JPanelBaza.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemBazaActionPerformed

    private void jButtonPrijaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrijaviSeActionPerformed
        String url = jTextFieldURL.getText().trim();
        String user = jTextFieldKorisničkoIme.getText().trim();
        String pass = jTextFieldLozinka.getText().trim();
        try {
            DBUtil dbu = new DBUtil();
            if (dbu.vratiUrl().equalsIgnoreCase(url) &&  dbu.vratiKorisnika().equalsIgnoreCase(user) && dbu.vratiSifru().equalsIgnoreCase(pass)) {
                JPanelBaza.setVisible(false);
                JOptionPane.showMessageDialog(this, "Prijava uspešna!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
            }
            else    
                JOptionPane.showMessageDialog(this, "Prijava neuspešna!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(FrmGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonPrijaviSeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGlavna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemNoviKarton;
    private javax.swing.JMenuItem JMenuItemOAutoru;
    private javax.swing.JMenuItem JMenuItemPrikazKartona;
    private javax.swing.JPanel JPanelBaza;
    private javax.swing.JButton jButtonPrijaviSe;
    private javax.swing.JLabel jLabelKorisničkoIme;
    private javax.swing.JLabel jLabelLozinka;
    private javax.swing.JLabel jLabelURL;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemBaza;
    private javax.swing.JMenuItem jMenuItemPokreni;
    private javax.swing.JMenu jMenuKartoniPacijenata;
    private javax.swing.JMenu jMenuKonfiguracija;
    private javax.swing.JMenu jMenuOAplikaciji;
    private javax.swing.JMenu jMenuUsluge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextFieldKorisničkoIme;
    private javax.swing.JTextField jTextFieldLozinka;
    private javax.swing.JTextField jTextFieldURL;
    // End of variables declaration//GEN-END:variables

    private void srediPanele() {
        JPanelBaza.setVisible(false);
    }
}
