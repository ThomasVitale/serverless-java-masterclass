# Lab 5: Spring Native and GraalVM

## Learning goals

* Understanding native executables with GraalVM
* Building native images with Spring Boot 3
* Testing native applications
* Packaging native applications

## Overview

1. Explore the application business logic and Gradle configuration.
2. Install GraalVM as described in the next section.
3. Compile the Spring Boot 3 application with GraalVM (command: `./gradlew nativeCompile`) .
4. Run the native executable and test the application works as intended (command: `/build/nativeCompile/05-demo`).
5. Test the application as a native executable (command: `./gradlew nativeTest`).
6. Containerize the application as a native executable (command: `./gradlew bootBuildImage`).
7. Run the container on Docker and test the application works as intended.

## Tips

You can install GraalVM using [sdkman](https://sdkman.io).

```shell
sdk install java 22.3.r17-grl
```

Configure your current terminal shell to use GraalVM as the Java distribution.

```shell
sdk use java 22.3.r17-grl
```

Next, install the native-image component from GraalVM.

```shell
gu install native-image
```