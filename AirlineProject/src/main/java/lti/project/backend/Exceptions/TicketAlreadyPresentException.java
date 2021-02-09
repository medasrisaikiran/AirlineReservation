package lti.project.backend.Exceptions;

public class TicketAlreadyPresentException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TicketAlreadyPresentException(String msg)
	{
		super(msg);
	}

}
