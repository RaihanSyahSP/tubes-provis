/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Mempelajari;

/**
 *
 * @author iqbal
 */
public class NilaiTableModel extends AbstractTableModel{
    private ArrayList<Mempelajari> data;
    private String[] namaField = {"Nilai","Nama Siswa","Nama Mapel"};
    
    public void setData(ArrayList<Mempelajari> dt) {
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
        Mempelajari nilai = data.get(baris);
        
        switch(kolom) {
            case 0 : return nilai.getNilai();
            case 1 : return nilai.getNis();
            case 2 : return nilai.getNoMapel();
            default : return null;
        }
    }
}
