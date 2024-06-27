#RUN apt update && apt install openjdk-17-jdk

#FROM bellsoft/liberica-openjdk-alpine:17
FROM openjdk:17-jdk-slim

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 18080

ENTRYPOINT ["java","-jar","app.jar"]
