package com.rccl.api.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class TranscriptBody {

	@Id
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalDateTime time;
	private String source;
	private String message;

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TranscriptBody(LocalDateTime time, String source, String message) {
		super();
		this.time = time;
		this.source = source;
		this.message = message;
	}

	public TranscriptBody() {
	}
}
