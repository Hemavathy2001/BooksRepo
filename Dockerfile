FROM openjdk:11 
ADD target/springboot-mongo.jar springmongoapp.jar 
EXPOSE 8080 
ENTRYPOINT ["java","-jar","springmongoapp.jar"]
