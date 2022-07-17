/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Kelas;
import models.MataPelajaran;

/**
 *
 * @author iqbal
 */
public class KelasTableModel extends AbstractTableModel {
    private ArrayList<Kelas> data;
    private String[] namaField = {"ID Kelas", "Nama Kelas", "NamA Guru"};
    
    public void setData(ArrayList<Kelas> dt) {
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
        Kelas kelas = data.get(baris);
        
        switch(kolom) {
            case 0 : return kelas.getIdKelas();
            case 1 : return kelas.getNamaKelas();
            case 2 : return kelas.getNip();
            default : return null;
        }
    }
    
}
