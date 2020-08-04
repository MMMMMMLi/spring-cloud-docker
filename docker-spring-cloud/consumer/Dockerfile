FROM centos
VOLUME /tmp
ADD consumer-v1.jar app.jar
RUN yum update -y &&  yum install -y nc  java-1.8.0-openjdk.x86_64
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
