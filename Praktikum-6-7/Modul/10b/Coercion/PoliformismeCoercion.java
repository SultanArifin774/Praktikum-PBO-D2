/* 
 * File: PoliformismeCoercion.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File kelas implementasi Poliformisme berupa Coercion
 */
public class PoliformismeCoercion {

    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }
    
    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;

        //objek integer dipaksa untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.println("Hasil kuadrat " + bilangan + " adalah " + hasilKuadrat);
    }
}

