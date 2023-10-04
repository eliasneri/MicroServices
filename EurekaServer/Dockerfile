FROM ghcr.io/graalvm/jdk-community:17
VOLUME /tmp
EXPOSE 8761
ADD ./target/EurekaServer-0.0.1-SNAPSHOT.jar hr-eureka-server.jar
ENTRYPOINT ["java","-jar","hr-eureka-server.jar"]