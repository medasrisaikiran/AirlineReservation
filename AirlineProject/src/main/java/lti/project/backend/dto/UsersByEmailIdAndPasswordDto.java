package lti.project.backend.dto;

public class UsersByEmailIdAndPasswordDto 
{
	String emailId;
	String password;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
