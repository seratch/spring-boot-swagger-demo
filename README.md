## Spring Boot Swagger Demo

This sample application shows you how to do the following things:

- Swagger 2.0 Integration
- Swagger CodeGen Integration
- Testing services
- Testing controllers
- Running integration tests with RestAssured / embedded Spring Boot server
- Enabling Spring Loaded when running spring-boot app on Maven plugin

## Getting Started

### Invoking Spring Boot server

spring-boot maven plugin requires Maven 3.

```
brew install maven
mvn spring-boot:run
```

Swagger integration is already available:

- http://localhost:8080/v2/api-docs
- http://localhost:8080/swagger-ui.html#/

Run all the tests:

```
mvn test
```

### Generating Swagger client implementation

```
brew install swagger-codegen
./generate-client.sh
```

`generate-client.sh` outputs Java source code into ./client directory and does `mvn install`.
 
### Trying Swagger client implementation

```
cd ./client-test
./gradew test
```

## License

The MIT License
