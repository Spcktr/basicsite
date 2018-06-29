FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/basicsite.jar /basicsite/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/basicsite/app.jar"]
