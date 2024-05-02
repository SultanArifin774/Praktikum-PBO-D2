/* 
 * File: mainCoercion5.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File untuk penerapan contoh Polimorfisme Ad Hoc: Coercion (bagian 3b, nomor 5)
 */

public class mainCoercion5 {
    public static void main(String[] args) {
        char a = 'a';
        double output = a;
        System.out.println("Output: " + output);
        /*Penjelasan:
         * Eksekusi berhasil, pada dasarnya kondisi ini mirip pada nomor 1, meskipun nilai output yang diberikan adalah karakter 'a', 
         * namun karakter 'a' dapat direpresentasikan dengan bilangan sesuai dengan kode ASCII.
         * Jadi, dalam hal ini, 'a' dianggap sebagai nilai ASCII-nya, yaitu 97, dan kemudian disimpan dalam variabel output dan 
         * akan menghasilkan output: 97.0 (sesuai dengan tipe data output)
         */
    }
}
