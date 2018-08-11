package institution;
<<<<<<< HEAD


import java.util.ArrayList;
import java.util.List;

import person.Student;


public class University {

	private String name;
	private List<Student> students;
    public University(String name) {
    	this.name = name;
    	this.students = new ArrayList<>();
        //TODO: Implementation is needed	
=======
import java.util.ArrayList;
import java.util.List;
import person.Student;
import person.consciousness.Knowledge;

public class University {
	private String name;
	private List<Student> students = new ArrayList<Student>();
    public University(String name) {
    	this.name = name;
>>>>>>> new
    }
    public  List<Student> getStudents() {
    	return students;
    }
<<<<<<< HEAD
    public void addStudent(Student student) {
    	students.add(student);
        //TODO: Implementation is needed
=======
    public void addStudent(String name, int knowledge) {
    	getStudents().add(new Student(name,new Knowledge(knowledge)));
>>>>>>> new
    }
}
