package lti.project.backend.Exceptions;

public class FlightDetailsAlreadyPresentException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightDetailsAlreadyPresentException(String msg)
	{
		super(msg);
	}
}
