/* 
 * File: mainOverloading.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File untuk penerapan contoh Polimorfisme Ad Hoc: Overloading (bagian 3a)
 */

/*3a Syarat - syarat overloading:
1. Nama method yang sama: Semua method yang akan dioverloading harus memiliki nama yang sama.
2. Parameter yang berbeda: Setiap method harus memiliki setidaknya satu perbedaan dalam parameter, baik dalam jumlah maupun tipe parameter.
3. Tipe return tidak mempengaruhi overloading: Java tidak mempertimbangkan tipe return dalam menentukan method mana yang akan dipanggil.
4. Overloading tidak boleh terbatas hanya pada parameter primitif: Overloading juga dapat dilakukan dengan menggunakan 
parameter objek, array, atau bahkan varargs. */

public class mainOverloading {
    public static int perkalian(int a, int b){
        return a*b;
    }

    public static double perkalian(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(perkalian(5,10));
        System.out.println(perkalian(5.5, 9.5));
    }
}

