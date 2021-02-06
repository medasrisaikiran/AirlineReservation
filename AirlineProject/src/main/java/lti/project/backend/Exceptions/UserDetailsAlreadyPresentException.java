package lti.project.backend.Exceptions;

public class UserDetailsAlreadyPresentException extends UserDetailsException{
	public UserDetailsAlreadyPresentException()
	{
		super();
		this.message="Entered user details are already present";
		System.out.println(this.message);
	}
	
}