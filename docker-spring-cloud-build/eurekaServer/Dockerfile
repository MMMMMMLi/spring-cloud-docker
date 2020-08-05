FROM java:8

ARG SERVICE
ARG TAG

# ENV JARNAME=${SERVICE}-${TAG}.jar

ADD ./target/${SERVICE}-${TAG}.jar /app.jar

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

# ENTRYPOINT ["sh","-c","java -DJAR_NAME=$JARNAME -jar /app.jar "]