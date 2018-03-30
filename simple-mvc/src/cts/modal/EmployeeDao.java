package cts.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
	public int store(Employee emp){
		int status=0;
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(emp);
		tr.commit();
		status=1;
		sf.close();
		s.close();
		
		return status;
	}

}
