FROM openjdk:17
COPY ./target/springboot-proj4-0.0.1-SNAPSHOT.jar .	
CMD ["java","-jar","springboot-proj4-0.0.1-SNAPSHOT.jar"]