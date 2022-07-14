/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import javax.swing.table.AbstractTableModel;
/**
 *
 * @author iqbal
 */
public class Guru {
    private String nip;
    private String namaGuru;
    private String alamat;
    private String pendidikan;
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setNamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
    
    public String getNip() {
        return nip;
    }
    
    public String getNamaGuru() {
        return namaGuru;
    }
    
    public String getPendidikan() {
        return pendidikan;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public Guru(String nip, String namaGuru, String pendidikan, String alamat) {
        setNip(nip);
        setNamaGuru(namaGuru);
        setPendidikan(pendidikan);
        setAlamat(alamat);
    }
}
