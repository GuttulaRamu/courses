FROM openjdk:17
WORKDIR /app
COPY ./target/courses.jar /app
EXPOSE 8080
CMD ["java","-jar","courses.jar"]