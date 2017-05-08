package blog.rest.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import blog.rest.api.Comment;
import blog.rest.api.Publisher;
import blog.rest.api.User;

public class JPACommentDAO implements CommentDAOInterface {

	//@SuppressWarnings("unused")
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.nds.blog");

	@Override
	public int CreateComment(Comment cmt1) {
		// TODO Auto-generated method stub
		String cmt_username= cmt1.getUname();
		int postid = cmt1.getPostid();
		 System.out.println("post_id is :" + postid);
		    
		//int user_found =0;
		EntityManager em = factory.createEntityManager();
		
		try{
		Query query1 = em.createQuery("Select username from User  u where u.username  = ?1 " ).setParameter(1, cmt_username);
	      String result = (String) query1.getSingleResult();
	      System.out.println("username is :" + result);
	    
	      Query query2 = em.createQuery("Select postid from Publisher p  where p.postid  = ?1 " ).setParameter(1, postid);
	      int result1 = (int) query2.getSingleResult();
	      System.out.println("postid is :" + result1);
	    
	      
	      em.getTransaction().begin();
			em.persist(cmt1);
			em.getTransaction().commit();
			em.close();
		
	      
	      return 1;
		}catch (NoResultException e) {
			System.out.println("in comment exception");
		      return 0;}
		
		
		
			
	}

	@Override
	public int removeComment(int commentid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
