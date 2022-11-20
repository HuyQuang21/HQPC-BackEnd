FROM openjdk:17-jdk-slim
COPY ./target/HQPCBackEnd-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "HQPCBackEnd-0.0.1-SNAPSHOT.war"]