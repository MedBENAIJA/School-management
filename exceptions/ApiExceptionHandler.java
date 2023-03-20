package school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

	public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException e){
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
