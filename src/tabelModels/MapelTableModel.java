/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.MataPelajaran;

/**
 *
 * @author iqbal
 */
public class MapelTableModel extends AbstractTableModel {
    private ArrayList<MataPelajaran> data;
    private String[] namaField = {"No Mapel", "Nama Mapel", "Jumlah Jam"};
    
    public void setData(ArrayList<MataPelajaran> dt) {
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
        MataPelajaran mapel = data.get(baris);
        
        switch(kolom) {
            case 0 : return mapel.getNoMapel();
            case 1 : return mapel.getNamaMapel();
            case 2 : return mapel.getJumlahJam();
            default : return null;
        }
    }
    
}
