FROM openjdk:11
EXPOSE 8085
COPY build/libs/docker-project-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "docker-project-0.0.1-SNAPSHOT.jar"]