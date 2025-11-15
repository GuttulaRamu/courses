FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/courses.jar /app
EXPOSE 8080
CMD ["java","-jar","courses.jar"]