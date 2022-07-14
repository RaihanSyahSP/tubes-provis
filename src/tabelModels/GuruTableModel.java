/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Guru;

/**
 *
 * @author iqbal
 */
public class GuruTableModel extends AbstractTableModel {
    private ArrayList<Guru> data;
    private String[] namaField = {"NIP", "Nama Guru", "Alamat", "Pendidikan"};
    
    public void setData(ArrayList<Guru> dt) {
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
        Guru guru = data.get(baris);
        
        switch(kolom) {
            case 0 : return guru.getNip();
            case 1 : return guru.getNamaGuru();
            case 2 : return guru.getAlamat();
            case 3 : return guru.getPendidikan();
            default : return null;
        }
    }
    
}
