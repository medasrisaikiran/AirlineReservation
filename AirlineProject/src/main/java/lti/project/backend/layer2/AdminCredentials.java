package lti.project.backend.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admincredentials")
public class AdminCredentials 
{
	@Column(name="username",length=20)
	private String USERNAME;
	@Column(name="password",length=20)
	private String PASSWORD;
	public String getUsername() {
		return USERNAME;
	}
	public String getPassword() {
		return PASSWORD;
	}
	public void setUsername(String username) {
		this.USERNAME = username;
	}
	public void setPassword(String password) {
		this.PASSWORD = password;
	}
}
