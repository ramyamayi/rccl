package com.rccl.api.respository;

import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.GuestLogs;

@Repository
public interface GuestLogRepository extends CouchbaseRepository<GuestLogs,Long>{
	@Override
    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<GuestLogs> findAll();
}
