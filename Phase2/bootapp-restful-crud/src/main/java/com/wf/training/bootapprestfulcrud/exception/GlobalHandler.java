package com.wf.training.bootapprestfulcrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wf.training.bootapprestfulcrud.dto.exception.ExceptionResponse;

// @ControllerAdvice // view based application
@RestControllerAdvice  // registers it as global exception handler
public class GlobalHandler {

	// exception handler method
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ExceptionResponse> handler(NullPointerException ex) {
		// should return back an ExceptionResponse DTO Object
		ExceptionResponse exResponse = 
				new ExceptionResponse("Record not found", 
									  System.currentTimeMillis(), 
									  HttpStatus.NOT_FOUND.value());
		ResponseEntity<ExceptionResponse> response =
				new ResponseEntity<ExceptionResponse>(exResponse, HttpStatus.NOT_FOUND);
		
		return response;
		
	}
	
	// exception handler method
	@ExceptionHandler(Exception.class)
	public void handler(Exception ex) {
		
	}
}
