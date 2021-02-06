package lti.project.backend.Exceptions;

public class ApplicationException extends RuntimeException{
	public String message;
	ApplicationException()
	{
		super();
	}
	
	
	ApplicationException(String message)
	{
		super(message);
	}
	
}