/* 
 * Nama File    : Main.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Main dari Kelas Student, Lecture, dan Course
 * Tanggal      : 01 Maret 2024
 */
public class Main {

    public static void main(String[] args) {
    Lecture Budianto = new Lecture("Budianto", 45, "Tembalang", 177013);
    Lecture Edi = new Lecture("Edi", 35, "Banyumanik", 412873);
    
    Student Cahyono = new Student("Cahyono", 21, "456 Arad St", 723751);
    Student Dani = new Student("Dani", 20, "123 West Palm Beach St", 734621);
    Student Neo = new Student("Neo", 19, "789 Bucharest St", 733451);
    
    Course cs101 = new Course("CS101", "Dasar Pemrograman", Budianto);
    Course cs102 = new Course("CS102", "Struktur Data", Edi);
    Course cs103 = new Course("CS103", "Basis Data", Budianto);
    
    //GetDetails
    System.out.println("Detail mahasiswa");
    Neo.getDetails();

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