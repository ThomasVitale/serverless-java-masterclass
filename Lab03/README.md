# Lab 3: Spring Cloud Function and HTTP

## Learning goals

* Consuming functions via HTTP
* Monitoring functions with Spring Boot Actuator

## Overview

1. Use the `spring.cloud.function.definition` property in the `application.yml` to define the cloud function that the framework will expose via the root HTTP endpoint (cloud function definition: `uppercase|sentence`).
2. Run the application with `./gradlew bootRun` and test it works as expected. When you're done, stop the process with `Ctrl+C`.
3. Using the integration test support provided via the `@SpringBootTest` annotation and the `WebTestClient` bean, write auto tests to verify the behavior of the application when calling the `/` endpoint.
4. Run the application with `./gradlew bootRun` and check the information returned by Spring Boot Actuator in relation to the functions managed by Spring Cloud Function (endpoint: `/actuator/functions`). When you're done, stop the process with `Ctrl+C`.

## Tips

Using [httpie](https://httpie.io), you can verify the cloud function behavior as follows:

```shell
http :8080 name=piano
```
