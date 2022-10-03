package com.rccl.api.entity;

public class RestError<P> {
	private int status;
	private int code;
	private String message;
	private P payload;

	public RestError(int status, int code, String message, P payload) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
		this.payload = payload;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public P getPayload() {
		return payload;
	}

	public void setPayload(P payload) {
		this.payload = payload;
	}

}
