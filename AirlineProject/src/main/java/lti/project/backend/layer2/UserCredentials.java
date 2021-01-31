package lti.project.backend.layer2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usercredentials")
public class UserCredentials 
{
	@Column(name="username",length=20)
	private String USERNAME;
	@Column(name="password",length=20)
	private String PASSWORD;
	public String getUSERNAME() {
		return USERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setUSERNAME(String username) {
		USERNAME = username;
	}
	public void setPASSWORD(String password) {
		PASSWORD = password;
	}
	
}
