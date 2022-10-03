package com.rccl.api.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rccl.api.entity.RestError;
import com.rccl.api.exception.AppException;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<RestError<Object>> handleException(Exception e) {
		RestError<Object> error = new RestError<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), 0, e.getMessage(), null);
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(AppException.class)
	public ResponseEntity<RestError<Object>> handleException(AppException e) {
		RestError<Object> error = new RestError<>(
				e.getHttpStatus() != null ? e.getHttpStatus().value() : HttpStatus.INTERNAL_SERVER_ERROR.value(),
				e.getErrorCode(), e.getMessage(), null);
		return new ResponseEntity<>(error,
				e.getHttpStatus() != null ? e.getHttpStatus() : HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
