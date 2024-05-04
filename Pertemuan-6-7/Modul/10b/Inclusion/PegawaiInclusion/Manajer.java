/* 
 * File: Manajer.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File kelas Manajer
 */
public class Manajer extends Pegawai {
    //Atribut
    private int Tunjangan = 700000;

    //Method
    public Manajer(String nama){
        super(nama);
    }
    
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + Tunjangan);
    }
    
}
