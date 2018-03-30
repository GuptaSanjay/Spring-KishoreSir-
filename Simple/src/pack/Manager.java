package pack;

public class Manager extends Employee {
int empcount;

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public Manager(String name, int age,int empcount) {
	super(name, age);
	this.empcount=empcount;
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Manager [empcount=" + empcount + ", Employee details=" + super.toString()
			+ "]";
}


}
