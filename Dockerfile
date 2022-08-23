FROM openjdk:11 
ADD target/springboot-mongo.jar springmongoapp.jar 
ENTRYPOINT ["java","-jar","springmongoapp.jar"] 