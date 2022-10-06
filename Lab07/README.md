# Lab 7: Spring Cloud Data Flow

## Learning goals

* Understanding data flows with Spring Cloud Data Flow
* Basic usage of Spring Cloud Data Flow to compose functions into data flows.

## Overview

1. Ensure your Docker Engine is up and running.
2. Install Spring Cloud Data Flow from the provided `docker-compose.yml` file (command: `docker-compose up -d`).
3. Access the Spring Cloud Data Flow GUI at http://localhost:9393/dashboard and explore the streaming features as described [here](https://dataflow.spring.io/docs/stream-developer-guides/getting-started/stream/). Specifically, try the flow `http|log`.

## Tips

You can install Spring Cloud Data Flow on Kubernetes with Helm.

```shell
helm install dataflow bitnami/spring-cloud-dataflow --set server.service.type=LoadBalancer
```
