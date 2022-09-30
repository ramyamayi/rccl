package com.rccl.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Transcript;

import com.rccl.api.respository.TranscriptRepository;

@Service
public class TranscriptsService {
	@Autowired
	private TranscriptRepository transcriptRepository;

	public List<Transcript> findAllTranscripts() {
		return transcriptRepository.findAll();
	}


	public Optional<Transcript> findByTranscriptId(String transcriptId) {
	if(transcriptRepository.existsById(transcriptId)) {
		return transcriptRepository.findById(transcriptId);
		}else {
			return Optional.empty();
		}
	}


	public Transcript addTranscript(Transcript transcript) {
		return transcriptRepository.save(transcript);
	}

	
}
