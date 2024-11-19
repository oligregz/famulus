# Use Eclipse Temurin JDK 17 with Alpine Linux as base image for smaller size
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the .env file into the container
COPY .env /app/.env

# Copy the compiled JAR file into the container
COPY target/*.jar app.jar

# Expose port 8080 for the Spring Boot application
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]