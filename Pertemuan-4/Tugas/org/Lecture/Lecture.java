package org.Lecture;
import java.util.ArrayList;
import java.util.List;

import org.Course.Course;
import org.Person.*;

public class Lecture extends Person {

    //Atribut
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String nama, String alamat, int usia, int employeeID){
        super(nama, alamat, usia);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    //Method
    //Selektor
    public int getEmployeeID(){
        return this.employeeID;
    }

    //Mutator
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    //Other Method
    public void getDetails(){
        super.getDetails();
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
