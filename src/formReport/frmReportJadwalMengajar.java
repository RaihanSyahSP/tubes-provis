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
public class frmReportJadwalMengajar extends javax.swing.JFrame {

    /**
     * Creates new form frmReportJadwalMengajar
     */
    public frmReportJadwalMengajar() {
        initComponents();
        tampilNama();
        tampilMapel();
        tampilWaktuM();
        tampilHari();
        tampilWaktuS();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        cbNama.setVisible(false);
        cbHari.setVisible(false);
        cbMapel.setVisible(false);
        cbWaktuM.setVisible(false);
        cbWaktuS.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    Database db = new Database();
    
    public void tampilNama() {
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
    
    public void tampilHari() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT hari FROM jadwal_mengajar ORDER BY hari";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("hari"); 
                cbHari.addItem((String)obj[0]);
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
    
    public void tampilWaktuM() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT waktu_mulai FROM jadwal_mengajar ORDER BY waktu_mulai";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("waktu_mulai"); 
                cbWaktuM.addItem((String)obj[0]);
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
    
    public void tampilWaktuS() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT waktu_selesai FROM jadwal_mengajar ORDER BY waktu_selesai";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("waktu_selesai"); 
                cbWaktuS.addItem((String)obj[0]);
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
        cbHari = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();
        cbWaktuM = new javax.swing.JComboBox<>();
        cbWaktuS = new javax.swing.JComboBox<>();

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

        cbHari.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter Cetak Laporan Data Jadwal Mengajar");

        cbPilih.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Filter --", "Nama Guru", "Mata Pelajaran", "Hari", "Waktu Mulai", "Waktu Start" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });

        cbWaktuM.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbWaktuM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbWaktuS.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbWaktuS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbWaktuM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbWaktuS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWaktuM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWaktuS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            JasperReport jr = JasperCompileManager.compileReport("src/report/reportJadwalMengajar.jrxml");
            param.put("nama", cbNama.getSelectedItem());
            param.put("mapel", cbMapel.getSelectedItem());
            param.put("hari", cbHari.getSelectedItem());
            param.put("waktum", cbWaktuM.getSelectedItem());
            param.put("waktus", cbWaktuS.getSelectedItem());

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);

            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanJadwalMengajar.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:

        if (cbPilih.getSelectedIndex() == 0) {
            cbNama.setVisible(false);
            cbHari.setVisible(false);
            cbMapel.setVisible(false);
            cbWaktuM.setVisible(false);
            cbWaktuS.setVisible(false);
            btnCetak.setVisible(false);
        } else if (cbPilih.getSelectedIndex() == 1) {
            cbNama.setVisible(true);
            cbHari.setVisible(false);
            cbMapel.setVisible(false);
            cbWaktuM.setVisible(false);
            cbWaktuS.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 2) {
            cbNama.setVisible(false);
            cbHari.setVisible(false);
            cbMapel.setVisible(true);
            cbWaktuM.setVisible(false);
            cbWaktuS.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 3) {
            cbHari.setVisible(true);
            cbNama.setVisible(false);
            cbMapel.setVisible(false);
            cbWaktuM.setVisible(false);
            cbWaktuS.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 4) {
            cbHari.setVisible(false);
            cbNama.setVisible(false);
            cbMapel.setVisible(false);
            cbWaktuM.setVisible(true);
            cbWaktuS.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 5) {
            cbHari.setVisible(false);
            cbNama.setVisible(false);
            cbMapel.setVisible(false);
            cbWaktuM.setVisible(false);
            cbWaktuS.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmReportJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportJadwalMengajar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    public javax.swing.JComboBox<String> cbHari;
    public javax.swing.JComboBox<String> cbMapel;
    public javax.swing.JComboBox<String> cbNama;
    private javax.swing.JComboBox<String> cbPilih;
    public javax.swing.JComboBox<String> cbWaktuM;
    public javax.swing.JComboBox<String> cbWaktuS;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
