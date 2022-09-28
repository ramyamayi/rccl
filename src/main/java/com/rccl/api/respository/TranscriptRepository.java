package com.rccl.api.respository;

import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.Transcript;

@Repository
public interface TranscriptRepository extends CouchbaseRepository<Transcript, String> {

//    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
//    List<Transcript> findBy(String name);


    /**
     * By default, all queries have a Scan Consistency NOT_BOUNDED
     * IN this case we do want the method findall
     * @return
     */
    @Override
    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<Transcript> findAll();

    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<Transcript> findByTranscriptId(String tanscriptId);
}