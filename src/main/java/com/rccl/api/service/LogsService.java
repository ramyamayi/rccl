package com.rccl.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Logs;
import com.rccl.api.entity.Transcript;
import com.rccl.api.respository.LogRepository;

@Service
public class LogsService {
	@Autowired
	private LogRepository logRepository;

	public List<Logs> getAllLogs() {
		return logRepository.findAll();
	}

	public Optional<Logs> findByLogId(Long logId) {
		
		if(logRepository.existsById(logId)) {
			return logRepository.findById(logId);
		}else {
				return Optional.empty();
			}
		}
	

	public Logs addLog(Logs log) {
		return logRepository.save(log);
	}
	

}
