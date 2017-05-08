package blog.rest.data;



import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import blog.rest.api.*;




public class JPAUserDAO implements UserDAOInterface {

	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.nds.blog");


	public void createUser(User user1)  {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(user1);
		em.getTransaction().commit();
		em.close();
	}


	
	


}// class

