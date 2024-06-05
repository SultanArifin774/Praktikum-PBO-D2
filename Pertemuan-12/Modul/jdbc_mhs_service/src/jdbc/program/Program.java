/* 
 * File: Program.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 05 Juni 2024
 * Deskripsi: File untuk menjalankan program utama
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author Sultan Arifin
 */

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MySqlMahasiswaService;

public class Program {
    static MySqlMahasiswaService service = new MySqlMahasiswaService();
    
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        System.out.println("===delete");
        System.out.println("akan di delete :" + service.getById(5));
        service.delete(5);
        displayAll();
        
    }
    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
        System.out.println();
    }
}
