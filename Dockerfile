FROM gradle:6.8.3-jdk8 AS build
RUN mkdir /api
WORKDIR /api
COPY src /api/src
COPY build.gradle /api/build.gradle
COPY settings.gradle /api/settings.gradle
RUN gradle build -x test

FROM openjdk:8u292-oracle
COPY --from=build /api/build/libs/*.jar api.jar
EXPOSE 8080
ENTRYPOINT [ "java" , "-jar" , "api.jar"]