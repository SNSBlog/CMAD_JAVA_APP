

package blog.rest.api;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
@Table(name="user")
public class User  {

	
	
	
	@Id
	@Column(name="username")
	private  String username;
	
	@Column(name="password")
	private  String password;

	//@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="username")
	//@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name="username")
	//private List<Publisher> posts;
	
	public User(){}


	//public int getId() {
	//	return id;
//	}


	//public void setId(int id) {
	//	this.id = id;
	//}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public User( String username, String password) {
		super();
		//this.id = id;
		this.username = username;
		this.password = password;
	}


	
	
}



