# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="garciaong85@gmail.com"

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Add the application's jar to the container
ADD target/dockerdata.jar /dockerdata.jar

RUN sh -c 'touch dockerdata.jar'

RUN mkdir log

# Run the jar file
ENTRYPOINT ["java","-jar","/dockerdata.jar"]