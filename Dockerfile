FROM openjdk:8
ADD target/keyvaultdemo.jar  keyvaultdemo.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","keyvaultdemo.jar"]
