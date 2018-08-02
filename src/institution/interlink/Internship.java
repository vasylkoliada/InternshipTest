package institution.interlink;
import java.util.ArrayList;
import java.util.List;

import person.Student;

public class Internship {
	private String name;
	private List<Student> students;
    public Internship(String name) {
    	this.name = name;
    	this.students = new ArrayList<Student>();
        //TODO: Implementation is needed
    }

    public void addBrainStudents(List<Student> students) {
    	double avg = students.stream().mapToInt(s->s.getKnowledge().getKnowledge()).average().getAsDouble();
    	for(Student s: students) {
    		if(s.getKnowledge().getKnowledge()>avg) {
    			this.students.add(s);
    		}
    	}
    }
    
    public String getStudents() {
        //TODO: Implementation is needed
    	String ch = "";
    	for(Student s: students) {
    		ch+=s.getName()+ "\n";
    	}
        return ch;
    }
}
