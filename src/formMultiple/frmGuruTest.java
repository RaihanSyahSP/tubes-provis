/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formMultiple;

import database.Database;
import formDialogs.frmTambahGuru;
import formDialogs.frmUpdateGuru;
import formReport.frmReportGuru;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import models.Guru;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import tabelModels.GuruTableModel;

/**
 *
 * @author iqbal
 */
public class frmGuruTest extends javax.swing.JFrame {

    /**
     * Creates new form frmGuruTest
     */
    public frmGuruTest() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
        this.setLocationRelativeTo(null);
        tampilData();
    }
    Database db = new Database();
    GuruTableModel tabelGuru = new GuruTableModel();
    
    public void tampilData() {
        tabelGuru.setData(db.tampilGuru());
        tGuru.setModel(tabelGuru);
    }
    
     public void refreshData() {
        tabelGuru.setData(db.tampilGuru());
        tabelGuru.fireTableDataChanged();
        tGuru.changeSelection(0, 0, false, false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tGuru = new javax.swing.JTable();
        btnEditGuru = new javax.swing.JButton();
        btnHapusGuru = new javax.swing.JButton();
        btnCariGuru = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        rGuru = new javax.swing.JButton();
        rGurus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        btnTambah.setBackground(new java.awt.Color(255, 102, 0));
        btnTambah.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/plus (1).png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tGuru.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tGuru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tGuru);
        tGuru.getAccessibleContext().setAccessibleDescription("");

        btnEditGuru.setBackground(new java.awt.Color(255, 102, 0));
        btnEditGuru.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnEditGuru.setForeground(new java.awt.Color(255, 255, 255));
        btnEditGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/edit.png"))); // NOI18N
        btnEditGuru.setText("Edit");
        btnEditGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditGuruActionPerformed(evt);
            }
        });

        btnHapusGuru.setBackground(new java.awt.Color(255, 102, 0));
        btnHapusGuru.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnHapusGuru.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/delete.png"))); // NOI18N
        btnHapusGuru.setText("Hapus");
        btnHapusGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusGuruActionPerformed(evt);
            }
        });

        btnCariGuru.setBackground(new java.awt.Color(255, 102, 0));
        btnCariGuru.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnCariGuru.setForeground(new java.awt.Color(255, 255, 255));
        btnCariGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search.png"))); // NOI18N
        btnCariGuru.setText("Cari");
        btnCariGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariGuruActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
        btnRefresh.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Guru");

        btnKembali.setBackground(new java.awt.Color(0, 153, 0));
        btnKembali.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/back-arrow - Copy (2).png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorderPainted(false);
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        rGuru.setBackground(new java.awt.Color(51, 153, 255));
        rGuru.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        rGuru.setForeground(new java.awt.Color(255, 255, 255));
        rGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/printer.png"))); // NOI18N
        rGuru.setText("Filter Cetak Laporan");
        rGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGuruActionPerformed(evt);
            }
        });

        rGurus.setBackground(new java.awt.Color(51, 153, 255));
        rGurus.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        rGurus.setForeground(new java.awt.Color(255, 255, 255));
        rGurus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/printer.png"))); // NOI18N
        rGurus.setText("Cetak Semua");
        rGurus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rGurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGurusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditGuru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapusGuru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCariGuru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rGuru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129)
                        .addComponent(rGurus)
                        .addGap(18, 18, 18)))
                .addComponent(btnKembali))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKembali)
                            .addComponent(jLabel2)
                            .addComponent(rGurus)
                            .addComponent(rGuru)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditGuru)
                .addGap(18, 18, 18)
                .addComponent(btnHapusGuru)
                .addGap(18, 18, 18)
                .addComponent(btnCariGuru)
                .addGap(17, 17, 17)
                .addComponent(btnRefresh)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(103, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        frmTambahGuru frm = new frmTambahGuru(this, true);
        frm.setVisible(true);
        frm.txtNIP.setText("");
        frm.txtNama.setText("");
        frm.txtAlamat.setText("");
        frm.txtPendidikan.setText("");
        refreshData();
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnHapusGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusGuruActionPerformed
        // TODO add your handling code here:
        try {
            int baris = tGuru.getSelectedRow();
            String nip = (String) tabelGuru.getValueAt(baris, 0);
            String nama = (String) tabelGuru.getValueAt(baris, 1);
            String alamat = (String) tabelGuru.getValueAt(baris, 2);
            String pendidikan = (String) tabelGuru.getValueAt(baris, 3);
            Object[] pilihan = {"Ya", "Tidak"};
            int jawaban = JOptionPane.showOptionDialog(
                            null, 
                            "Anda Yakin data " + 
                            "Guru dengan NIP " + nip + 
                            " dengan nama " + nama + 
                            " akan" + "dihapus ?","Peringatan", 
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]  
            );
        
        if(jawaban==0) {
            db.hapusGuru(nip);
            refreshData();
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus");
        }
    }//GEN-LAST:event_btnHapusGuruActionPerformed

    private void btnCariGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariGuruActionPerformed
        // TODO add your handling code here:
        String kataKunci;
        kataKunci=JOptionPane.showInputDialog(null,"Data Guru yang dicari ?"
        ,"Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(kataKunci!=null)
        {
            tabelGuru.setData(db.filterGuru(kataKunci));
            tabelGuru.fireTableDataChanged();
        }  else {
            JOptionPane.showMessageDialog(null, "Data guru tidak ditemukan!!!");
        }
    }//GEN-LAST:event_btnCariGuruActionPerformed

    private void btnEditGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditGuruActionPerformed
        // TODO add your handling code here:
        frmUpdateGuru frm = new frmUpdateGuru(this, true);
        
        //lakukan pengecekan data berdasarkan pilihan kursor
        int baris = tGuru.getSelectedRow();
        String nip = (String) tabelGuru.getValueAt(baris, 0);
        Guru guru = db.pilihGuru(nip);
        if(guru != null) {
            frm.setForm(guru);
            frm.setVisible(true);
            refreshData();
        } else {
            JOptionPane.showMessageDialog(null, "Guu dengan NIP " + nip + " tidak ditemukan");
        }
        
    }//GEN-LAST:event_btnEditGuruActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void rGurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGurusActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(db.driver);
            Connection conn = DriverManager.getConnection(db.url, db.user, db.pass);
            // param
            HashMap param = new HashMap();
            
            // ambil data dari jrxml
            JasperReport jr = JasperCompileManager.compileReport("src/reports/reportGuru.jrxml");

            //print
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);
            
            //tampilkan data
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            JasperExportManager.exportReportToPdfFile(jp, "src/pdf/laporanGuru.pdf");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_rGurusActionPerformed

    private void rGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGuruActionPerformed
        // TODO add your handling code here:
        frmReportGuru frm = new frmReportGuru();
        frm.setVisible(true);
    }//GEN-LAST:event_rGuruActionPerformed

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
            java.util.logging.Logger.getLogger(frmGuruTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGuruTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGuruTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGuruTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuruTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariGuru;
    private javax.swing.JButton btnEditGuru;
    private javax.swing.JButton btnHapusGuru;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rGuru;
    private javax.swing.JButton rGurus;
    private javax.swing.JTable tGuru;
    // End of variables declaration//GEN-END:variables
}
