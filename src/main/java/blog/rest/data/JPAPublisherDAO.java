package blog.rest.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import blog.rest.api.Publisher;

public class JPAPublisherDAO implements PublisherDAOInterface {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.nds.blog");

	
	@Override
	public int createPost(Publisher publisher) {
		// TODO Auto-generated method stub
		System.out.println("in publisherDAO");
		System.out.println(publisher.getBlogpost() + publisher.getPosttitle());
		EntityManager em = factory.createEntityManager();
		
		String  publisher_username= publisher.getUname();
		
		
		try{
			Query query1 = em.createQuery("Select username from User  u where u.username  = ?1 " ).setParameter(1, publisher_username);
		      String result = (String) query1.getSingleResult();
		      System.out.println("username is :" + result);
		    
		     
		    
		em.getTransaction().begin();
		em.persist(publisher);
		em.getTransaction().commit();
		em.close();
		return 1;
		} 
		catch (NoResultException e) {
			System.out.println("in posts DAO exception");
		      return 0;}
		
		
	}

	@Override
	public int removePost(String post1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void SearchPost(String postTitle) {
		// TODO Auto-generated method stub
		
	}

}
