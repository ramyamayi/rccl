package com.rccl.api.respository;


import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlSecondaryIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.Transcript;
@SuppressWarnings("deprecation")
@N1qlSecondaryIndexed(indexName = "myview")
@Repository
public interface TranscriptRepository extends CouchbaseRepository<Transcript, String> {

	
	 
    @Override
    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<Transcript> findAll();


}