# Use lightweight OpenJDK 17 base image
FROM openjdk:21-jdk-slim

# Create a temporary directory (used by Spring Boot for file uploads, etc.)
VOLUME /tmp

# Copy your built JAR file into the image
COPY target/web-0.0.1-SNAPSHOT.jar web-app.jar

# Command to run when container starts
ENTRYPOINT ["java","-jar","/web-app.jar"]
