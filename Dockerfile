FROM openjdk:8
ADD target/onlinesweetshop.jar onlinesweetshop.jar
ENTRYPOINT ["java", "-jar","onlinesweetshop.jar"]
EXPOSE 8080