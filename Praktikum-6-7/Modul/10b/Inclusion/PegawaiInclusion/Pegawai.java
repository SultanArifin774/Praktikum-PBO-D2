/* 
 * File: Pegawai.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File kelas pegawai
 */
public class Pegawai {
    //Atribut
    private String nama;
    private int gajiPokok = 5000000;

    //Method 
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama);
        System.out.println("Gaji pokok : " + gajiPokok);
    }
    
}
