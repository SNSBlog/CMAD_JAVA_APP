package blog.rest.data;

import blog.rest.api.Comment;

public interface CommentDAOInterface {
	public int CreateComment(Comment cmt1);

	public int removeComment(int commentid);


}
