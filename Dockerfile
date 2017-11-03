FROM tomcat
COPY target/docker-javaweb.war ${CATALINA_HOME}/webapps
