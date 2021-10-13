FROM openjdk:16-jdk-alpine
ADD target/cryptoboard-coin-service-0.0.1-SNAPSHOT.jar cryptoboard-coin-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "cryptoboard-coin-service.jar"]