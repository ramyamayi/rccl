package com.rccl.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Record;

import com.rccl.api.respository.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository recordRepository;

	public List<Record> findAllRecords() {
		return recordRepository.findAll();
	}

	public Record addRecord(Record record) {
		return recordRepository.save(record);
	}

	public void deleteRecordByRecordName(String record_Id) {
		recordRepository.deleteById(record_Id);
	}

	public Record updateRecord(String record_Id, Record record) throws Exception {
		Record updateRecord = recordRepository.findById(record_Id).orElseThrow(() -> new Exception("Resource not found"));
		return recordRepository.save(updateRecord);
	}

	public Record getRecordByRecordId(String recordId) {
		return recordRepository.findById(recordId).orElse(null);
	}

}
