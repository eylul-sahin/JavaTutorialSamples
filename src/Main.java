public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Eylul";
        student1.surname = "Sahin";

        Student student2 = new Student();
        student2.name = "Eren";
        student2.surname = "Ozkan";

        Instructor instructor1 = new Instructor();
        instructor1.name = "Engin";
        instructor1.surname = "Demirog";
        Instructor instructor2 = new Instructor();
        instructor2.name = "Halit Enes";
        instructor2.surname = "Kalaycı";

        InstructorManager instructorManager = new InstructorManager();
        Instructor[] instructors = {instructor1, instructor2};
        for(Instructor instructor : instructors){
            instructorManager.dersYukle(instructor);
        }

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        Student[] students = {student1, student2};
        for(Student student : students){
            userManager.sistemeKullaniciEkle(student);
            studentManager.dersSecimi(student);
        }
    }
}