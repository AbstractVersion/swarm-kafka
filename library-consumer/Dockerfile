FROM openjdk:11-jre
MAINTAINER GEORGIOS FIOTAKIS <GEORGIOS.FIOTAKIS@AKKA.EU>

VOLUME /tmp

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app



ENTRYPOINT ["java","-cp","app:app/lib/*","-Dspring.profiles.active=docker","com.kafka.template.LibraryConsulerApplication"]

