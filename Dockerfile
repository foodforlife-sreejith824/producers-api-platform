FROM adoptopenjdk:11-jre-hotspot
EXPOSE 9000
RUN mvn clean install
ARG JAR_FILE=target/producers-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]