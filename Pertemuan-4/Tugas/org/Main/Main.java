/* 
 * Nama File    : Main.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Main dari Kelas PErson, Student, Lecture, dan Course
 * Tanggal      : 16 Maret 2024
 */
package org.Main;
import org.Course.Course;
import org.Lecture.Lecture;
import org.Person.*;
import org.Student.Student;
public class Main {

    public static void main(String[] args) {
        Person Sultan = new Person("Sultan", "788 Bucharest St", 19);
        Person Pedro = new Student("Pedro", "456 Madrid St", 20, 724751);

        Student Cahyono = new Student("Cahyono", "456 Arad St", 21 , 723751);
        Student Dani = new Student("Dani", "123 West Palm Beach St", 20, 734621);
        Student Neo = new Student("Neo", "789 Bucharest St", 19, 733451);

        Lecture Budianto = new Lecture("Budianto", "Tembalang", 45, 177013);
        Lecture Edi = new Lecture("Edi", "Banyumanik", 35, 412873);

        Course cs101 = new Course("CS101", "Dasar Pemrograman", Budianto);
        Course cs102 = new Course("CS102", "Struktur Data", Edi);
        Course cs103 = new Course("CS103", "Basis Data", Budianto);

        //GetDetails
        System.err.println("Detail Person");
        Sultan.getDetails();

        System.out.println("Detail mahasiswa");
        Pedro.getDetails();

        System.out.println("Detail lecture");
        Edi.getDetails();

        Cahyono.enrollInCourse(cs101);
        Cahyono.enrollInCourse(cs102);
        Cahyono.enrollInCourse(cs103);
    
        Neo.enrollInCourse(cs101);
        Neo.enrollInCourse(cs103);

        Budianto.teachCourse(cs101);
        Budianto.teachCourse(cs103);

        Edi.teachCourse(cs102);

        cs101.addStudent(Cahyono);
        cs101.addStudent(Dani);
        cs101.addStudent(Neo);

        cs102.addStudent(Cahyono);
        cs102.addStudent(Dani);

        cs103.addStudent(Cahyono);

        //ViewEnrolledCourses
        System.out.println("Course yang diikuti oleh Cahyono: ");
        Cahyono.viewEnrolledCourses();

        System.out.println("Course yang diikuti oleh Neo: ");
        Neo.viewEnrolledCourses();

        //ViewTaughtCourses
        System.out.println("Course yang diajar oleh Budianto: ");
        Budianto.viewTaughtCourses();

        System.out.println("Course yang diajar oleh Edi: ");
        Edi.viewTaughtCourses();

        //ViewEnrolledStudents
        System.out.println("Mahasiswa yang mengikuti course C101: ");
        cs101.viewEnrolledStudents();

        System.out.println("Mahasiswa yang mengikuti course C102: ");
        cs102.viewEnrolledStudents();

        cs101.removeStudent(Dani);
        System.out.println("Mahasiswa yang mengikuti course C101 setelah Dani keluar: ");
        cs101.viewEnrolledStudents();

        
    }
}
