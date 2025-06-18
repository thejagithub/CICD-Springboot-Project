
FROM eclipse-temurin:17-jre-alpine

# Artifact path
ARG artifact=target/Spring-Boot-Application-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${artifact} app.jar


ENTRYPOINT ["java","-jar","app.jar"]