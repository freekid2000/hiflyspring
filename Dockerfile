FROM openjdk:8u201-jdk-alpine3.9

MAINTAINER Robinson <freekid@tom.com>
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

EXPOSE 8080
ADD target/hiflyspring-0.0.1-SNAPSHOT.jar demo.jar

ENTRYPOINT ["java","-Dfile.encoding=UTF8","-Duser.timezone=GMT+08","-jar","demo.jar"]