package blog.rest.rest1;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import blog.rest.api.PostInterface;
import blog.rest.api.Publisher;
import blog.rest.service.BlogPublisher;


@Path("/Posts")
public class postController {

	private static PostInterface post1 = new BlogPublisher();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response add(Publisher post_data) {
		System.out.println("blogpost  before is "+ post_data.getBlogpost());
		System.out.println("post_title before is "+ post_data.getPosttitle());
		//user.setUsername("swetang");
		//user.setPassword("2234");
		int usr_fnd =post1.addPost(post_data);
		System.out.println("blogpost  after is "+ post_data.getBlogpost());
		System.out.println("post_title after is "+ post_data.getPosttitle());
		
		if (usr_fnd==1)
		return Response.ok().entity("user is found").build();
		else
			return Response.status(401).entity("can't add post, you are not authorized to add post").build();
	
	
	}// add
}//class