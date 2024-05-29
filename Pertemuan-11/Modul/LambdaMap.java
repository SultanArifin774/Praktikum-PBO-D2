/* 
 * File: LambdaMap.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 29 Mei 2024
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method
 */

import java.util.*;
public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> Mahasiswamap = new HashMap<String,String>();
        Mahasiswamap.put("24060122130079", "Sultan Arifin");
        Mahasiswamap.put("24060122131179", "Borneo Arifin");
        Mahasiswamap.put("24060122131201", "John Max");

        Mahasiswamap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
    }
    
}
