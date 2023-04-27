# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim-buster

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file to the container
COPY ./capstone-employee-project-0.0.1-SNAPSHOT.jar /app/capstone-employee-project-0.0.1-SNAPSHOT.jar     

# Expose the port that the application will listen on
EXPOSE 8080

# Run the application when the container starts
CMD ["java", "-jar", "capstone-employee-project-0.0.1-SNAPSHOT.jar"]


