package lti.project.backend.Exceptions;

public class UserDetailsNotFoundException extends UserDetailsException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDetailsNotFoundException()
	{
		super();
		this.message="Entered User Id's Details Not Found.";
	}
}
