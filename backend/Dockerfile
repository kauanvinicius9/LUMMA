FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY targert/*.jar app.jar

EXPOSE 5432

ENTRYPOINT ["java","-jar","app.jar"]