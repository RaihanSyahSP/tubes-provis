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
public class Kelas {
    private String idKelas;
    private String namaKelas;
    private String nip;
    
    
    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }
    
    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getIdKelas() {
        return idKelas;
    }
    
    public String getNamaKelas() {
        return namaKelas;
    }
    
    public String getNip() {
        return nip;
    }
    
    public Kelas(String idKelas, String namaKelas, String nip) {
        setIdKelas(idKelas);
        setNamaKelas(namaKelas);
        setNip(nip);
    }
    
}
