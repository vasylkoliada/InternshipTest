package institution;


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
    }
    public  List<Student> getStudents() {
    	return students;
    }
    public void addStudent(Student student) {
    	students.add(student);
        //TODO: Implementation is needed
    }
}
