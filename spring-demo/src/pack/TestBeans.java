package pack;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	/*	Identifier id=(Identifier)context.getBean("b1");
		Identifier id1=(Identifier)context.getBean("b2");
		id.display();
		id1.display();*/
		//Customer c=(Customer)context.getBean("c1");
		//c.getInformation();
		Bank bank1=(Bank) context.getBean("bank");
		List li=bank1.getLocation();
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			String bank2 =(String) it.next();
		System.out.println(bank2);
		}
		
	}

}
