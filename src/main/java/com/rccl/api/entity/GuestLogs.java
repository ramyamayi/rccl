package com.rccl.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import com.fasterxml.jackson.annotation.JsonFormat;


@Document

public class GuestLogs {
	@Id
	@GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES)
	//@JsonIgnore
	private Long logId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private String logComment;

	public Date getDate() {
		return date;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLogComment() {
		return logComment;
	}

	public void setLogComment(String logComment) {
		this.logComment = logComment;
	}

	

}
