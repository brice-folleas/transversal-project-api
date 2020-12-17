FROM openjdk:15-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=build/libs/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]