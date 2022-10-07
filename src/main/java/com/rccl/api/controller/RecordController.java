package com.rccl.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Record> getAll() throws Exception {
		return recordService.findAllRecords();
	}


	@PostMapping("/records")
	public Record addRecord(@RequestBody Record record) {
		return recordService.addRecord(record);
	}
}
