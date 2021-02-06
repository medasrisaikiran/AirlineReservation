package lti.project.backend.Exceptions;

public class UsersDetailsDeleteException extends UserDetailsException{

	
	public UsersDetailsDeleteException()
	{
		super();
		this.message="Operation Failed: Error encountered while trying to delete user details.";
	}
	
	
}
