package com.rccl.api.respository;


import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.Record;


@Repository
public interface RecordRepository extends CouchbaseRepository<Record, String> {

	
	 
    @Override
    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<Record> findAll();


}