FROM openjdk:11-jre-slim
EXPOSE 85:85
RUN apt install git
WORKDIR /APP
RUN git clone https://github.com/dockersamples/spring-petclinic-docker.git
WORKDIR /APP/spring-petclinic-docker.git
RUN ./mvnw package
CMD [ "java" ,"-jar" ,"/APP/spring-petclinic-docker/target/spring-petclinic-2.7.0-SNAPSHOT.jar"]
