package com.rccl.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Record;

import com.rccl.api.respository.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository transcriptRepository;

	public List<Record> findAllRecords() {
		return transcriptRepository.findAll();
	}

	public Record addRecord(Record record) {
		return transcriptRepository.save(record);
	}

}
