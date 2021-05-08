# serverless-functions-lab

## serverless-node

* how to use

```bash
$ curl --location --request POST 'http://localhost:3000/local/checkout' \
--header 'Content-Type: application/json' \
--data-raw '{
    "message": "hello world"
}'
```

## springServerlessFunctionLab

* how to use

```bash
$ mvn clean install && java -jar target/springServerlessFunctionLab-0.0.1-SNAPSHOT.jar 
```

In other terminal

```bash
$ curl http://localhost:8080/supply
$ curl -H "Content-Type: text/plain" http://localhost:8080/consume -d Guest
$ curl -H "Content-Type: text/plain" http://localhost:8080/function -d Guest
```

The suppy function in the HelloWorldController class, created this endpoint. 
The spring-cloud-starter-function-web dependency provide necessary the dependencies to the project to run function in local environment
* Reference doc: https://docs.spring.io/spring-cloud-function/docs/3.1.1/reference/html/spring-cloud-function.html
