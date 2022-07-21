/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formReport;

import database.Database;
import formMultiple.frmSiswa;
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
public class frmReportSiswa extends javax.swing.JFrame {

    /** Creates new form frmReportSiswa */
    public frmReportSiswa() {
        initComponents();
        tampilNis();
        tampilNama();
        tampilJK();
        tampilKelas();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        cbNIS.setVisible(false);
        cbNama.setVisible(false);
        cbJK.setVisible(false);
        cbKelas.setVisible(false);
        btnCetak.setVisible(false);
    }
    Database db = new Database();
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
//    public void tampilSiswa(String field) {
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            Class.forName(driver);
//            conn = DriverManager.getConnection(url, user, pass);
//            stmt = conn.createStatement();
//            String query = "SELECT * FROM siswa ORDER BY " + field;
//            ResultSet rs = stmt.executeQuery(query);
//            
//            while (rs.next()) {                
//                Object[] obj = new Object[1];
//                obj[0] = rs.getString(field); 
//                cbBaris.addItem((String)obj[0]);
//            }
//            rs.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error :" + e.getMessage());
//        } finally {
//            try {
//                stmt.close();
//            } catch (Exception e) {}
//            try {
//                conn.close();
//            }catch (Exception e) {}
//        }
//    }
    public void tampilNis() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM siswa ORDER BY nis";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nis"); 
                cbNIS.addItem((String)obj[0]);
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
    
    public void tampilJK() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT jenis_kelamin FROM siswa ORDER BY jenis_kelamin";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("jenis_kelamin"); 
                cbJK.addItem((String)obj[0]);
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
    
    public void tampilKelas() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT k.nama_kelas FROM siswa s JOIN kelas k ON s.id_kelas = k.id_kelas ORDER BY k.nama_kelas";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nama_kelas"); 
                cbKelas.addItem((String)obj[0]);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCetak = new javax.swing.JButton();
        cbNIS = new javax.swing.JComboBox<>();
        cbNama = new javax.swing.JComboBox<>();
        cbJK = new javax.swing.JComboBox<>();
        cbPilih = new javax.swing.JComboBox<>();
        cbKelas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        cbNIS.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbNama.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbJK.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbPilih.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Filter --", "NIS", "Nama Siswa", "Jenis Kelamin", "Kelas" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });

        cbKelas.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter Cetak Laporan Data Siswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
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
                    .addComponent(cbNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            JasperReport jr = JasperCompileManager.compileReport("src/report/reportSiswa.jrxml");
            param.put("nis", cbNIS.getSelectedItem());
            param.put("nama", cbNama.getSelectedItem());
            param.put("jk", cbJK.getSelectedItem());
            param.put("kelas", cbKelas.getSelectedItem());

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);
            
            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanSiswa.pdf");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:

        if (cbPilih.getSelectedIndex() == 0) {
            cbNIS.setVisible(false);
            cbNama.setVisible(false);
            cbJK.setVisible(false);
            cbKelas.setVisible(false);
            btnCetak.setVisible(false);
        } else if (cbPilih.getSelectedIndex() == 1) {
            cbNIS.setVisible(true);
            cbNama.setVisible(false);
            cbJK.setVisible(false);
            cbKelas.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 2) {
            cbNama.setVisible(true);
            cbNIS.setVisible(false);
            cbJK.setVisible(false);
            cbKelas.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 3) {
            cbJK.setVisible(true);
            cbNama.setVisible(false);
            cbNIS.setVisible(false);
            cbKelas.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 4) {
            cbJK.setVisible(false);
            cbNama.setVisible(false);
            cbNIS.setVisible(false);
            cbKelas.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmReportSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    public javax.swing.JComboBox<String> cbJK;
    public javax.swing.JComboBox<String> cbKelas;
    public javax.swing.JComboBox<String> cbNIS;
    public javax.swing.JComboBox<String> cbNama;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}