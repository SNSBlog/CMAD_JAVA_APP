package blog.rest.service;

import blog.rest.data.*;
import blog.rest.api.*;

public class BlogPublisher implements PostInterface{

	private PublisherDAOInterface publisherdao = new JPAPublisherDAO();
	
	@Override
	public int addPost(Publisher publisher) {
		// TODO Auto-generated method stub
		//System.out.println("In blogpublisher post is::" + publisher.getBlogpost());
		//System.out.println("In blogpublisher title:: "+publisher.getPosttitle());
		//System.out.println("User is: "+publisher.getUsername());
		//user.setPassword(user.password);
		//User u = new User();String s = u.getUsername();
		//publisher.setUsername(s);
		
   int user_fnd=   publisherdao.createPost(publisher);
   return user_fnd;

	}

	@Override
	public int deletePost(String post1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void findPost(String postTitle) {
		// TODO Auto-generated method stub
		
	}

}
