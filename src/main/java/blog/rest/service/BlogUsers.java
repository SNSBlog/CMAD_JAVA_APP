package blog.rest.service;

import blog.rest.api.*;

import blog.rest.api.UserInterface;
import blog.rest.data.JPAUserDAO;
import blog.rest.data.UserDAOInterface;

public class BlogUsers implements UserInterface {

	private UserDAOInterface userdao = new JPAUserDAO();

	public void addUser(User user)  {
		if(user==null)
			System.out.println("user is null");
		
		// TODO Auto-generated method stub
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
	public int find(String user4) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}