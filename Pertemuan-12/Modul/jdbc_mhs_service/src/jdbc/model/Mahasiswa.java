/* 
 * File: Mahasiswa.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 05 Juni 2024
 * Deskripsi: File Model Kelas Mahasiswa
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Sultan Arifin
 */
public class Mahasiswa {
    //atribut
    private int id;
    private String nama;
    
    //Constructor
    public Mahasiswa(){
        this.id = 0;
        this.nama = "";
    }
    
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    //Getter & Setter
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}
