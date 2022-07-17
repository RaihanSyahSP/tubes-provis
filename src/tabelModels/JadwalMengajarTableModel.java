/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.JadwalMengajar;

/**
 *
 * @author HP
 */
public class JadwalMengajarTableModel extends AbstractTableModel {
    private ArrayList<JadwalMengajar> data;
    private String[] namaField = {"Waktu Mulai", "Waktu Selesai", "Hari", "NIP", "No Mapel"};
    
    public void setData(ArrayList<JadwalMengajar> dt) {
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
        JadwalMengajar jadwalmengajar = data.get(baris);
        
        switch(kolom) {
            case 0 : return jadwalmengajar.getWaktuMulai();
            case 1 : return jadwalmengajar.getWaktuSelesai();
            case 2 : return jadwalmengajar.getHari();
            case 3 : return jadwalmengajar.getNip();
            case 4 : return jadwalmengajar.getNoMapel();
            default : return null;
        }
    }
    
//    public

//    public void fireTableDataChanged() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
