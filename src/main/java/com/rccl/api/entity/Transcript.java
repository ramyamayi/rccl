package com.rccl.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.core.deps.com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Transcript {
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	@Id
	private String transcriptId;
	private String transcript_body;

	public Transcript(Date date, String transcriptId, String transcript_body) {
		super();
		this.date = date;
		this.transcriptId = transcriptId;
		this.transcript_body = transcript_body;
	}

	public Transcript() {
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return transcriptId;
	}

	public void setTranscriptId(String transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getTranscript_body() {
		return transcript_body;
	}

	public void setTranscript_body(String transcript_body) {
		this.transcript_body = transcript_body;
	}

}
