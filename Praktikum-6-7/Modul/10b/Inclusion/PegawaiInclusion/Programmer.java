/* 
 * File: Programmer.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File kelas programmer
 */
public class Programmer extends Pegawai{
    //Atribut 
    private int bonus = 450000;

    //Method
    public Programmer (String nama){
        super(nama);
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
