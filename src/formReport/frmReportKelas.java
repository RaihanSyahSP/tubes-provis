/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formReport;

import database.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lenovo
 */
public class frmReportKelas extends javax.swing.JFrame {

    /**
     * Creates new form frmReportKelas
     */
    public frmReportKelas() {
        initComponents();
        tampilIdKelas();
        tampilNamaKelas();
        tampilNamaGuru();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        cbIdKelas.setVisible(false);
        cbNamaK.setVisible(false);        
        cbNamaG.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    Database db = new Database();
    
    public void tampilIdKelas() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM kelas ORDER BY id_kelas";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("id_kelas"); 
                cbIdKelas.addItem((String)obj[0]);
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    public void tampilNamaKelas() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM kelas ORDER BY nama_kelas";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nama_kelas"); 
                cbNamaK.addItem((String)obj[0]);
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    public void tampilNamaGuru() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM guru ORDER BY nama_guru";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nama_guru"); 
                cbNamaG.addItem((String)obj[0]);
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbNamaK = new javax.swing.JComboBox<>();
        cbIdKelas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();
        cbNamaG = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbNamaK.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNamaK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbIdKelas.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbIdKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter Cetak Laporan Data Kelas");

        cbPilih.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Filter --", "Id Kelas", "Nama Kelas", "Nama Guru" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });

        cbNamaG.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNamaG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnCetak.setBackground(new java.awt.Color(51, 204, 0));
        btnCetak.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/printer.png"))); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbNamaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNamaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbIdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNamaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNamaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:

        if (cbPilih.getSelectedIndex() == 0) {
            cbNamaK.setVisible(false);
            cbIdKelas.setVisible(false);
            cbNamaG.setVisible(false);
            btnCetak.setVisible(false);
        } else if (cbPilih.getSelectedIndex() == 1) {
            cbNamaK.setVisible(false);
            cbIdKelas.setVisible(true);
            cbNamaG.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 2) {
            cbNamaK.setVisible(true);
            cbIdKelas.setVisible(false);
            cbNamaG.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 3) {
            cbIdKelas.setVisible(false);
            cbNamaK.setVisible(false);
            cbNamaG.setVisible(true);
            btnCetak.setVisible(true);
        }
    }//GEN-LAST:event_cbPilihActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(db.driver);
            Connection conn = DriverManager.getConnection(db.url, db.user, db.pass);
            // param
            HashMap param = new HashMap();

            // ambil data dari jrxml
            JasperReport jr = JasperCompileManager.compileReport("src/report/reportKelas.jrxml");
            param.put("id", cbIdKelas.getSelectedItem());
            param.put("namaK", cbNamaK.getSelectedItem());
            param.put("namaG", cbNamaG.getSelectedItem());

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);

            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanKelas.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

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
            java.util.logging.Logger.getLogger(frmReportKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    public javax.swing.JComboBox<String> cbIdKelas;
    public javax.swing.JComboBox<String> cbNamaG;
    public javax.swing.JComboBox<String> cbNamaK;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
