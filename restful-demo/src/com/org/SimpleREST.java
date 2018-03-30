package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("simple/")
public class SimpleREST {
	
	@Path("/content")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getSomeConten1()
	{
		Response response=null;
		Customer c=new Customer(111, "raj", 30000);
		String content=c.getId()+","+c.getName()+","+c.getSalary();
		response=Response.status(200).entity(content).build();
		return response;
	}
	
	@Path("/content")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getSomeConten2()
	{
		Response response=null;
		Customer c=new Customer(111, "raj", 30000);
		response=Response.status(200).entity(c).build();
		return response;
	}
}
