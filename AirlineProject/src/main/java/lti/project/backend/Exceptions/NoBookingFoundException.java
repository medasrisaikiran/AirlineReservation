package lti.project.backend.Exceptions;

public class NoBookingFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NoBookingFoundException(String msg) {
		super(msg);
	}

}
