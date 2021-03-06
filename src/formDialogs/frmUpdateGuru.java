/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formDialogs;

import database.Database;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import models.Guru;

/**
 *
 * @author iqbal
 */
public class frmUpdateGuru extends javax.swing.JDialog {

    /**
     * Creates new form frmUpdateGuru
     */
    public frmUpdateGuru(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtNIP.setEditable(false);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(96, 96, 96));
    }
    
    public void setForm(Guru guru) {
        txtNIP.setText(guru.getNip());
        txtNama.setText(guru.getNamaGuru());
        txtAlamat.setText(guru.getAlamat());
        txtPendidikan.setText(guru.getPendidikan());
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
        txtNIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPendidikan = new javax.swing.JTextField();
        tblEdit = new javax.swing.JButton();
        tblBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Update Data Guru");

        txtNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIP");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pendidikan");

        tblEdit.setBackground(new java.awt.Color(51, 204, 0));
        tblEdit.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        tblEdit.setText("Edit");
        tblEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblEditActionPerformed(evt);
            }
        });

        tblBatal.setBackground(new java.awt.Color(255, 51, 0));
        tblBatal.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        tblBatal.setText("Batal");
        tblBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPendidikan, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tblEdit)
                        .addGap(72, 72, 72)
                        .addComponent(tblBatal)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(txtNIP)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblEdit)
                    .addComponent(tblBatal))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void tblEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblEditActionPerformed
        // TODO add your handling code here:
        
        //validasi
        boolean isValidate = false;
        String nipRegex = "^[G]{1}[0-9]{4}$";
        
        CharSequence inputStr = txtNama.getText();
        Pattern pattern = Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
        Matcher matcher = pattern.matcher(inputStr);
        
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null
              ,"Nama tidak boleh mengandung huruf",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        } 
        
        if(txtNama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null
              ,"Nama harus diisi",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        }
        
        if(txtAlamat.getText().trim().length() < 5) {
             JOptionPane.showMessageDialog(null
              ,"Nama harus lebih dari 5 karakter",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        }
        
        
        if(txtPendidikan.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null
              ,"Pendidikan harus diisi",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        }
        
        if(txtAlamat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null
              ,"Alamat harus diisi",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        }
        
        if(txtAlamat.getText().trim().length() < 5) {
             JOptionPane.showMessageDialog(null
              ,"Alamat harus lebih dari 5 karakter",
               "Error!",
            JOptionPane.ERROR_MESSAGE);
            isValidate = true;
        }
 
        if (isValidate == false) {
                Database db = new Database();
                db.updateGuru(new Guru(
                txtNIP.getText(),
                txtNama.getText(),
                txtAlamat.getText(), 
                txtPendidikan.getText()
                        
            ));
                JOptionPane.showMessageDialog(null
              ,"Data Berhasil diedit!!!");
                setVisible(false);
        } else {
            isValidate = true;
            setVisible(false);
        }

    }//GEN-LAST:event_tblEditActionPerformed

    private void tblBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblBatalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_tblBatalActionPerformed

    private void txtNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIPActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNIPActionPerformed

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
            java.util.logging.Logger.getLogger(frmUpdateGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUpdateGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUpdateGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUpdateGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmUpdateGuru dialog = new frmUpdateGuru(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JButton tblBatal;
    public javax.swing.JButton tblEdit;
    public javax.swing.JTextField txtAlamat;
    public javax.swing.JTextField txtNIP;
    public javax.swing.JTextField txtNama;
    public javax.swing.JTextField txtPendidikan;
    // End of variables declaration//GEN-END:variables
}
