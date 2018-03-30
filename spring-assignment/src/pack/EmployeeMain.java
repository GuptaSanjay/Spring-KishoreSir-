package pack;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee) context.getBean("employeeObj");
		EmployeeService empser=(EmployeeService) context.getBean("employeeServ");
		
		Scanner sc=new Scanner(System.in);
		int select;
		do{
		System.out.println("*******Employee Management System*********");
		System.out.println("1)Add 2)Delete by Id 3)Display All 4)Update by Id 5)Exit");
	    select=sc.nextInt();
		switch(select){
		case 1:
		{
			System.out.println("****Performing Insert****");
			System.out.println("Enter Id");
			emp.setId(sc.nextInt());
			System.out.println("Enter Name");
			emp.setName(sc.next());
			System.out.println("Enter Salary");
			emp.setSalary(sc.nextDouble());
			System.out.println("Enter Designatin");
			emp.setDesignation(sc.next());
			empser.insert(emp);
			System.out.println("****Employee Information Stored Successfully");
			System.out.println("*******Employee Management System*********");
			System.out.println("1)Add 2)Delete by Id 3)Display All 4)Update by Id 5)Exit");
			break;
		}
		case 2:{
			System.out.println("****Performing Delete****");
			System.out.println("Enter Id");
			emp.setId(sc.nextInt());
			empser.delete(emp);
			System.out.println("****Deleted Successfully****");
			System.out.println("*******Employee Management System*********");
			System.out.println("1)Add 2)Delete by Id 3)Display All 4)Update by Id 5)Exit");
			break;
		}
		case 3:{
			System.out.println("*****Displaying All Employee*****");
			List<Employee> employeelist=empser.getallEmployees();
			for(Employee e:employeelist){
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
			}
			break;
		}
		case 4:{
			System.out.println("******Updating*****");
			System.out.println("Enter Id");
			emp.setId(sc.nextInt());
			System.out.println("menu for updating");
			System.out.println("1)Name  2)salary  3)Designation 4)exit");
			int ch;
			do{
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1 :{
				System.out.println("Enter name");
				emp.setName(sc.next());
				empser.update(emp);
				System.out.println("menu for updating");
				System.out.println("1)Name  2)salary  3)Designation 4)exit");
				break;
			}
			case 2:{
				System.out.println("Enter Salary");
				emp.setSalary(sc.nextDouble());
				empser.update(emp);
				System.out.println("menu for updating");
				System.out.println("1)Name  2)salary  3)Designation 4)exit");
				break;
			}
			case 3:{
				System.out.println("Enter Designation");
				emp.setDesignation(sc.next());
				empser.update(emp);
				System.out.println("menu for updating");
				System.out.println("1)Name  2)salary  3)Designation 4)exit");
				break;
			}
			case 4:
				default:
				break;
			}
			}while(ch!=4);
			
			System.out.println("*******Employee Management System*********");
			System.out.println("1)Add 2)Delete by Id 3)Display All 4)Update by Id 5)Exit");
			break;
		}
		case 5:{
			System.out.println("Exit");
		}
		}
		
		}while(select!=5);
		

	}

}
