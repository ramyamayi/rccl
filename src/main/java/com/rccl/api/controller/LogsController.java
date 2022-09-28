package com.rccl.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Logs;

import com.rccl.api.service.LogsService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class LogsController {
	@Autowired
	LogsService logsService;
	
	@GetMapping("/logs")
	public List<Logs> getAll() throws Exception{
		return logsService.getAllLogs();
	}
	
	@GetMapping("/logs/{logId}")
	public Optional<Logs> getByLogId(@PathVariable("logId") Long logId ) throws Exception {
		return logsService.findByLogId(logId);
	}
}
