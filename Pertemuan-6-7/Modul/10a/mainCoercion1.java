/* 
 * File: mainCoercion1.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File untuk penerapan contoh Polimorfisme Ad Hoc: Coercion (bagian 3b, nomor 1)
 */

public class mainCoercion1 {
    public static void main(String[] args) {
        int output = 'a';
        System.out.println("Output: " + output);
        /*Penjelasan:
         * Eksekusi berhasil, meskipun nilai output yang diberikan adalah karakter 'a', namun program dapat mengeluarkan output berupa integer 
         * yaitu: 97, karena karakter 'a' dapat direpresentasikan dengan bilangan bulat sesuai dengan kode ASCII.
         * Jadi, dalam hal ini, 'a' dianggap sebagai nilai ASCII-nya, yaitu 97, dan kemudian disimpan dalam variabel output
         */
    }
    
}
