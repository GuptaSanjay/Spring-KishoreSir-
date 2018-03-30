package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="s")
public class Student extends Person{
	private String grade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int uid, String name, String grade) {
		super(uid, name);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
