for build docker image
./mvnw clean package docker:build
for send load balanced request
curl --data "value=value" http://localhost:8080/send