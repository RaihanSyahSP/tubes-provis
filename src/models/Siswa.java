/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.Date;

/**
 *
 * @author iqbal
 */
public class Siswa {
    private String nis;
    private String namaSiswa;
    private Date tglLahir;
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
    
    public void setTglLahir(Date tl)
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
        
    public Date getTglLahir()
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
    
    public Siswa(String nis, String nama, Date tglLahir, String jk, String idKelas)
    {
        setNis(nis);
        setNamaSiswa(nama);
        setTglLahir(tglLahir);
        setJenisKelamin(jk);
        setIdKelas(idKelas);
    }

    
}
