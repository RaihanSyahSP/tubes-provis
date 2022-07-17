/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.Date;
import javax.swing.ButtonModel;

/**
 *
 * @author iqbal
 */
public class Siswa {
    private String nis;
    private String namaSiswa;
    private String tglLahir;
    private String jenisKelamin;
    private String idKelas;
    
    public void setNis(String ns)
    {
        nis = ns;
    }
    
    public void setNamaSiswa(String na)
    {
        namaSiswa = na;
    }
    
    public void setTglLahir(String tl)
    {
        tglLahir = tl;
    }
    
    public void setJenisKelamin(String jk)
    {
        jenisKelamin = jk;
    }
    
    public void setIdKelas(String ik)
    {
        idKelas = ik;
    }
    
    public String getNis()
    {
        return nis;
    }
    
    public String getNamaSiswa()
    {
        return namaSiswa;
    }
        
    public String getTglLahir()
    {
        return tglLahir;
    }
    
    public String getJenisKelamin()
    {
        return jenisKelamin;
    }
    
    public String getIdKelas()
    {
        return idKelas;
    }
    
    public Siswa(String nis, String nama, String tglLahir, String jk, String idKelas)
    {
        setNis(nis);
        setNamaSiswa(nama);
        setTglLahir(tglLahir);
        setJenisKelamin(jk);
        setIdKelas(idKelas);
    }

    
}
