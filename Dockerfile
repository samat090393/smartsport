FROM openjdk:8

WORKDIR /usr/app

COPY /target/demo-0.0.1-SNAPSHOT.jar ./

CMD ["java", "-jar", "-Dspring.profiles.active=remote", "demo-0.0.1-SNAPSHOT.jar"]