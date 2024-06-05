/* 
 * File: MysqlUtility.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 05 Juni 2024
 * Deskripsi: File untuk menghubungkan dengan database
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;

/**
 *
 * @author Sultan Arifin
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/pbo2";
                //Sesuaikan username dan password
                String user = "root";
                String password = "SQLneo773985";
                koneksi = DriverManager.getConnection(url, user, password);
            } catch(ClassNotFoundException one){
                System.out.println("Gagal load driver : " + one.getMessage());
            } catch (SQLException sqle){
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
