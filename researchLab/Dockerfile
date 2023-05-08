FROM adoptopenjdk/openjdk11:alpine-jre
COPY ./target/researchLab-0.0.1-SNAPSHOT.war researchLab-0.0.1-SNAPSHOT.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","researchLab-0.0.1-SNAPSHOT.war"]