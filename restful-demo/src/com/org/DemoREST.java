package com.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoREST {
	@Path("/greeting")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String test(){
		System.out.println("test() is called");
		return "<greetig> Hello </greeting>";
	}
	
	@Path("/getCustomer")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Customer sendCustomer(){
		System.out.println("sendCustomer() is called");
		Customer c=new Customer(111,"Raj",55000);
		return c;
	}
	
	@Path("/sendcus")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String receiveCustomer(Customer c){
		System.out.println("Id="+c.getId()+"Name="+c.getName()+"Salary"+c.getSalary());
		return "stored Successfully";
	}

}
