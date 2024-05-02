/* 
 * File: mainCoercion2.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File untuk penerapan contoh Polimorfisme Ad Hoc:Coercion (bagian 3b, nomor 2)
 */

public class mainCoercion2 {
    public static void main(String[] args) {
        double x = 15.5;
        int output = x;
        System.out.println(("Output: " + output));
        /*Penjelasan:
         * Akan terjadi error dalam melakukan coersion, 
         * karena proses konversi tipe data dari double ke int tidak akan terjadi secara otomatis 
         * karena dapat mengakibatkan kehilangan presisi atau perubahan nilai.
         * Oleh karena itu diperlukan konversi secara eksplisit (casting)
         */
    }
}
