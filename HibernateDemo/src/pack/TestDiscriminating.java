package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDiscriminating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		
		Criteria cr=s.createCriteria(Person.class);
		
		List li=cr.list();
		Iterator it=li.iterator();
		
		while(it.hasNext()){
			Person p=(Person)it.next();
			if(p instanceof Customer)
			{
				Customer c=(Customer)p;
				System.out.println("Id= "+c.getUid()+" Nam= "+c.getName()+" Bank Name="+c.getBankName());
			}
			else if (p instanceof Student)
			{
				Student st=(Student)p;
				System.out.println("Uid="+st.getUid()+"Grade="+st.getGrade());
			}
			else
			{
				System.out.println("Uid= "+p.getUid()+" Name="+p.getName());
			}
		}
		
		sf.close();
		s.close();
	}

}
