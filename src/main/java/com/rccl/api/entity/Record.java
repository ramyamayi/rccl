package com.rccl.api.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rccl.api.entity.transcript.RecordBody;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Document
@JsonPropertyOrder({"name","date","time","transcriptBody"})
public class Record {
	@Id
	private String record_Id;
	
	@JsonFormat(pattern = "yyyy-MM-dd")	
	private LocalDateTime date;
	
	@Field
	private List<RecordBody> recordBody = new ArrayList<RecordBody>();

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
		return record_Id;
	}

	public void setName(String record_Id) {
		this.record_Id = record_Id;
	}

	public List<RecordBody> getRecordBody() {
		return recordBody;
	}

	public void setTranscriptBody(List<RecordBody> recordBody) {
		this.recordBody = recordBody;
	}

	

}
