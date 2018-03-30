package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("doing updation operatin by passs id at run time");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		System.out.println("enter the id");
		int tempid=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee)s.get(Employee.class, tempid);
		if(e!=null){
			System.out.println("old name="+e.getName());
			System.out.println("enter the name to update");
			String tempName=sc.nextLine();
			e.setName(tempName);
			System.out.println("New name="+e.getName());
			s.update(e);
			//tr.commit();
		}
		else{
			System.err.println("Sorry id"+tempid+"not found");
		}
		
		s.close();
		sf.close();
		sc.close();
		

	}

}
