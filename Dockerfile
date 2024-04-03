FROM openjdk:17
EXPOSE 9090
ADD target/devopstest.jar devopstest.jar
ENTRYPOINT ["java","-jar","/devopstest.jar"]