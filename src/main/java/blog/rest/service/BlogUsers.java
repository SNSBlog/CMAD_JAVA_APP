package blog.rest.service;

import java.util.Iterator;
import java.util.List;

import blog.rest.api.*;

import blog.rest.api.UserInterface;
import blog.rest.data.JPAUserDAO;
import blog.rest.data.UserDAOInterface;

public class BlogUsers implements UserInterface {

	private UserDAOInterface userdao = new JPAUserDAO();

	public void addUser(User user)  {
		if(user.getUsername()==null)
			System.out.println("username received is null");
		
		// TODO Auto-generated method stub
		System.out.println("in blogUsers");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		//user.setPassword(user.password);
		
      userdao.createUser(user);
	}

	@Override
	public int delete(String user3) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List <Publisher> find(String user4, String passwd4) {
		List<Object> id2=null;
		List<Publisher> p2 = null;
	
		//System.out.println("Blog User find passowrd= " + user4.getPassword());
		//System.out.println("Blog User find Userid = " + user4.getUsername());
				
			//id2=	(List<Object>) userdao.FindUser(user4,passwd4);
		p2=	(List<Publisher>) userdao.FindUser(user4,passwd4);
		
		System.out.println("-----------------------");
		
			for(Publisher i:p2){
				System.out.println(i.getPosttitle());
				System.out.println(i.getBlogpost());
			}
			System.out.println("Id2 in blog is = " + p2);
				return p2;
		
	}
	
}