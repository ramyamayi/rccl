package com.rccl.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.couchbase.core.CouchbaseTemplate;

import org.springframework.stereotype.Component;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.manager.query.CreatePrimaryQueryIndexOptions;
import com.rccl.api.entity.Logs;
import com.rccl.api.entity.Transcript;
import com.rccl.api.respository.LogRepository;
import com.rccl.api.respository.TranscriptRepository;

/**
 * This class is executed once after the application starts
 */
@Component
public class SimpleCommand implements CommandLineRunner {

	@Autowired
	Cluster cluster;

	@Autowired
	CouchbaseTemplate couchbaseTemplate;

	@Autowired
	TranscriptRepository transcriptRepository;

	@Autowired
	LogRepository logRepository;

	@Override
	public void run(String... strings) throws Exception {

		// create primary index if you don't have one
		//cluster.queryIndexes().createPrimaryIndex(couchbaseTemplate.getBucketName(),
		//		CreatePrimaryQueryIndexOptions.createPrimaryQueryIndexOptions().ignoreIfExists(true));

		// Create and save a new user
		for (int i = 1; i < 5; i++) {
			Transcript transcript = new Transcript();
			transcript.setDate(new Date());
			transcript.setTranscriptId("ChatTranscript" + i);
			transcript.setTranscript_body("Test Transcript message " + i);
			transcriptRepository.save(transcript);
		}

		for (Long i = 5L; i < 10; i++) {
			Logs log = new Logs();
			log.setLogId(i);
			log.setDate(new Date());

			log.setLogComment("Test Log message " + i);
			logRepository.save(log);
		}

	}
}