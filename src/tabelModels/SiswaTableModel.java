/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Siswa;

/**
 *
 * @author Lenovo
 */
public class SiswaTableModel extends AbstractTableModel {
    private ArrayList<Siswa> data;
    private String[] namaField = {"NIS", "Nama Siswa", "Tanggal Lahir", "Jenis Kelamin", "Nama Kelas"};
    
    public void setData(ArrayList<Siswa> dt) {
        this.data = dt; 
    }
    
    public int getColumnCount() {
        return namaField.length;
    }
    
    public int getRowCount() {
        return data.size();
    }
    
    public String getColumnName(int column) {
        return namaField[column];
    }
    
    public Object getValueAt(int baris, int kolom) {
        Siswa siswa = data.get(baris);
        
        switch(kolom) {
            case 0 : return siswa.getNis();
            case 1 : return siswa.getNamaSiswa();
            case 2 : return siswa.getTglLahir();
            case 3 : return siswa.getJenisKelamin();
            case 4 : return siswa.getIdKelas();
            default : return null;
        }
    }
}
