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
public class frmReportGuru extends javax.swing.JFrame {

    /**
     * Creates new form frmReportGuru
     */
    public frmReportGuru() {
        initComponents();
        tampilNIP();
        tampilNama();
        tampilAlamat();
        tampilPendidikan();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        cbNIP.setVisible(false);
        cbNama.setVisible(false);
        cbAlamat.setVisible(false);
        cbPendidikan.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    Database db = new Database();
    
    public void tampilNIP() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT nip FROM guru ORDER BY nip";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("nip"); 
                cbNIP.addItem((String)obj[0]);
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
            String query = "SELECT nama_guru FROM guru ORDER BY nama_guru";
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
    
    public void tampilAlamat() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT alamat FROM guru ORDER BY alamat";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("alamat"); 
                cbAlamat.addItem((String)obj[0]);
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
    
    public void tampilPendidikan() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(db.driver);
            conn = DriverManager.getConnection(db.url, db.user, db.pass);
            stmt = conn.createStatement();
            String query = "SELECT DISTINCT pendidikan FROM guru ORDER BY pendidikan";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                Object[] obj = new Object[1];
                obj[0] = rs.getString("pendidikan"); 
                cbPendidikan.addItem((String)obj[0]);
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

        cbNIP = new javax.swing.JComboBox<>();
        cbNama = new javax.swing.JComboBox<>();
        cbAlamat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();
        cbPendidikan = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbNIP.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbNama.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbAlamat.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbAlamat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter Cetak Laporan Data Guru");

        cbPilih.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Filter --", "NIP", "Nama Guru", "Alamat", "Pendidikan" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });

        cbPendidikan.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbPendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:

        if (cbPilih.getSelectedIndex() == 0) {
            cbNIP.setVisible(false);
            cbNama.setVisible(false);
            cbAlamat.setVisible(false);
            cbPendidikan.setVisible(false);
            btnCetak.setVisible(false);
        } else if (cbPilih.getSelectedIndex() == 1) {
            cbNIP.setVisible(true);
            cbNama.setVisible(false);
            cbAlamat.setVisible(false);
            cbPendidikan.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 2) {
            cbNama.setVisible(true);
            cbNIP.setVisible(false);
            cbAlamat.setVisible(false);
            cbPendidikan.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 3) {
            cbAlamat.setVisible(true);
            cbNama.setVisible(false);
            cbNIP.setVisible(false);
            cbPendidikan.setVisible(false);
            btnCetak.setVisible(true);
        } else if (cbPilih.getSelectedIndex() == 4) {
            cbAlamat.setVisible(false);
            cbNama.setVisible(false);
            cbNIP.setVisible(false);
            cbPendidikan.setVisible(true);
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
            JasperReport jr = JasperCompileManager.compileReport("src/report/reportGuru.jrxml");
            param.put("nip", cbNIP.getSelectedItem());
            param.put("nama", cbNama.getSelectedItem());
            param.put("alamat", cbAlamat.getSelectedItem());
            param.put("pendidikan", cbPendidikan.getSelectedItem());

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);

            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanGuru.pdf");

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
            java.util.logging.Logger.getLogger(frmReportGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    public javax.swing.JComboBox<String> cbAlamat;
    public javax.swing.JComboBox<String> cbNIP;
    public javax.swing.JComboBox<String> cbNama;
    public javax.swing.JComboBox<String> cbPendidikan;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
