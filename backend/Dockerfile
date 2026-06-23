FROM gradle:8-jdk21 AS build
WORKDIR /app

COPY gradlew .
COPY gradle/wrapper gradle/wrapper
COPY build.gradle.kts settings.gradle.kts ./
COPY src ./src

RUN gradle build -x test

FROM openjdk:21-ea-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
