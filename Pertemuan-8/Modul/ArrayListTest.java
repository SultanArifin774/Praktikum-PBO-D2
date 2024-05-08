/* 
 * File: ArrayListTest.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Mei 2024
 * Deskripsi: Program penggunaan objek ArrayList sebagai Collection class
 */
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        //Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //Menghapus elemen
        
        strings.remove("praktikum");
        //Iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}