
FROM registry.access.redhat.com/ubi8/openjdk-8

ENV APP_ROOT=/opt/app-root REL_ROOT=code-with-quarkus

RUN mkdir ${APP_ROOT}

COPY --chown=185:root pom.xml ${APP_ROOT}/${REL_ROOT}

COPY --chown=185:root . ${APP_ROOT}/${REL_ROOT}

RUN ls

WORKDIR ${APP_ROOT}/${REL_ROOT}

#RUN mv ../pom.xml /opt/app-root/code-with-quarkus

#RUN chown 185:root ../pom.xml
#RUN chown 185:root ${APP_ROOT}/${REL_ROOT}/run-quarkus.sh && \
#    chmod g+rx ${APP_ROOT}/${REL_ROOT}/run-quarkus.sh

RUN mvn clean package

CMD ${APP_ROOT}/${REL_ROOT}/run-quarkus.sh