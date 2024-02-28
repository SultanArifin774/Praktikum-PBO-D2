/* 
 * Nama File    : Garis.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Garis
 * Tanggal      : 28 Februari 2024
 */

public class Garis {

    //atribut
    private Titik TitikAwal;
    private Titik TitikAkhir;

    //konstruktor
    public Garis(Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
    }

    //method
    public Titik getTitikAwal(){
        return this.TitikAwal;
    }

    public Titik getTitikAkhir(){
        return this.TitikAkhir;
    }

    public void setTitikAwal(Titik TitikAwal){
        this.TitikAwal = TitikAwal;
    }

    public void setTitikAkhir(Titik TitikAkhir){
        this.TitikAkhir = TitikAkhir;
    }

    public double getPanjang(){
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    public double getGradien(){
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        return ((y2 - y1)/(x2 - x1));
    }

    public Garis getRefleksiX(){
        return new Garis(getTitikAwal().getRefleksiX(), getTitikAkhir().getRefleksiX());
    }

    public Garis getRefleksiY(){
        return new Garis(getTitikAwal().getRefleksiY(), getTitikAkhir().getRefleksiY());
    }

    public boolean isTegakLurus(Garis G){
        return  this.getGradien()*G.getGradien() == -1;
    }
}