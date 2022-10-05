package com.rccl.api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rccl.api.entity.Transcript;
import com.rccl.api.entity.TranscriptBody;
import com.rccl.api.respository.TranscriptRepository;

@Component
public class TranscriptCommandRunner implements CommandLineRunner {

	@Autowired
	TranscriptRepository transcriptRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SimpleCommand");
		LocalDateTime currentDateTime = LocalDateTime.now();
		List<TranscriptBody> transcriptBodyList = new ArrayList<TranscriptBody>();
		for (int i = 1; i < 5; i++) {
			TranscriptBody transcriptBody = new TranscriptBody(currentDateTime.plusSeconds(i), "Test Source",
					"New Message " + i);
			transcriptBodyList.add(transcriptBody);
		}
		for(int i=1;i<=3;i++) {
		Transcript transcript = new Transcript("Transcript"+i, currentDateTime, transcriptBodyList);
		transcriptRepository.save(transcript);
		}
	
	}

}
