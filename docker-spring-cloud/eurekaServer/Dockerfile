FROM maven:3.5-jdk-8
VOLUME /tmp
ADD eureka-v1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
