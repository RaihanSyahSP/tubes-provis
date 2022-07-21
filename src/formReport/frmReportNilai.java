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
public class frmReportNilai extends javax.swing.JFrame {

    /**
     * Creates new form frmReportNilai
     */
    public frmReportNilai() {
        initComponents();
        tampilNilai();
        tampilNama();
        tampilMapel();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        cbNama.setVisible(false);
        cbNilai.setVisible(false);
        cbMapel.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    Database db = new Database();
    
    public void tampilNilai() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT nilai FROM mempelajari ORDER BY nilai";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nilai"); 
                cbNilai.addItem((String)obj[0]);
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
    
    public void tampilNama() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM siswa ORDER BY nama_siswa";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nama_siswa"); 
                cbNama.addItem((String)obj[0]);
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
    
    public void tampilMapel() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM mata_pelajaran ORDER BY nama_mapel";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nama_mapel"); 
                cbMapel.addItem((String)obj[0]);
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

        cbMapel = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();
        cbNama = new javax.swing.JComboBox<>();
        cbNilai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbMapel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbMapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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

        cbNama.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbNilai.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter Cetak Laporan Data Nilai");

        cbPilih.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Filter --", "Nilai", "Nama Siswa", "Mata Pelajaran" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
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
                        .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(db.driver);
            Connection conn = DriverManager.getConnection(db.url, db.user, db.pass);
            // param
            HashMap param = new HashMap();

            // ambil data dari jrxml
            JasperReport jr = JasperCompileManager.compileReport("src/report/reportNilai.jrxml");
            param.put("nilai", cbNilai.getSelectedItem());
            param.put("nama", cbNama.getSelectedItem());
            param.put("mapel", cbMapel.getSelectedItem());

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);

            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanNilai.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:

        if (cbPilih.getSelectedIndex() == 0) {
            cbNama.setVisible(false);
            cbNilai.setVisible(false);
            cbMapel.setVisible(false);
            btnCetak.setVisible(false);
        } else if (cbPilih.getSelectedIndex() == 1) {
            cbNama.setVisible(false);
            cbNilai.setVisible(true);
            cbMapel.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 2) {
            cbNama.setVisible(true);
            cbNilai.setVisible(false);
            cbMapel.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 3) {
            cbNilai.setVisible(false);
            cbNama.setVisible(false);
            cbMapel.setVisible(true);
            btnCetak.setVisible(true);
        }
    }//GEN-LAST:event_cbPilihActionPerformed

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
            java.util.logging.Logger.getLogger(frmReportNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    public javax.swing.JComboBox<String> cbMapel;
    public javax.swing.JComboBox<String> cbNama;
    public javax.swing.JComboBox<String> cbNilai;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}