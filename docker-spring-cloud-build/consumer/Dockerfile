FROM java:8

ARG SERVICE
ARG TAG

ADD ./target/${SERVICE}-${TAG}.jar /app.jar

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone