package blog.rest.rest1;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import blog.rest.api.*;

import blog.rest.api.UserInterface;
import blog.rest.service.BlogUsers;


@Path("/User")
public class UserController {

	private static UserInterface user2 = new BlogUsers();

	@POST
	//@Path("/adduser")
	@Consumes(MediaType.APPLICATION_JSON)

	
	//@Produces(MediaType.APPLICATION_JSON)
	public Response add(User user) {
		System.out.println("Username is "+ user.getUsername());
		System.out.println("Username is "+ user.getPassword());
		//user.setUsername("swetang");
		//user.setPassword("2234");
		user2.addUser(user);
		System.out.println("Username after is "+ user.getUsername());
		System.out.println("Username after is "+ user.getPassword());
		return Response.ok()
				.build();
	
}
}