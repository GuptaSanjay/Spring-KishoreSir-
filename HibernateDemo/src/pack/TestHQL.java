package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		
		String hql= "select obj from pack.Employee obj where obj.id>400";
		Query q1=s.createQuery(hql);
		List li=q1.list();
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println("Name = "+e.getName()+" Id= "+e.getId()+" Salary = "+e.getSalary()+" Age= "+e.getAge());
		}
		/*List l=q1.list();
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Object[] ob=(Object[])it.next();
			String name=(String)ob[0];
			double salary = (double) ob[1];
			System.out.println("Name= "+name+"  Salary = "+salary);
			
		}*/
		sf.close();
		//s.close();
		

	}

}
