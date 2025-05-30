FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY build/libs/user-microservice-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]