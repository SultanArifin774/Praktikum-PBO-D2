/* 
 * File: AngkaSial.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 06 Maret 2024
 * Deskripsi: Program penggunaan exception buatan sendiri. Penggunaan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
    public void cobaAngka(int Angka) throws AngkaSialException{
        if (Angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(Angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka!!!");
        }
    }
}