/* 
 * File: Asersi1.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 06 Maret 2024
 * Deskripsi: Program untuk menunjukkan asersi
 */
public class Asersi1 {

    public static void main(String[] args) {
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        } else{
            assert(x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}