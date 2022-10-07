package com.rccl.api.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rccl.api.entity.transcript.TranscriptBody;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Document
@JsonPropertyOrder({"name","date","time","transcriptBody"})
public class Transcript {
	@Id
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime date;
	
	@Field
	private List<TranscriptBody> transcriptBody = new ArrayList<TranscriptBody>();

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@JsonFormat(pattern = "HH:mm:ss")
	public LocalDateTime getTime() {
		return date;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TranscriptBody> getTranscriptBody() {
		return transcriptBody;
	}

	public void setTranscriptBody(List<TranscriptBody> transcriptBody) {
		this.transcriptBody = transcriptBody;
	}

	public Transcript(String name, LocalDateTime date, List<TranscriptBody> transcriptBody
			) {
		super();
		this.name = name;
		this.date = date;
		this.transcriptBody = transcriptBody;
	}

	public Transcript() {

	}

}
