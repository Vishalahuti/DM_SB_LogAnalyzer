FROM openjdk:17-jdk-slim
EXPOSE 8082
ADD target/DM_SB_LogAnalyzer.jar DM_SB_LogAnalyzer.jar
ENTRYPOINT ["java","-jar","/DM_SB_LogAnalyzer.jar"]
