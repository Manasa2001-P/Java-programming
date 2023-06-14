package test;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() 
	{
		String resource="<? xml version='1.0 ?>"   +
		"<hello> Hi Neel, This is Hello from XML </hello>";
		return resource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJASON() 
	{
		String resource=null;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() 
	{
		String resource="<h1> Hi Neel, This is Hello from HTML </h1>";
		return resource;
	}
}
