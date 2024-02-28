/* 
 * Nama File    : MainTItik.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Main Garis
 * Tanggal      : 28 Februari 2024
 */

public class MainGaris {

    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Garis g1;
        Garis g2;

        t1 = new Titik(1,3);
        t2 = new Titik();
        t2.setAbsis(4);
        t2.setOrdinat(7);

        g1 = new Garis(t1, t2);
        System.out.printf("Garis g1 dengan absis titik awal : %.2f, ordinat titik awal : %.2f\n", g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat());
        System.out.printf("Garis g1 dengan absis titik akhir : %.2f, ordinat titik akhir : %.2f\n", g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());

        System.out.println("Panjang g1 : " + g1.getPanjang());
        System.out.println("Gradien g1 : " + g1.getGradien());

        g2 = g1.getRefleksiY();
        System.out.println("Garis g2 dengan absis titik awal : " + g2.getTitikAwal().getAbsis() + ", ordinat titik awal : " + g2.getTitikAwal().getOrdinat());
        System.out.println("Garis g2 dengan absis titik akhir : " + g2.getTitikAkhir().getAbsis() + ", ordinat titik awal : " + g2.getTitikAkhir().getOrdinat());

        System.out.println("Apakah g1 tegak lurus dengan g2 : " + g1.isTegakLurus(g2));

    }
}