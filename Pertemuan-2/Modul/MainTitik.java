/* 
 * Nama File    : MainTItik.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Main Titik
 * Tanggal      : 28 Februari 2024
 */

 public class MainTitik {

    public static void main(String[] args) {
        Titik t1;
        Titik t2;

        t1 = new Titik(1,3);
        t2 = new Titik();

        t2.setAbsis(4);
        t1.setOrdinat(5);
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Jarak Titik t1 dari titik pusat : %.2f\n", t1.getJarakPusat());

        t1.refleksiX();
        System.out.printf("Titik t1 setelah refleksiX dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        t1.refleksiY();
        System.out.printf("Titik t1 setelah refleksiY dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());

        Titik t3;
        t3 = t2.getRefleksiY();
        System.out.printf("Titik t3 adalah refleksiY pada t2 dengan absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());

    }
 }