FROM openjdk:8
ADD build/libs/WordCounter-0.0.1-SNAPSHOT.jar WordCounter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","WordCounter-0.0.1-SNAPSHOT.jar"]
