/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;


import formMultiple.frmGuruTest;
import formMultiple.frmJadwalMengajar;
import formMultiple.frmKelas;
import formMultiple.frmMapel;
import formMultiple.frmNilai;
import formMultiple.frmSiswa;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


/**
 *
 * @author iqbal
 */
public class frmUtamaTest extends javax.swing.JFrame {

    /**
     * Creates new form frmUtamaTest
     */
    
    public static class UIBaru extends Component {
        public UIBaru() {
             
        }
    }
    
    public frmUtamaTest() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuSiswa = new javax.swing.JMenuItem();
        menuKelas = new javax.swing.JMenuItem();
        menuGuru = new javax.swing.JMenuItem();
        menuMapel = new javax.swing.JMenuItem();
        menuJadwal = new javax.swing.JMenuItem();
        menuNilai = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/mahasiswa.png"))); // NOI18N
        jLabel1.setText("Selamat Datang di Sistem Pengelolaan Akademik");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("Data");

        menuSiswa.setText("Data Siswa");
        menuSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSiswaActionPerformed(evt);
            }
        });
        jMenu2.add(menuSiswa);

        menuKelas.setText("Data Kelas");
        menuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKelasActionPerformed(evt);
            }
        });
        jMenu2.add(menuKelas);

        menuGuru.setText("Data Guru");
        menuGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuruActionPerformed(evt);
            }
        });
        jMenu2.add(menuGuru);

        menuMapel.setText("Data Mata Pelajaran");
        menuMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMapelActionPerformed(evt);
            }
        });
        jMenu2.add(menuMapel);

        menuJadwal.setText("Data Jadwal");
        menuJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJadwalActionPerformed(evt);
            }
        });
        jMenu2.add(menuJadwal);

        menuNilai.setText("Data Nilai");
        menuNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(menuNilai);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Laporan");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSiswaActionPerformed
        // TODO add your handling code here:
        // inisisasi objek dari form mahasiswa
        frmSiswa siswa = new frmSiswa();
        siswa.setVisible(true);
    }//GEN-LAST:event_menuSiswaActionPerformed

    private void menuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKelasActionPerformed
        // TODO add your handling code here:
        frmKelas kelas = new frmKelas();
        kelas.setVisible(true);
    }//GEN-LAST:event_menuKelasActionPerformed

    private void menuGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuruActionPerformed
        // TODO add your handling code here:
        frmGuruTest guru = new frmGuruTest();
        guru.setVisible(true);
    }//GEN-LAST:event_menuGuruActionPerformed

    private void menuMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMapelActionPerformed
        // TODO add your handling code here:
        frmMapel mapel = new frmMapel();
        mapel.setVisible(true);
    }//GEN-LAST:event_menuMapelActionPerformed

    private void menuJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJadwalActionPerformed
        // TODO add your handling code here:
        frmJadwalMengajar jadwalmengajar  = new frmJadwalMengajar();
        jadwalmengajar.setVisible(true);
    }//GEN-LAST:event_menuJadwalActionPerformed

    private void menuNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNilaiActionPerformed
        // TODO add your handling code here:
        frmNilai nilai = new frmNilai();
        nilai.setVisible(true);
    }//GEN-LAST:event_menuNilaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmUtamaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmUtamaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmUtamaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmUtamaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            SwingUtilities.updateComponentTreeUI(new UIBaru());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error :" + e );
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtamaTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuGuru;
    private javax.swing.JMenuItem menuJadwal;
    private javax.swing.JMenuItem menuKelas;
    private javax.swing.JMenuItem menuMapel;
    private javax.swing.JMenuItem menuNilai;
    private javax.swing.JMenuItem menuSiswa;
    // End of variables declaration//GEN-END:variables
}
