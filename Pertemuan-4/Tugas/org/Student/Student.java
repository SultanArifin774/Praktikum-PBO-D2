/* 
 * Nama File    : Student.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Student
 * Tanggal      : 16 Maret 2024
 */

package org.Student;

import org.Person.Person;
import org.Course.*;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    //Atribut
    private int studentID;
    private List<Course> coursesEnrolled;

    //Konstruktor
    public Student(String nama, String alamat, int usia, int studentID){
        super(nama, alamat, usia);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    //Method
    //Selektor
    public int getStudentID(){
        return this.studentID;
    }
    
    //Mutator
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //Other Method
    public void getDetails(){
        super.getDetails();
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
