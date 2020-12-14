# spring-cloud

This project has a concept of discovery server (discovery-server) and client. All the services first register 
themself at discovery server. Config-server is a server that will provide the configuration for all the server.
Config-client-app is a client that will register itself with discovery-server. Will first load the configuration from 
config-server. 

Please fork the https://github.com/ThakurPriyanka/config-repository repository. Add the url of your forked 
config repository repo in application.properties of config-server as mentioned below. 
spring.cloud.config.server.git.uri="your repo url"

Please execute the all the application as mentioned below.
1) Go to discovery-server folder in cmd and execute the command mvn spring-boot:run.
2) Go to config-server folder in cmd and execute the command mvn spring-boot:run.
3) Go to config-client-app folder in cmd and execute the command mvn spring-boot:run.
