#FROM eclipse-temurin:17-jdk
#WORKDIR /app
#COPY target/courses.jar app/courses.jar
#EXPOSE 8080
#CMD ["java","-jar","app/courses.jar"]

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
