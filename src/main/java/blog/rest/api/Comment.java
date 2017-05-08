package blog.rest.api;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	
	@Id
	@Column(name="commentid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int commentid;
	private int postid;
	
	@Column(name="Date")
	private Date date1 = new Date();
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="uname")
	private String uname;
	
	
	public Comment(){}



	public int getCommentid() {
		return commentid;
	}



	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}



	public int getPostid() {
		return postid;
	}



	public void setPostid(int postid) {
		this.postid = postid;
	}



	public Date getDate1() {
		return date1;
	}



	public void setDate1(Date date1) {
		this.date1 = date1;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}




	
}
