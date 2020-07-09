# Alpine Linux with OpenJDK JRE
FROM openjdk:latest
COPY target/consuming-rest-0.0.1-SNAPSHOT.jar app.jar
# run application with this command line
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]