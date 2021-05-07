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
curl http://localhost:8080/supply
```

The suppy function in the HelloWorldController class, created this endpoint. 
The spring-cloud-starter-function-web dependency provide necessary the dependencies to the project to run function in local environment