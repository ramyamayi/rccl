package com.rccl.api.respository;

import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.Bookings;

@Repository
public interface BookingRepository extends CouchbaseRepository<Bookings, String> {
	@Override
    @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
    List<Bookings> findAll();
	
	 @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
	List<Bookings> findByAccountId(String accountId);
}
