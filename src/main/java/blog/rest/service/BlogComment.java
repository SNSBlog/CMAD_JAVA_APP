package blog.rest.service;

import blog.rest.api.Comment;
import blog.rest.api.commentInterface;
import blog.rest.data.CommentDAOInterface;
import blog.rest.data.JPACommentDAO;

public class BlogComment implements commentInterface {

	private static CommentDAOInterface cmtdao = new JPACommentDAO();
	@Override
	public int addComment(Comment cmt1) {
		// TODO Auto-generated method stub
		int user_found = cmtdao.CreateComment(cmt1);
		System.out.println("user found = " + user_found);
	return user_found;
	}

	@Override
	public void deleteComment(int cmt_id) {
		// TODO Auto-generated method stub

	}

}
