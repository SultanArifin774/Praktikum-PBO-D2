/* 
 * File: Superman.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas Superman
 */
public class Superman extends Kyrptonian {
    
    private String name;

    public Superman(String name){
        this.name = name;
    }

    public void Eat(){
        System.out.println("Superman juga harus makan seperti pada manusia umumnya");
    }

    public void takeOff(){
        System.out.println(this.name + "sedang lepas landas");
    }

    public void land(){
        System.out.println(this.name + "sedang mendarat");
    }

    public void fly(){
        System.out.println(this.name + "sedang terbang");
    }

    public void leapBuilding(){
        System.out.println(this.name + "sedang loncat dari gedung yang tinggi");
    }

    public void stopBullet() {
        System.out.println(this.name + "dapat menghetikan peluru");
    }
}
