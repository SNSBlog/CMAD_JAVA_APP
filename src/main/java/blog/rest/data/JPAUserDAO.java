package blog.rest.data;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



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


	@Override
	public List<Publisher> FindUser(String user4, String passwd) {
		
		//String passwd1 = user4.getPassword();
		//String uname1 = user4.getUsername();
		Object finduser6 = null;
		String db_password = null;
		String db_uname=null;
		String passwd1;
		String uname1;
		Object obj=null;
		List <Publisher> results=null;
		int id2 =0;
		
		//System.out.println("passwd1=" + passwd1 + "uname1="+ uname1);
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
	
		try{
		// finduser6 = em.createQuery("Select c from User c where Username like ?1 ").setParameter(1, user4.getUsername()).getSingleResult();
		
		 
			em.getTransaction().begin();
		User findUser1=	em.find(User.class,user4);
			//em.getTransaction().commit();
			//em.close();
		
			passwd1 = passwd;
			uname1 = user4;
			
			db_uname = findUser1.getUsername();
			 db_password = findUser1.getPassword();
			System.out.println("DB user name = " + findUser1.getUsername());
			System.out.println("DB password = " + findUser1.getPassword());
			
			
			
			if(db_password.equals(passwd1)){
				id2=0; System.out.println("login allowed");
				
			

				TypedQuery<Publisher> q2 = em.createQuery("select p  from Publisher p where uname like ?1",Publisher.class).setParameter(1, db_uname);
			 results = q2.getResultList();
			//obj= results.toArray();
			System.out.println("size is " + results.size());
			
			for(Publisher ent : results){
			System.out.println(ent.getBlogpost());
			System.out.println(ent.getPosttitle());
				
			} // for
			
			
			em.getTransaction().commit();
			em.close();
			
			
			} // uname and password matched
			else{ id2=2; System.out.println("no login , passowrkd worng");}  // password doesn't match.
			
			
		}
		catch(NoResultException e)
		{
			e.printStackTrace();
			System.out.println("Doesn't match");
			id2 =1; // no user found
			}
		catch(NullPointerException enull){enull.printStackTrace(); id2=1;}
		
		
	
	//em.getTransaction().begin();
		//em.find(User.class,user4.getPersonid());
	//	em.getTransaction().commit();
	//	em.close();
		
		return results;
	}// find user

		
	


	
	


}// class

