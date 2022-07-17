/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.Time;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iqbal
 */
public class JadwalMengajar {
    private String waktuMulai;
    private String waktuSelesai;
    private String hari;
    private String nip;
    private String noMapel;
    
    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }
    
    public void setWaktuSelesai(String waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }
    
    public void setHari(String hari) {
        this.hari = hari;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setNoMapel (String noMapel) {
        this.noMapel = noMapel;
    }
    
    public String getWaktuMulai() {
        return waktuMulai;
    }
    
    public String getWaktuSelesai() {
        return waktuSelesai;
    }
    
    public String getHari() {
        return hari;
    }
    
    public String getNip() {
        return nip;
    } 
    
    public String getNoMapel() {
        return noMapel;
    }
    
    public JadwalMengajar(String waktuMulai, String waktuSelesai, String hari, String nip, String noMapel) {
        setWaktuMulai(waktuMulai);
        setWaktuSelesai(waktuSelesai);
        setHari(hari);
        setNip(nip);
        setNoMapel(noMapel);
        
    }
    
}
