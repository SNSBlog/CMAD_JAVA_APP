package blog.rest.api;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="posts")
public class Publisher {

	
	
	
	@Id
	@Column(name="postid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int postid;
	
	@Column(name="Date")
	private Date createdDate = new Date();
		
	@Column(name = "uname")
	private String uname;	
		//@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
		//@ManyToOne (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
		
		//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		
		//@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 ////@JoinColumn(name="username")
		//private User username ; 
		
	
	@Column(name="posttitle")
	private String posttitle;
	
	@Column(name="blogpost")
	private String blogpost;



  public Publisher(){}



public int getPostid() {
	return postid;
}



public void setPostid(int postid) {
	this.postid = postid;
}



public Date getCreatedDate() {
	return createdDate;
}



public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}



public String getUname() {
	return uname;
}



public void setUname(String uname) {
	this.uname = uname;
}



public String getPosttitle() {
	return posttitle;
}



public void setPosttitle(String posttitle) {
	this.posttitle = posttitle;
}



public String getBlogpost() {
	return blogpost;
}



public void setBlogpost(String blogpost) {
	this.blogpost = blogpost;
}

	
}
