FROM openjdk:8

COPY ./build/libs/*.jar /usr/src/app/

WORKDIR /usr/src/app

CMD java -jar -Dspring.profiles.active=prod /usr/src/app/*.jar