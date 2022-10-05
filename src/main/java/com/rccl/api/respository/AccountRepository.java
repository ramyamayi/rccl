package com.rccl.api.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rccl.api.entity.Account;

public interface AccountRepository extends CouchbaseRepository<Account, String> {
	@Override
	@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
	List<Account> findAll();

	/*@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
	Optional<Account> findByAccountId(String AccountId);

	@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
	Optional<Account> findByNameIgnoreCase(String name);

	@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
	Optional<Account> findByPhone(String phone);*/

}
