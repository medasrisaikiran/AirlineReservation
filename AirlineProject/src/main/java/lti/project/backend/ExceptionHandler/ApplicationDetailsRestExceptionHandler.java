package lti.project.backend.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lti.project.backend.ErrorResponse.ApplicationErrorResponse;
import lti.project.backend.Exceptions.ApplicationException;

@ControllerAdvice
public class ApplicationDetailsRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ApplicationErrorResponse> handleException(ApplicationException ude)
	{
		ApplicationErrorResponse ure=new ApplicationErrorResponse();
		ure.setStatus(HttpStatus.NOT_FOUND.value());
		ure.setMessage(ude.message);
		ure.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(ure,HttpStatus.NOT_FOUND);
	}
}
