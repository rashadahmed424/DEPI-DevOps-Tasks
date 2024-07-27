FROM alpine AS build 
RUN apk update && apk add --no-interactive --no-cache git maven
WORKDIR /APP
RUN git clone https://github.com/dockersamples/spring-petclinic-docker.git
WORKDIR /APP/spring-petclinic-docker
RUN ./mvnw package

FROM alpine AS dev
RUN apk add --no-interactive --no-cache openjdk11
COPY --from=build /APP/spring-petclinic-docker/target/spring-petclinic-2.7.0-SNAPSHOT.jar /spring-petclinic.jar
EXPOSE 8080
CMD ["java", "-jar", "/spring-petclinic.jar"]
