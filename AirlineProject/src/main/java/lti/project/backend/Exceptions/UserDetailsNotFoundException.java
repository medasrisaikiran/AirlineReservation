package lti.project.backend.Exceptions;

public class UserDetailsNotFoundException extends UserDetailsException{

	public UserDetailsNotFoundException()
	{
		super();
		this.message="Entered User Id's Details Not Found.";
	}
}
