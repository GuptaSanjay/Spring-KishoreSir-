package pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {
	public static SessionFactory getSessionFactory(){
		SessionFactory sf=null;
		Configuration c=new Configuration();
		c.configure();
		sf=c.buildSessionFactory();
		return sf;
	}

}
