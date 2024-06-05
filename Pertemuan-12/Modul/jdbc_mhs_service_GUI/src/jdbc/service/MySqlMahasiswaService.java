/* 
 * File: MySqlMahasiswaService.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 05 Juni 2024
 * Deskripsi: File untuk mengeksekusi query pada SQL
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Sultan Arifin
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MySqlMahasiswaService {
    Connection koneksi = null;
    
    // Constructor
    public MySqlMahasiswaService() {
       koneksi = MysqlUtility.getConnection();
    }
    
    // Membuat objek mahasiswa dari hasil query
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
     // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa VALUES(" + mhs.getId() + ",'" + mhs.getNama() + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama='" + mhs.getNama() + "' WHERE id=" + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
    }
    
    // Delete data mahasiswa
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id=" + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // Ambil mahasiswa berdasarkan id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id=" + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mhs;
    }
    
    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mahasiswaList.add(mhs);
           }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return mahasiswaList;
    }
    
    public void indexReset(){
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 0";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil reset index");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) AS count FROM mahasiswa";
        try{
           Statement s = koneksi.createStatement();
           ResultSet rs = s.executeQuery(query);
           if (rs.next()){
               return rs.getInt("count") == 0;
           }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void closeConnection(){
        try {
            if (koneksi != null && !koneksi.isClosed()){
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}

