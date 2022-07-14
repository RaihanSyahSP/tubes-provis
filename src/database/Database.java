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
}
    
//    public void tambah_guru () {
//       Connection conn = null;
//       Statement s = null;
//       try {
//           Class.forName(driver);
//           conn = DriverManager.getConnection(url, user, pass);
//           s = conn.createStatement();
//           String query = "SELECT * FROM guru";
//           ResultSet rs = s.executeQuery(query);
//           while(rs.next()) {
//               list.add(
//                       new Guru (rs.getString("nip"),
//                                 rs.getString("nama_guru"),
//                                 rs.getString("alamat"),
//                                 rs.getString("pendidikan")
//                       )
//               );
//           }
//           rs.close();
//           
//       } catch (Exception e) {
//           System.out.println("Error : " + e.getMessage());
//       } finally {
//           try {
//               s.close();
//           } catch (Exception e) {}
//           try {
//               conn.close();
//           } catch (Exception e) {}
//       }
//    }
//    private Connection conn;
//    private String address;
//    private String username;
//    private String password;
//    
//    public Database(){
//        connect();
//    }
//    public void setProperties(String address, String username, String password){
//        this.address = address;
//        this.username = username;
//        this.password = password;
//    }
//
//    void connect() {
//        this.address = "jdbc:mysql://localhost/db_sekolah";
//        this.username = "root";
//        this.password = "";
//        
//        
//        try{
//            conn = DriverManager.getConnection(address, username, password);
//            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
//            conn.setAutoCommit(false);
//            System.out.println("Succesfully Connected");
//        }
//        catch(SQLException e){
//            System.out.println(e + "Failed to connect");
//        }
//    }
//    
//    
//    public void tambah_guru(Guru guru) {
////        Connection connection = new Connection();
//        try {
//            Statement s = conn.createStatement();
//            String query = "INSERT INTO guru VALUES(" + guru.getNip() + "," +
//                            guru.getNamaGuru() + "," + 
//                            guru.getAlamat() + "," +
//                            guru.getPendidikan() + ")";
//            
//            s.execute(query);
//            conn.commit();
//            s.close();
//            
//        } catch(SQLException e) {
//             System.out.println("Error : " + e);
//            
//        }
//    }
//    
//    public void delete_guru(Guru guru) {
//        try {
//            Statement s = conn.createStatement();
//            String query = "DELETE FROM guru WHERE nip = '" + guru.getNip() + "'" ;
//            
//            s.execute(query);
//            conn.commit();
//            s.close();
//            
//        } catch(SQLException e) {
//             System.out.println("Error : " + e);
//             System.out.println("data guru gagal dihapus");
//            
//        }
//    }
