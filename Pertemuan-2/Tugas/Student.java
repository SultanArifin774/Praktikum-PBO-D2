/* 
 * Nama File    : Student.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Student
 * Tanggal      : 01 Maret 2024
 */
import java.util.List;
import java.util.ArrayList;

public class Student {

    //Atribut
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    //Konstruktor
    Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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

    public int getStudentID(){
        return this.studentID;
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

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //Other method
    public void getDetails() {
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Student ID: " + getStudentID());
    }

    public void enrollInCourse(Course course) {
        if (!coursesEnrolled.contains(course)){
            coursesEnrolled.add(course);
        } else{
            System.out.println("Mahasiswa sudah terdaftar di course ini");
        }
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled){
            System.out.println(course.getCourseName());
        }
    }
}
