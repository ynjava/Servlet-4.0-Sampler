FROM oracle/glassfish:nightly
COPY ./target/Servlet4Push.war /glassfish5/glassfish/domains/domain1/autodeploy
EXPOSE 8080:8080
EXPOSE 8181:8181
EXPOSE 4848:4848