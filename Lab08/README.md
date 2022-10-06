# Lab 8: Spring Cloud Function, CloudEvents and Knative Eventing

## Learning goals

* Understanding CloudEvents
* Consuming functions via CloudEvents
* Using Knative Eventing

## Overview

1. Make sure you followed the Knative Quickstarts guide in Lab04.
2. Explore the project configuration and how Spring Native has been set up.
3. Run the application and consume its functions using the CloudEvents format (see description below).
4. Start the local Knative quickstart environment and explore the CloudEvents usage in Knative Eventing following the instructions [here](https://knative.dev/docs/getting-started/first-source/).

## Tips

You can send an HTTP request using the CloudEvents format as follows:

```shell
http :8080 name=piano \
    ce-specversion:1.0 \
    ce-type:music \
    ce-id:394
```
