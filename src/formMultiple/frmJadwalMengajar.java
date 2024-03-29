/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formMultiple;

import database.Database;
import formDialogs.frmTambahJadwalMengajar;
import formReport.frmReportJadwalMengajar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import tabelModels.JadwalMengajarTableModel;

/**
 *
 * @author HP
 */
public class frmJadwalMengajar extends javax.swing.JFrame {

    private Object tJadwalMengajar;

    /**
     * Creates new form frmJadwalMengajar
     */
    public frmJadwalMengajar() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        tampilData();
    }
    Database db = new Database();
    JadwalMengajarTableModel tabelJadwalMengajar = new JadwalMengajarTableModel();
    
    public void tampilData() {
        tabelJadwalMengajar.setData(db.tampilJadwalMengajar());
        tjadwalmengajar.setModel(tabelJadwalMengajar);
    }
    
     public void refreshData() {
        tabelJadwalMengajar.setData(db.tampilJadwalMengajar());
        tabelJadwalMengajar.fireTableDataChanged();
        tjadwalmengajar.changeSelection(0, 0, false, false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tjadwalmengajar = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnCariJadwalAjar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        rNilai = new javax.swing.JButton();
        rNilais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tjadwalmengajar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tjadwalmengajar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tjadwalmengajar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tjadwalmengajar);

        btnTambah.setBackground(new java.awt.Color(255, 102, 0));
        btnTambah.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/plus (1).png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Guru");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Jadwal Mengajar");

        btnKembali.setBackground(new java.awt.Color(0, 153, 0));
        btnKembali.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/back-arrow - Copy (2).png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorderPainted(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnCariJadwalAjar.setBackground(new java.awt.Color(255, 102, 0));
        btnCariJadwalAjar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnCariJadwalAjar.setForeground(new java.awt.Color(255, 255, 255));
        btnCariJadwalAjar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search.png"))); // NOI18N
        btnCariJadwalAjar.setText("Cari");
        btnCariJadwalAjar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariJadwalAjarActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
        btnRefresh.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        rNilai.setBackground(new java.awt.Color(51, 153, 255));
        rNilai.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        rNilai.setForeground(new java.awt.Color(255, 255, 255));
        rNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/printer.png"))); // NOI18N
        rNilai.setText("Filter Cetak Laporan");
        rNilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNilaiActionPerformed(evt);
            }
        });

        rNilais.setBackground(new java.awt.Color(51, 153, 255));
        rNilais.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        rNilais.setForeground(new java.awt.Color(255, 255, 255));
        rNilais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/printer.png"))); // NOI18N
        rNilais.setText("Cetak Semua");
        rNilais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rNilais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNilaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rNilai)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(rNilais))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCariJadwalAjar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(jLabel2)
                    .addContainerGap(358, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnKembali)
                            .addComponent(rNilais, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariJadwalAjar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jLabel2)
                    .addContainerGap(327, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        frmTambahJadwalMengajar frm = new frmTambahJadwalMengajar(this, true);
        frm.setVisible(true);
        frm.txtWaktuMulai.setText("");
        frm.txtWaktuSelesai.setText("");
        frm.cbHari.setSelectedIndex(0);
        frm.cbNip.setSelectedIndex(0);
        frm.cbNoMapel.setSelectedIndex(0);
        
        refreshData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnCariJadwalAjarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariJadwalAjarActionPerformed
        // TODO add your handling code here:
        String kataKunci;
        kataKunci=JOptionPane.showInputDialog(null,"Jadwal mengajar mapel yang dicari ?"
            ,"Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(kataKunci!=null)
        {
            tabelJadwalMengajar.setData(db.filterJadwalMengajar(kataKunci));
            tabelJadwalMengajar.fireTableDataChanged();
        }  else {
            JOptionPane.showMessageDialog(null, "Jadwal mengajar mapel tidak ditemukan!!!");
        }
    }//GEN-LAST:event_btnCariJadwalAjarActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void rNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNilaiActionPerformed
        // TODO add your handling code here:
        frmReportJadwalMengajar frm = new frmReportJadwalMengajar();
        frm.setVisible(true);
    }//GEN-LAST:event_rNilaiActionPerformed

    private void rNilaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNilaisActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(db.driver);
            Connection conn = DriverManager.getConnection(db.url, db.user, db.pass);
            // param
            HashMap param = new HashMap();

            // ambil data dari jrxml
            JasperReport jr = JasperCompileManager.compileReport("src/reports/reportJadwalMengajar.jrxml");

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);

            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanJadwalMengajar.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_rNilaisActionPerformed

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
            java.util.logging.Logger.getLogger(frmJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJadwalMengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJadwalMengajar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariJadwalAjar;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rNilai;
    private javax.swing.JButton rNilais;
    private javax.swing.JTable tjadwalmengajar;
    // End of variables declaration//GEN-END:variables

}
