# Lab 2: Foundations of Spring Cloud Function

## Learning goals

* Functional paradigm in Java enhanced by Spring Cloud Function
* Function compositon with transparent type conversion
* Testing functions in isolation

## Overview

1. Mark the `uppercase` and `sentence` functions as `@Beans`. They're now managed and enhanced by Spring Cloud Function.
2. Introduce two domain models as Java records: `record Instrument(String name){}` and `record Skill(String content){}`.
3. Change the `uppercase` function so that the input is of type `Instrument` and the output of type `String`.
4. Change the `sentence` function so that the input is of type `Mono<String>` and the output of type `Mono<Skill>` (reactive types).
5. Using the testing support in Spring Cloud Function provided by the FunctionalSpringBootTest annotation and the FunctionCatalog bean, write auto tests to verify the behavior of the composition of the `uppercase` and `sentence` functions (cloud function definition: `uppercase|sentence`).
