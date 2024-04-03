FROM openjdk:17
EXPOSE 7000
ADD target/devopstest.jar devopstest.jar
ENTRYPOINT ["java","-jar","/devopstest.jar"]