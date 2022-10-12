package com.rccl.api.couchbaseconfig;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.CouchbaseClientFactory;
import org.springframework.data.couchbase.SimpleCouchbaseClientFactory;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.core.convert.CouchbaseCustomConversions;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;

import com.rccl.api.entity.Account;
import com.rccl.api.entity.Bookings;
import com.rccl.api.entity.GuestLogs;

import lombok.SneakyThrows;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Autowired
	private ApplicationContext context;

	@Value("${spring.data.couchbase.bucket-name}")
	private String bucketName;

	@Value("${spring.couchbase.username}")
	private String username;

	@Value("${spring.couchbase.password}")
	private String password;

	@Value("${spring.couchbase.connection-string}")
	private String connectionString;

	@Value("${spring.data.couchbase.auto-index}")
	private boolean autoindexcreation;

	@Override
	protected boolean autoIndexCreation() {
		return this.autoindexcreation;
	}

	@Override
	public String getConnectionString() {
		return this.connectionString;
	}

	@Override
	public String getUserName() {
		return this.username;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getBucketName() {
		return this.bucketName;
	}

	@Override
	public void configureRepositoryOperationsMapping(RepositoryOperationsMapping mapping) {
		try {
			mapping.mapEntity(GuestLogs.class, getCouchbaseTemplate("logs"));
			mapping.mapEntity(Account.class, getCouchbaseTemplate("accounts"));
			mapping.mapEntity(Bookings.class, getCouchbaseTemplate("bookings"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SneakyThrows
	private CouchbaseTemplate getCouchbaseTemplate(String bucketName) throws Exception {
		CouchbaseTemplate template = new CouchbaseTemplate(couchbaseClientFactory(bucketName),
				mappingCouchbaseConverter(couchbaseMappingContext(customConversions()),
						new CouchbaseCustomConversions(Collections.EMPTY_LIST)));
		template.setApplicationContext(context);
		return template;
	}

	private CouchbaseClientFactory couchbaseClientFactory(String bucketName) {
		return new SimpleCouchbaseClientFactory(couchbaseCluster(couchbaseClusterEnvironment()), bucketName,
				this.getScopeName());
	}

}
