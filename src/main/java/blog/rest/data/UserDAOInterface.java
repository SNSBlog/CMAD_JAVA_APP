package blog.rest.data;

import blog.rest.api.*;


public interface UserDAOInterface {
	public void createUser(User user) ;

	//public int deleteUser(String user3);
	
	public Object FindUser(String user4, String passwd);
}

