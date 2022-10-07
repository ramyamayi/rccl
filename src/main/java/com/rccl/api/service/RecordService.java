package com.rccl.api.service;

import java.util.List;

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

	public Transcript addTranscript(Transcript transcript) {
		return transcriptRepository.save(transcript);
	}

}
