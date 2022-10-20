Project Description:
This is a Java spring boot application for developing backend APIs.The application has four entities and each entity has controller,service,service Implementation and Repository interfaces and classes.
API mapping is done in the controller and its implementation is done in the service layer.


What You Need:
A favorite text editor or IDE
JDK 8
Maven 3.2+
Spring Tools for your coding environment
Couchbase server installed


Front end sister repo is here: https://code.panderasystems.com/megan.hostetter/rccl-chatbot/-/tree/guest-search/crm-lite/


How It Works:
The backend apis are developed using Spring boot. 
Build the package using mvn clean install command. This will create a JAR file with embedded tomcat server in it.
Run using mvn spring-boot:run
Application will be accessible via port 8080 (localhost:8080). Port can be changed if required in application.properties.

The main application is configured in spring-rccl\src\main\java\com\rccl\api\SpringRcclApplication.java


The @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It’s the same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations. 


@SpringBootApplication
public class SpringRcclApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRcclApplication.class, args);
	}

}

For database connection:
For configuring couchbase db,used couchbase config class and mapped entity classes to the buckets in the database.
Change the connection string(url),username,password and bucket name in application properties to connect to your database.

The application properties are configured in spring-rccl/src/main/resources/application.properties

spring.couchbase.connection-string=127.0.0.1
spring.couchbase.username=#username
spring.couchbase.password=#password
spring.data.couchbase.bucket-name=record
spring.data.couchbase.auto-index=true

To aceess database, login with username and password @http://localhost:8091/

To view Swagger 2 API docs:
Used @EnableSwagger2 annotation  
Run the server and browse to http://localhost:8080/swagger-ui/index.html or  at http://localhost:8080/v2/api-docs in Postman