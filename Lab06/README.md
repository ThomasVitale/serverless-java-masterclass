# Lab 6: Spring Cloud Stream and RabbitMQ

## Learning goals

* Understanding data streaming with Spring Cloud Stream
* Consuming functions via event brokers with Spring Cloud Function and RabbitMQ

## Overview

1. Run a RabbitMQ container from the provided `docker-compose.yml` file (command: `docker-compose up -d`).
2. Configure the Spring Cloud Stream binding between function and exchanges/queues in RabbitMQ in the `application.yml` file, using the `spring.cloud.stream.bindings.*` properties. The input channel will also need configuration for which consumer group to join.
3. Run the application with `./gradlew bootRun` and test it works as expected. You can send a message to the input queue from the RabbitMQ Management Console (http://localhost:15672). The default credentials are `guest`/`guest`.
4. From the RabbitMQ Management Console (http://localhost:15672), check what exchanges and queues have been created. Why isn't there a queue for the `skills` binding?
5. Stop the application with `Ctrl+C` and RabbitMQ with `docker-compose down`.
6. In the `end` folder, inspect how the Spring Cloud Stream bindings have been tested using a test binder.
