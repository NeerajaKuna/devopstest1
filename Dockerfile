FROM openjdk:17
EXPOSE 8080
ADD target/devopstest.jar devopstest.jar
ENTRYPOINT ["java","-jar","/devopstest.jar"]