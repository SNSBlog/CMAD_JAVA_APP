package blog.rest.data;

import blog.rest.api.*;

public interface PublisherDAOInterface {
	
	public int createPost(Publisher publisher);

	public int removePost(String post1);

	public void SearchPost(String postTitle);


}
