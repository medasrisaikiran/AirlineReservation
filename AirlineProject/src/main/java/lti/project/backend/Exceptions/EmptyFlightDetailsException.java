package lti.project.backend.Exceptions;

public class EmptyFlightDetailsException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyFlightDetailsException(String msg)
	{
		super(msg);
	}
}
