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
import models.MataPelajaran;
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
           String query = "SELECT * FROM guru WHERE nip like '%"+kataKunci+"%'"; 
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
           String query = "SELECT * FROM siswa";
           ResultSet rs = s.executeQuery(query);
           while(rs.next()) {
               list.add(
                       new Siswa (rs.getString("nis"),
                                 rs.getString("nama_siswa"),
                                 rs.getDate("tgl_lahir"),
                                 rs.getString("jenis_kelamin"),
                                 rs.getString("id_kelas")
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
           String query = "SELECT * FROM mata_pelajaran WHERE no_mapel like '%"+kataKunci+"%'"; 
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
    
    
}
    
