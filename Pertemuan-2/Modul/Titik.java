/* 
 * Nama File    : TItik.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 28 Februari 2024
 */

public class Titik {
    //atribut
    private double absis;
    private double ordinat;

    //konstruktor
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik(){
        this(0,0);
    }

    //method

    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    
    public double getJarakPusat(){
        return Math.sqrt((getAbsis()*getAbsis())+(getOrdinat()*getOrdinat()));
    }

    public void refleksiX(){
        setOrdinat(this.getOrdinat() *-1);
    }
    
    public void refleksiY(){
        setAbsis(this.getAbsis() *-1);
    }

    public Titik getRefleksiX(){
        return new Titik(this.getAbsis(), this.getOrdinat()*-1);
    }

    public Titik getRefleksiY(){
        return new Titik(this.getAbsis()*-1, this.getOrdinat());
    }
}