package com.employer.profile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeProfileNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeProfileNotFound(String message) {
		super(message);
	}

}
