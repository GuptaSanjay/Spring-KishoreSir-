package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritanceMapping {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		Person p=new Person(111, "Sanjay");
		Customer c=new Customer(222, "Gupta", "HDFC");
		Student std=new Student(333, "raj", "B");
		//Student std2=new Student(444, "raj", "c");
		
		s.save(p);
		s.save(c);
		s.save(std);
		//s.save(std2);
		
		tr.commit();
		sf.close();
		s.close();
	}

}
