# Spring Boot Encrypt Key Demo

## Requirements
- Install Spring CLI 2.* and Spring Cloud Plug-in:
https://cloud.spring.io/spring-cloud-cli/reference/html/

# Demo
- Take a look at the `EncryptionLogService` and `application.properties`
- Start the app and check what happens
- Encrypt a secret with Spring Cloud CLI and insert it to the databaseSecret attribute in `application.properties`
```
spring encrypt someSecretValue -key someKey
```
- Start the app and check what happens
- Add Spring Cloud Context and Spring Security RSA as a dependency in `build.gradle`
```
implementation 'org.springframework.cloud:spring-cloud-context:3.1.5'
implementation 'org.springframework.security:spring-security-rsa:1.0.11.RELEASE'
```
- Start the app and check what happens
- Set the key as an environment variable named `encrypt.key` and restart the app
