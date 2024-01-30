# Use the official OpenJDK base image
FROM openjdk:21-jre-slim

# Set the working directory
WORKDIR /App

# Copy the JAR file into the container at /app
COPY target/JavaBackendApplication-1.0-SNAPSHOT.jar /app.jar

# Expose the port that your Spring Boot application runs on
EXPOSE 8081

# Define the command to run application
CMD ["java", "-jar", "app.jar"]

