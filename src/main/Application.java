package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;



public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(60)) );
        university.addStudent(new Student("Julia Veselkina", new Knowledge(34)));
        university.addStudent(new Student("Maria Perechrest",new Knowledge(40)));
        university.addStudent(new Student("df fd", new Knowledge(70)) );
        university.addStudent(new Student("wer qwe",new Knowledge(77)));
        university.addStudent(new Student("qwe qwe",new Knowledge(55)));

        System.out.println("List of internship's students:");
        Internship internship = new Internship("Interlink");
        internship.addBrainStudents(university.getStudents());
        System.out.println(internship.getStudents());
      
    }
}
