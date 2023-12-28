## What is Spring Data REST?
Spring Data REST's mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.
It makes it easy to use data access technologies, relational and non-relational databases, map-reduce frameworks, and cloud-based data services.

**In this repository, we’re gonna build a Spring Data REST example in Spring Boot with Maven that uses Spring Data JPA to interact with Postgres database.**
## Architecture of Spring Data REST:
**1-Spring Data REST:** Spring Data REST is a framework that makes it easy to build hypermedia-driven REST web services on top of Spring Data repositories.
**2-DAO [Repository]:** The DAO layer is responsible for interacting with the underlying data store. It is implemented using Spring Data repositories.
**3-Database:** The database is the underlying data store that Spring Data REST uses to store and retrieve data.
**4-Postman:** Postman is a tool that can be used to send and receive HTTP requests. It is used in the diagram to show how to interact with the Spring Data REST API.

##Spring Data REST architecture works as follows:
1-A client sends an HTTP request to the Spring Data REST server.

2-The Spring Data REST server receives the HTTP request and routes it to the appropriate repository.

3-The repository interacts with the underlying data store to perform the requested operation.

4-The repository returns the results of the operation to the Spring Data REST server.

5-The Spring Data REST server returns the results of the operation to the client.
