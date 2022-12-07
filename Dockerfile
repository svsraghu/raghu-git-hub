FROM openjdk
COPY target/*.jar /
ENTRYPOINT ["java","-jar", "/docker-raghu.jar"]