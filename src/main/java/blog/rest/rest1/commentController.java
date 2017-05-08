package blog.rest.rest1;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import blog.rest.api.Comment;
import blog.rest.api.Publisher;
import blog.rest.api.commentInterface;
import blog.rest.service.BlogComment;

@Path("/Comments")
public class commentController {

	private static commentInterface cmintf = new BlogComment();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response add(Comment cmt_data) {
		//System.out.println("blogpost  before is "+ post_data.getBlogpost());
		//System.out.println("post_title before is "+ post_data.getPosttitle());
		//user.setUsername("swetang");
		//user.setPassword("2234");
	int user_found=	cmintf.addComment(cmt_data);
		//System.out.println("blogpost  after is "+ post_data.getBlogpost());
		//System.out.println("post_title after is "+ post_data.getPosttitle());
	if (user_found==1){
		return Response.ok().entity("user is found").build();}
	else
		return Response.status(401).entity("user is not authorized to create comment or post doesn't exist").build();

	}
	

}
