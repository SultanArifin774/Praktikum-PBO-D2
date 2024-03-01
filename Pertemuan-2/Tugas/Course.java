/* 
 * Nama File    : Course.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Course
 * Tanggal      : 01 Maret 2024
 */
import java.util.List;
import java.util.ArrayList;

public class Course {

    //Atribut
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    //KOnstruktor
    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    //Method
    //Selektor
    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public Lecture getLecture() {
        return this.lecture;
    }

    //Mutator
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    //Other method
    public void getDetails() {
       System.out.println("Kode course: " + getCourseCode());
       System.out.println("Nama course: " + getCourseName());
       System.out.println("Nama lecture: " + getLecture());
    }   

    public void addStudent(Student student) {
        if (!studentsEnrolled.contains(student)){
            studentsEnrolled.add(student);
        } else {
            System.out.println("Mahasiswa sudah terdaftar di course ini");
        }
    }

    public void removeStudent(Student student) {
        if (studentsEnrolled.contains(student)){
            studentsEnrolled.remove(student);
        } else {
            System.out.println("Mahasiswa sudah tidak terdaftar di course ini");
        }
    }

    public void viewEnrolledStudents() {
        for (Student student : studentsEnrolled) {
            System.out.println(student.getName());
        }
    }

}
