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
public class Mempelajari {
    private double nilai;
    private String nis;
    private String noMapel;
    
    
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    public void setNis(String nis) {
        this.nis = nis;
    }
    
    public void setNoMapel(String noMapel) {
        this.noMapel = noMapel;
    }
    
    public double getNilai() {
        return nilai;
    }
    
    public String getNis() {
        return nis;
    }
    
    public String getNoMapel() {
        return noMapel;
    }
    
    public Mempelajari(String nis, String noMapel,  double nilai) {
        setNilai(nilai);
        setNis(nis);
        setNoMapel(noMapel);
    }
     
    
}
