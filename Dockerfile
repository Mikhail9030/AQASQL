FROM openjdk:11
WORKDIR /opt/app
COPY . .
CMD ["java", "-jar", "app-deadline.jar"]
EXPOSE 9999