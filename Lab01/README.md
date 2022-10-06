# Lab 1: Functional programming in Java

## Learning goals

* Functional programming paradigm in Java
* Java functional interfaces: `Function`, `Consumer`, `Supplier`
* Function composition and limitations

## Overview

In this excercise you'll practice implementing business logic as functions using the Java standard APIs.

1. Define a function that takes a String as input and returnes a String as output. The function is responsible for converting a musical instrument name to uppercase. For example: `piano` -> `PIANO`.
2. Define a sentence function that takes a String as input and returnes a String as output. The function is responsible for building a skill sentence given a musical instrument. For example: `PIANO` -> `I play the PIANO`.
3. Define either a `@RestController` class or a `RouterFunction` bean to expose the composition of the two functions via a `/{instrument}` endpoint.
4. Run the application with `./gradlew bootRun` and test it works as expected. When you're done, stop the process with `Ctrl+C`.
5. Using the integration test support provided via the `@SpringBootTest` annotation and the `WebTestClient` bean, write auto tests to verify the behavior of the application when calling the `/{instrument}` endpoint.
