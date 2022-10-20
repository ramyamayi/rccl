package com.rccl.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Record;
import com.rccl.api.service.RecordService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class  RecordController {
	@Autowired
	private RecordService recordService;

	@GetMapping("/records")
	public List<Record> getAll() {
		return recordService.findAllRecords();
	}
	
	@GetMapping("/records/recordId")
	public Record getRecordByRecordId(@PathVariable("recordId") String recordId) throws Exception {
		return recordService.getRecordByRecordId(recordId);
	}

	@PostMapping("/records")
	public Record addRecord(@RequestBody Record record) {
		return recordService.addRecord(record);
	}
	
	@DeleteMapping("/records/{record_Id}")
	public String deleteRecord(@PathVariable("record_Id") String record_Id) {
		recordService.deleteRecordByRecordName(record_Id);
		return "Record deleted";
	}
	
	@PutMapping("/records/{record_Id}")
	public Record updateRecord(@PathVariable("record_Id") String record_Id ,@RequestBody Record record) throws Exception {
		return recordService.updateRecord(record_Id,record);
	}
	
	
}
