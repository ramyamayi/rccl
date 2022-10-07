package com.rccl.api.entity.transcript;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class RecordBody {

	@Id
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalDateTime mTime;
	private String source;
	private String message;

	public LocalDateTime getmTime() {
		return mTime;
	}

	public void setmTime(LocalDateTime mTime) {
		this.mTime = mTime;
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

	public RecordBody(LocalDateTime mTime, String source, String message) {
		super();
		this.mTime = mTime;
		this.source = source;
		this.message = message;
	}

	public RecordBody() {
	}
}
