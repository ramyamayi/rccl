package com.rccl.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.GuestLogs;
import com.rccl.api.service.GuestLogsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class GuestLogsController {
	@Autowired
	GuestLogsService logsService;

	@GetMapping("/logs")
	public List<GuestLogs> getAll() throws Exception {
		return logsService.getAllGuestLogs();
	}

	@GetMapping("/logs/{logId}")
	public Optional<GuestLogs> getByLogId(@PathVariable("logId") Long logId) throws Exception {
		return logsService.findByGuestLogId(logId);
	}

	@PostMapping("/logs")
	public GuestLogs addLog(@RequestBody GuestLogs log) {
		return logsService.addGuestLog(log);
	}
}
