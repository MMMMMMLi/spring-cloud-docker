FROM centos
VOLUME /tmp
ADD producer-v1.jar app.jar
RUN yum update -y &&  yum install -y nc  java-1.8.0-openjdk*
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
