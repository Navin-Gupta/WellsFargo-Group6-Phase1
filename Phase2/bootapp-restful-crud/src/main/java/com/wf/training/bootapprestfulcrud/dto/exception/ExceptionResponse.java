package com.wf.training.bootapprestfulcrud.dto.exception;

public class ExceptionResponse {

	private String message;
	private Long timeStamp;
	private Integer errorCode;
	
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ExceptionResponse(String message, Long timeStamp, Integer errorCode) {
		super();
		this.message = message;
		this.timeStamp = timeStamp;
		this.errorCode = errorCode;
	}



	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	} 
	
	
}
