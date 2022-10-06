# Lab 4: Spring Cloud Function and Knative Serving

## Learning goals

* Deploying functions in a cloud-agnostic way with Knative Serving
* Packaging functions for deployment on Kubernetes

## Overview

1. Ensure your Docker Engine is up and running.
2. Check the configuration for the Spring Boot built-in support for Cloud Native Buildpacks in the `build.gradle` file. Update the image name to use your own container registry.
3. Containerize the application with Cloud Native Buildpacks (command: `./gradlew bootBuildImage`).
4. Push the newly create image to your container registry (command: `docker push <image_name>`).
5. Start a local Kubernetes cluster with Knative installed (see description below).
6. Using the Knative CLI, deploy the application on Kubernetes (see description below).

## Tips

### Installing kind

You can run Kubernetes clusters on your local machines with kind. Follow the [installation instructions](https://kind.sigs.k8s.io/docs/user/quick-start/#installation) for your operating system.

### Setting up Knative

The Knative project provides a convenient quickstart setup to run Knative on your local machine with minikube or kind. Follow the [installation instructions](https://knative.dev/docs/getting-started/quickstart-install/) instructions to do so with kind, including installing the Knative CLI.

### Deploying applications on Knative

Using the Knative CLI, you can deploy an application as follows.

```shell
kn service create web-function <image_name>
```
