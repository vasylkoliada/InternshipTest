package person;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> new

import person.consciousness.Knowledge;

public class Student {
	private String name;
	private Knowledge knowledge;
    public Student(String name, Knowledge knowledge) {
      this.name = name;
      this.knowledge = knowledge;
    }
<<<<<<< HEAD

    public void setKnowledge(Knowledge knowledge) {
              this.knowledge = knowledge;
        }
=======
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
>>>>>>> new
    public  Knowledge getKnowledge() {
    	return this.knowledge;
    }
    public String getName() {
    	return this.name;
    }
}
