# HA

### Description

HA it is a proof of concept for scalable and fail proof archtecture development. 
Firts and main goal it's to build scalable and fail proof archtecture.
Second goal is to help understand basics of [Spring Cloud](http://projects.spring.io/spring-cloud/) framework working with [Netflix OSS](https://netflix.github.io/).

### Architecture

HA is farm of services working in one or more networks. Each service is build with [Maven](https://maven.apache.org/) and works thanks of [Spring framework](https://spring.io/). For purpose of network simulation POC uses [docker contenerization platform](https://www.docker.com/) and [docker-compose tool](https://docs.docker.com/compose/).

HA includes following services:

- Gateway - input endpoint taking HTTP request for processing in system
- Dispatcher - pass HTTP request to processing in system
- Service Register - allow for service discovery - the brain of scalability

### Requirements

- openjdk version "1.8.0_121"
- Docker version 1.12.3
- docker-compose version 1.8.1

### Recomendations

- Linux

### Manual

* Build docker image in each service directory:
```
./mvnw clean package docker:build
``` 
* Run services farm in docker compose directory
``` 
docker-compose up
```
* Send load balanced request
```
curl --data "value=value" http://localhost:8080/send
or
curl --data "value=value" http://localhost:8081/send
```