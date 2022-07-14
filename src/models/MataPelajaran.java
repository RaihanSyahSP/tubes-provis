/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author iqbal
 */
public class MataPelajaran {
    private String noMapel;
    private String namaMapel;
    private double jumlahJam;
    
    
    public void setNoMapel(String noMapel) {
        this.noMapel = noMapel;
    }
    
    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }
    
    public void setJumlahJam(double jumlahJam) {
        this.jumlahJam = jumlahJam;
    }
    
    public String getNoMapel() {
        return noMapel;
    }
    
    public String getNamaMapel() {
        return namaMapel;
    }
    
    public double getJumlahJam() {
        return jumlahJam;
    }
    
}
