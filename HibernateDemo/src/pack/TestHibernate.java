package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		/*Transaction tx=s.beginTransaction();
		Employee e=new Employee("matheu", 777, 34000, 23);
		s.save(e);
		tx.commit();*/
		Employee e=(Employee)s.get(Employee.class, 111);
		Employee e1=(Employee)s.get(Employee.class, 66);
		System.out.println("Id="+e.getId()+"name="+e.getName()+"Salary="+e.getSalary()+"Age="+e.getAge());
		System.out.println("Id="+e1.getId()+"name="+e1.getName()+"Salary="+e1.getSalary()+"Age="+e1.getAge());
		s.close();
		sf.close();
		System.out.println("*****DONE******");

	}

}
