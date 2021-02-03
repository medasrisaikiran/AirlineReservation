package lti.project.backend.Exceptions;

public class InSufficientDataException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InSufficientDataException(String msg) {
		super(msg);
	}

}
