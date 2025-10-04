FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
EXPOSE 9090
CMD ["java", "-jar", "target/ServiceWebApplication-0.0.1-SNAPSHOT.jar"]
