FROM alpine
RUN apk update && apk add --no-interactive --no-cache git maven
WORKDIR /APP
RUN git clone https://github.com/dockersamples/spring-petclinic-docker.git
WORKDIR /APP/spring-petclinic-docker
RUN ./mvnw package
CMD ["java","-jar","/APP/spring-petclinic-docker/target/spring-petclinic-2.7.0-SNAPSHOT.jar"]
