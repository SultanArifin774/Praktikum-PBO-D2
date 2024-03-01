/* 
 * Nama File    : Lecture.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Lecture
 * Tanggal      : 01 Maret 2024
 */
import java.util.List;
import java.util.ArrayList;

public class Lecture {

    //atribut
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    //Konstruktor
    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    //Method

    //Selektor
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    //Mutator
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    //Other method
    public void getDetails() {
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Employee ID: " + getEmployeeID());
    }    

    public void teachCourse(Course course) {
       if (!coursesTaught.contains(course)){
        coursesTaught.add(course);
       } else{
        System.out.println("Lecture sudah mengajar di course ini");
       }
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught){
            System.out.println(course.getCourseName());
        }
    }
}
