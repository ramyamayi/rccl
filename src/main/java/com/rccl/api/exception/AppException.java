package com.rccl.api.exception;

import org.springframework.http.HttpStatus;

public class AppException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6750423264391756564L;

	private HttpStatus httpStatus;
	private int errorCode;

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppException(String message) {
		super(message);
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
