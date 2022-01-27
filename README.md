
Learning DOCKER using the example of a SPRING-BOOT application

### General information 

Before all:
- Change ip address in application.yaml to your own 
- Build project 


**BASIC COMMANDS**

```
docker build -t <create image name> . - build image
docker images  -   view all images
docker rmi <имя-образа> - delete image
docker rmi -f <имя-образа> - delete image even if containers are running
docker ps - view all running containers
docker ps -a - view all containers including stopped
docker rm $(docker ps -aq) - delete all containers
docker rm -f $(docker ps -aq) - delete all containers even if they’re running
docker run <image name> - run container
-d - detached mode
-p <port>:<port> - mapping ports
– rm - delete container after stop
– name <container name> - give name to container
-v <project directory>:<container’s directory> - create volume
docker stop - stop container
docker-compose build - build images
docker-compose up - run containers
```