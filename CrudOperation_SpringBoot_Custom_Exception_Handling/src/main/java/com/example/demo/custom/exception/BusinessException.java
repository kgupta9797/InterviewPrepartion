package com.example.demo.custom.exception;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String errorCodeString;
	private String errorMessageString;

	public String getErrorCodeString() {
		return errorCodeString;
	}

	public void setErrorCodeString(String errorCodeString) {
		this.errorCodeString = errorCodeString;
	}

	public String getErrorMessageString() {
		return errorMessageString;
	}

	public void setErrorMessageString(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BusinessException(String errorCodeString, String errorMessageString) {
		super();
		this.errorCodeString = errorCodeString;
		this.errorMessageString = errorMessageString;
	}

	public BusinessException() {
	}

}
