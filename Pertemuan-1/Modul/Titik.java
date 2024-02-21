/* 
 * Nama File    : TItik.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 23 Februari 2024
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik;

Titik(){
    counterTitik++;
    absis = 0;
    ordinat = 0;
}

Titik(int A, int O){
    absis = A;
    ordinat = O;
    counterTitik++;
}

void setAbsis(double a){
    absis = a;
}

void setOrdinat(double o){
    ordinat = o;
}

double getAbsis(){
    return absis;
}

double getOrdinat(){
    return ordinat;
}

static int getCounterTitik(){
    return counterTitik;
}
}