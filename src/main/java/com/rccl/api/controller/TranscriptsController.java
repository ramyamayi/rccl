package com.rccl.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Transcript;
import com.rccl.api.service.TranscriptsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TranscriptsController {
	@Autowired
	private TranscriptsService transcriptService;

	@GetMapping("/transcripts")
	public List<Transcript> getAll() throws Exception {
		return transcriptService.findAllTranscripts();
	}

	@GetMapping("/transcripts/{transcriptId}")
	public Optional<Transcript> getById(@PathVariable(name="transcriptId") String transcriptId) throws Exception {
		return transcriptService.findByTranscriptId(transcriptId);
	}
	@PostMapping("/transcripts")
	public Transcript addTranscript(@RequestBody Transcript transcript) {
		return transcriptService.addTranscript(transcript);
	}
}
