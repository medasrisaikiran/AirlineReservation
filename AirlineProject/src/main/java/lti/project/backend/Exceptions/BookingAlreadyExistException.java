package lti.project.backend.Exceptions;

public class BookingAlreadyExistException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public BookingAlreadyExistException(String msg) {
		super(msg);
	}

}
