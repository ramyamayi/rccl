package com.rccl.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.GuestLogs;
import com.rccl.api.entity.Record;
import com.rccl.api.respository.GuestLogRepository;

@Service
public class GuestLogsService {
	@Autowired
	private GuestLogRepository logRepository;

	public List<GuestLogs> getAllGuestLogs() {
		return logRepository.findAll();
	}

	public GuestLogs findByGuestLogId(Long logId) {

			return logRepository.findById(logId).orElse(null);
		
	}

	public GuestLogs addGuestLog(GuestLogs log) {
		return logRepository.save(log);
	}

	public void deleteByLogId(Long logId) {
	logRepository.deleteById(logId);
	

	}



}
