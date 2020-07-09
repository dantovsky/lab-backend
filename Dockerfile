# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jdk-alpine
COPY target/lab-backend.war app.war
# run application with this command line
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=default", "/app.war"]
# CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]

EXPOSE 8080

FROM postgres:9.6