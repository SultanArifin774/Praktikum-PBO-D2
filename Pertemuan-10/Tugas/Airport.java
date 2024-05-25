/* 
 * File: Airport.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas Airport
 */
public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin mendarat diberikan";
        } else {
            return "Izin mendarat ditolak";
        }
    }
}
