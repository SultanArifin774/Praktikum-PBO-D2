/* 
 * File: Bird.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas Bird
 */
public class Bird extends Animal implements iFlyer {

    public void Eat(){
        System.out.println("Burung adalah hewan yang memakan biji - bijian");
    }
    
    public void takeOff(){
        System.out.println("Burung lepas landas menggunakan dorongan sayapnya");
    }

    public void land(){
        System.out.println("Burung mendarat dengan kedua kakinya");
    }

    public void fly(){
        System.out.println("Burung terbang dengan kedua sayapnya");
    }

    public void layEggs(){
        System.out.println("Burung adalah hewan bertelur");
    }

    public void buildNest(){
        System.out.println("Burung dapat membangun sarangnya sendiri");
    }
}
