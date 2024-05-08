/* 
 * File: MapTest.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Mei 2024
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //Kunci-> integer, nilai-> string
        Map<Integer,String>map = new HashMap<Integer,String>();
        //Menempatkan elemen kunci dan nilai
        map.put(1, "Satu");
        map.put(2, "Dua");
        map.put(3, "Tiga");
        //Mengambil elemen pertama
        System.out.println(map.get(1));
        map.remove(1);
        //Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();
        for (Integer key: keys) {
            System.out.println(key + " : " + map.get(key));
            
        }
    }
}
