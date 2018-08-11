package institution.interlink;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> new
import person.Student;

public class Internship {
	private String name;
	private List<Student> students;
    public Internship(String name) {
    	this.name = name;
    	this.students = new ArrayList<Student>();
<<<<<<< HEAD
        //TODO: Implementation is needed
    }

=======
    }
>>>>>>> new
    public void addBrainStudents(List<Student> students) {
    	double avg = students.stream().mapToInt(s->s.getKnowledge().getKnowledge()).average().getAsDouble();
    	for(Student s: students) {
    		if(s.getKnowledge().getKnowledge()>avg) {
    			this.students.add(s);
    		}
    	}
    }
<<<<<<< HEAD
    
    public String getStudents() {
        //TODO: Implementation is needed
=======
    public String getStudents() {
>>>>>>> new
    	String ch = "";
    	for(Student s: students) {
    		ch+=s.getName()+ "\n";
    	}
        return ch;
    }
}
