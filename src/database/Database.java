/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Guru;
import models.JadwalMengajar;
import models.Kelas;
import models.MataPelajaran;
import models.Mempelajari;
import models.Siswa;

/**
 *
 * @author iqbal
 */
public class Database {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10120194Sekolah";
    public final String user = "root";
    public final String pass = "";
    
    
    //function guru
    public ArrayList <Guru> tampilGuru() {
       ArrayList<Guru> list = new ArrayList<Guru>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT * FROM guru";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new Guru (rs.getString("nip"),
                                 rs.getString("nama_guru"),
                                 rs.getString("alamat"),
                                 rs.getString("pendidikan")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }
    
    public void tambahGuru(Guru guru) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO guru VALUES ('" + 
                    guru.getNip() + "','" + 
                    guru.getNamaGuru() + "','" + 
                    guru.getAlamat() + "','" + 
                    guru.getPendidikan() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Guru berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Guru gagal ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    public void hapusGuru(String Nip) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "DELETE FROM guru WHERE nip = '" + Nip + "'";
            s.executeUpdate(query);   
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    //filter guru
    public ArrayList<Guru> filterGuru(String kataKunci) {
        ArrayList<Guru> listGuru = new ArrayList<Guru>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT * FROM guru WHERE "
                   + "nip like '%"+kataKunci+"%'"
                   + " OR nama_guru like '%"+kataKunci+"%'"
                   + " OR alamat like '%"+kataKunci+"%'"
                   + " OR pendidikan like '%"+kataKunci+"%'"; 
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listGuru.add(
                       new Guru (rs.getString("nip"),
                                 rs.getString("nama_guru"),
                                 rs.getString("alamat"),
                                 rs.getString("pendidikan")
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Guru Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Guru Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listGuru;
    }
    
    
    //update guru
    public void updateGuru(Guru guru) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "UPDATE guru set nip = '" + guru.getNip() +
                           "'," + "nama_guru = '" + guru.getNamaGuru() +
                           "'," + "alamat = '" + guru.getAlamat() +
                           "'," + "pendidikan = '" + guru.getPendidikan() +
                          "' WHERE nip = '" + guru.getNip() + "'";
            stmt.executeUpdate(query);
                           
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    public Guru pilihGuru(String nip) {
        Guru guru = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM guru WHERE nip = '" + nip + "'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                guru = new Guru(rs.getString("nip"),
                                rs.getString("nama_guru"),
                                rs.getString("alamat"),
                                rs.getString("pendidikan")
                );
            } else {
                guru = null;
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
        return guru;
    }
    
    // function siswa
    public ArrayList <Siswa> tampilSiswa() {
       ArrayList<Siswa> list = new ArrayList<Siswa>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT s.nis, s.nama_siswa, s.tgl_lahir, s.jenis_kelamin, k.nama_kelas FROM siswa s JOIN kelas k ON s.id_kelas = k.id_kelas";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new Siswa (rs.getString("nis"),
                                 rs.getString("nama_siswa"),
                                 rs.getString("tgl_lahir"),
                                 rs.getString("jenis_kelamin"),
                                 rs.getString("nama_kelas")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }
    
    public void tambahSiswa(Siswa siswa) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO siswa VALUES ('" + 
                    siswa.getNis()+ "','" + 
                    siswa.getNamaSiswa()+ "','" + 
                    siswa.getTglLahir() + "','" + 
                    siswa.getJenisKelamin() + "','" + 
                    siswa.getIdKelas() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Siswa berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Siswa gagal ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    public void updateSiswa(Siswa siswa) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "UPDATE siswa set nis = '" + siswa.getNis() +
                           "'," + "nama_siswa = '" + siswa.getNamaSiswa() +
                           "'," + "tgl_lahir = '" + siswa.getTglLahir() +
                           "'," + "jenis_kelamin = '" + siswa.getJenisKelamin() +
                           "'," + "id_kelas = '" + siswa.getIdKelas() +
                          "' WHERE nis = '" + siswa.getNis() + "'";
            stmt.executeUpdate(query);
                           
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    public Siswa pilihSiswa(String nis) {
        Siswa siswa = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM siswa WHERE nis = '" + nis + "'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                siswa = new Siswa(rs.getString("nis"),
                                 rs.getString("nama_siswa"),
                                 rs.getString("tgl_lahir"),
                                 rs.getString("jenis_kelamin"),
                                 rs.getString("id_kelas")
                );
            } else {
                siswa = null;
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
        return siswa;
    }
    
    public void hapusSiswa(String nis) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "DELETE FROM siswa WHERE nis = '" + nis + "'";
            s.executeUpdate(query);   
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Siswa gagal dihapus!" + e.getMessage());
        }
        finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
    public ArrayList<Siswa> filterSiswa(String kataKunci) {
        ArrayList<Siswa> listSiswa = new ArrayList<Siswa>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT s.nis, s.nama_siswa, s.tgl_lahir, s.jenis_kelamin, k.nama_kelas FROM siswa s JOIN kelas k ON s.id_kelas = k.id_kelas WHERE"
                                                  + " s.nis like '%"+kataKunci+"%'"
                                                  + " OR s.nama_siswa like '%"+kataKunci+"%'"
                                                  + " OR s.tgl_lahir like '%"+kataKunci+"%'"
                                                  + " OR s.jenis_kelamin like '%"+kataKunci+"%'"
                                                  + " OR k.nama_kelas like '%"+kataKunci+"%'"; 
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listSiswa.add(
                       new Siswa (rs.getString("nis"),
                                  rs.getString("nama_siswa"),
                                 rs.getString("tgl_lahir"),
                                 rs.getString("jenis_kelamin"),
                                 rs.getString("nama_kelas")
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Siswa Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Siswa Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listSiswa;
    }
    
   // function mapel
    public ArrayList <MataPelajaran> tampilMapel() {
       ArrayList<MataPelajaran> list = new ArrayList<MataPelajaran>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT * FROM mata_pelajaran";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new MataPelajaran (rs.getString("no_mapel"),
                                          rs.getString("nama_mapel"),
                                          rs.getDouble("jumlah_jam")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }
    
    
    public void tambahMapel(MataPelajaran mapel) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO mata_pelajaran VALUES ('" + 
                    mapel.getNoMapel()+ "','" + 
                    mapel.getNamaMapel() + "','" + 
                    mapel.getJumlahJam() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Mata Pelajaran berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Mata Pelajaran gagal ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
     public void hapusMapel(String noMapel) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "DELETE FROM mata_pelajaran WHERE no_mapel = '" + noMapel + "'";
            s.executeUpdate(query);   
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Mata Pelajaran gagal dihapus!" + e.getMessage());
        }
        finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
     
     public ArrayList<MataPelajaran> filterMapel(String kataKunci) {
        ArrayList<MataPelajaran> listMapel = new ArrayList<MataPelajaran>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT * FROM mata_pelajaran WHERE "
                   + "no_mapel like '%"+kataKunci+"%'"
                   + " OR nama_mapel like '%"+kataKunci+"%'"
                   + " OR jumlah_jam like '%"+kataKunci+"%'"; 
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listMapel.add(
                       new MataPelajaran (rs.getString("no_mapel"),
                                          rs.getString("nama_mapel"),
                                          rs.getDouble("jumlah_jam")
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Mata Pelajaran Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Mata Pelajaran Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listMapel;
    }
     
     public void updateMapel(MataPelajaran mapel) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "UPDATE mata_pelajaran set no_mapel = '" + mapel.getNoMapel() +
                           "'," + "nama_mapel = '" + mapel.getNamaMapel() +
                           "'," + "jumlah_jam = '" + mapel.getJumlahJam() +
                          "' WHERE no_mapel = '" + mapel.getNoMapel() + "'";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
     
     public MataPelajaran pilihMapel(String noMapel) {
        MataPelajaran mapel = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM mata_pelajaran WHERE no_mapel = '" + noMapel + "'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                mapel = new MataPelajaran (rs.getString("no_mapel"),
                                          rs.getString("nama_mapel"),
                                          rs.getDouble("jumlah_jam")
                );
            } else {
                mapel = null;
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
        return mapel;
    }
     
     // function mempelajari/nilai
    public ArrayList <Mempelajari> tampilNilai() {
       ArrayList<Mempelajari> list = new ArrayList<Mempelajari>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT m.nilai, s.nama_siswa, mp.nama_mapel FROM mempelajari m JOIN siswa s ON m.nis = s.nis JOIN mata_pelajaran mp ON mp.no_mapel = m.no_mapel";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new Mempelajari (rs.getString("nama_siswa"),
                                          rs.getString("nama_mapel"),
                                          rs.getDouble("nilai")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }
    
    public void tambahNilai(Mempelajari nilai) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO mempelajari VALUES ('" + 
                    nilai.getNilai()+ "','" + 
                    nilai.getNis() + "','" + 
                    nilai.getNoMapel() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Nilai berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Nilai gagal ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    
    public ArrayList<Mempelajari> filterNilai(String kataKunci) {
        ArrayList<Mempelajari> listNilai = new ArrayList<Mempelajari>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement(); 
           String query = "SELECT m.nilai, s.nama_siswa, mp.nama_mapel "
                   + "FROM mempelajari m "
                   + "JOIN siswa s ON m.nis = s.nis "
                   + "JOIN mata_pelajaran mp ON mp.no_mapel = m.no_mapel "
                   + "WHERE s.nama_siswa LIKE '%"+kataKunci+"%'";
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listNilai.add(
                        new Mempelajari (rs.getString("nama_siswa"),
                                          rs.getString("nama_mapel"),
                                          rs.getDouble("nilai")
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Nilai Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Nilai Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listNilai;
    }
    
    //function kelas
    public ArrayList <Kelas> tampilKelas() {
       ArrayList<Kelas> list = new ArrayList<Kelas>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT k.id_kelas,k.nama_kelas,g.nama_guru FROM kelas k join guru g on k.nip=g.nip";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new Kelas (rs.getString("id_kelas"),
                                  rs.getString("nama_kelas"),
                                  rs.getString("nama_guru")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }
    
    public void tambahKelas(Kelas kelas) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO kelas VALUES ('" + 
                    kelas.getIdKelas()+ "','" + 
                    kelas.getNamaKelas() + "','" + 
                    kelas.getNip() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Kelas berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Kelas gagal ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    public ArrayList<Kelas> filterKelas(String kataKunci) {
        ArrayList<Kelas> listKelas = new ArrayList<Kelas>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT k.id_kelas,k.nama_kelas,g.nama_guru FROM kelas k JOIN guru g ON k.nip=g.nip WHERE "
                   + "id_kelas like '%"+kataKunci+"%'"
                   + " OR nama_kelas like '%"+kataKunci+"%'"
                   + " OR nama_guru like '%"+kataKunci+"%'"; 
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listKelas.add(
                       new Kelas (rs.getString("id_kelas"),
                                          rs.getString("nama_kelas"),
                                          rs.getString("nama_guru")
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Kelas Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Kelas Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listKelas;
    }
    
    public void hapusKelas(String idKelas) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "DELETE FROM kelas WHERE id_kelas = '" + idKelas + "'";
            s.executeUpdate(query); 
            JOptionPane.showMessageDialog(null, "Data Kelas berhasil dihapus");
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Kelas gagal dihapus!" + e.getMessage());
        }
        finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
    
      public void updateKelas(Kelas kelas) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "UPDATE kelas set id_kelas = '" + kelas.getIdKelas()+
                           "'," + "nama_kelas = '" + kelas.getNamaKelas()+
                           "'," + "nip = '" + kelas.getNip()+
                          "' WHERE id_kelas = '" + kelas.getIdKelas()+ "'";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
    }
     
     public Kelas pilihKelas(String idKelas) {
        Kelas kelas = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String query = "SELECT * FROM kelas WHERE id_kelas = '" + idKelas + "'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                kelas = new Kelas (rs.getString("id_kelas"),
                                          rs.getString("nama_kelas"),
                                          rs.getString("nip")
                );
            } else {
                kelas = null;
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            }catch (Exception e) {}
        }
        return kelas;
    }
    
     
     //punya si tabel jadwal mengajar
    public ArrayList <JadwalMengajar> tampilJadwalMengajar() {
       ArrayList<JadwalMengajar> list = new ArrayList<JadwalMengajar>();
       Connection conn = null;
       Statement s = null;
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT jm.waktu_mulai, jm.waktu_selesai, jm.hari, g.nama_guru, m.nama_mapel "
                   + "FROM jadwal_mengajar jm "
                   + "JOIN guru g ON jm.nip = g.nip "
                   + "JOIN mata_pelajaran m ON jm.no_mapel = m.no_mapel";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new JadwalMengajar(rs.getString("waktu_mulai"),
                                       rs.getString("waktu_selesai"),
                                       rs.getString("hari"),
                                       rs.getString("nama_guru"),
                                       rs.getString("nama_mapel")
                       )
               );
           }
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return list;
    }    
    

    public void tambahJadwalMengajar(JadwalMengajar jadwalajar) {
        Connection conn = null;
        Statement s = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            s = conn.createStatement();
            String query = "INSERT INTO jadwal_mengajar VALUES ('" + 
                    jadwalajar.getWaktuMulai() + "','" + 
                    jadwalajar.getWaktuSelesai() + "','" + 
                    jadwalajar.getHari() + "','" + 
                    jadwalajar.getNip() + "','" + 
                    jadwalajar.getNoMapel() + "')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Jadwal Mengajar berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Jadwal Mengajar ditambahkan!" + e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    public ArrayList<JadwalMengajar> filterJadwalMengajar(String kataKunci) {
        ArrayList<JadwalMengajar> listJadwalAjar = new ArrayList<JadwalMengajar>();
        Connection conn = null;
        Statement s = null;
        try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, pass);
           s = conn.createStatement();
           String query = "SELECT jm.waktu_mulai, jm.waktu_selesai, jm.hari, g.nama_guru, m.nama_mapel "
                   + "FROM jadwal_mengajar jm "
                   + "JOIN guru g ON jm.nip = g.nip "
                   + "JOIN mata_pelajaran m ON jm.no_mapel = m.no_mapel " 
                   + "WHERE jm.waktu_mulai like '%"+kataKunci+"%'"
                   + " OR jm.waktu_selesai like '%"+kataKunci+"%'"
                   + " OR jm.hari like '%"+kataKunci+"%'"
                   + " OR g.nama_guru like '%"+kataKunci+"%'"
                   + " OR m.nama_mapel like '%"+kataKunci+"%'"; 
           ResultSet rs = s.executeQuery(query);
           boolean found = false;
           while(rs.next()) {
               listJadwalAjar.add(
                       new JadwalMengajar (rs.getString("waktu_mulai"),
                                          rs.getString("waktu_selesai"),
                                          rs.getString("hari"),
                                          rs.getString("nama_guru"),
                                          rs.getString("nama_mapel")
                               
                       )
               );
               found = true;
           }
            
           if(found){
               JOptionPane.showMessageDialog(null, "Data Jadwal Mengajar Ditemukan!!");
            } else {
               JOptionPane.showMessageDialog(null, "Data Jadwal Mengajar Tidak Ditemukan!!");
           }
            
           rs.close();
           
       } catch (Exception e) {
           System.out.println("Error : " + e.getMessage());
            
       } finally {
           try {
               s.close();
           } catch (Exception e) {}
           try {
               conn.close();
           } catch (Exception e) {}
       }
       return listJadwalAjar;
    }    
     
}
    
