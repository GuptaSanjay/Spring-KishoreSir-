package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class TestCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Employee.class);
		
		cr.add(Restrictions.between("id", 100, 600));
		cr.add(Restrictions.gt("age", 20));
		
		List l=cr.list();
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println("Id="+e.getId()+"Name="+e.getName()+"Salary="+e.getSalary()+"Age="+e.getAge());
			
		}
		s.close();
		sf.close();

	}

}
