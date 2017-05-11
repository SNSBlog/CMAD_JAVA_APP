package blog.rest.rest1;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import blog.rest.api.*;
import blog.rest.service.BlogUsers;


@Path("/User")
public class UserController {

	private static UserInterface user2 = new BlogUsers();

	@POST
	//@Path("/adduser")
	@Consumes(MediaType.APPLICATION_JSON)

	
	@Produces(MediaType.TEXT_PLAIN)
	public Response add(User user) {
		System.out.println("Username is "+ user.getUsername());
		System.out.println("password is "+ user.getPassword());
		//user.setUsername("swetang");
		//user.setPassword("2234");
		user2.addUser(user);
		System.out.println("Username after is "+ user.getUsername());
		System.out.println("passwd after is "+ user.getPassword());
		return Response.ok()
				.build();
	
}
	
	

@GET
//@Path("/login")
	//@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@QueryParam("username") String user4, @QueryParam("password") String passwd)
	//public Response find(User user4)
	{
		List<Publisher> id2 = null;
	
		System.out.println("User find passowrd= " + passwd);
		
		//System.out.println("User find personid = " + user4.getPersonid());
		System.out.println("User find Userid is = " + user4);
		
		id2 =(List<Publisher>) user2.find(user4,passwd);
		GenericEntity <List<Publisher>>enty1 = new GenericEntity<List<Publisher>>(id2){};
		//String message1 = "found user are " + Integer.toString(deletedUserCount);
		//String failed = "User is not deleted";
			
		
		/*
		switch(id2)
		{
		case 0:
			return Response.ok().status(200).entity("user is found").build();			
			//break;
		case 1:
			return Response.status(401).entity("User not found in DB, please register").build();
		//	break;
		case 2:
			return Response.status(401).entity("password didn't match").build();
			//break;
		default:
			//return Response.ok().status(200).entity("user is found").build();
			return Response.serverError().status(500).build();
			
		}
		*/
		
			
		if(id2==null){
			System.out.println("no data in Usercontroller");
			return Response.status(401).entity("User not found in DB, please register").build();}
		else
			System.out.println("sending response back" + enty1.getEntity());
			return Response.ok(enty1).build(); 
	//	else 
	//	 
		//return Response.status(404).entity(failed).build();
	}
	
}