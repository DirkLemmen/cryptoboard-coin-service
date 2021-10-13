FROM openjdk:11-jdk-alpine
ADD target/cryptoboard-coin-service-0.0.1-SNAPSHOT.jar cryptoboard-coin-service.jar
ENTRYPOINT ["java", "-jar", "cryptoboard-coin-service.jar"]