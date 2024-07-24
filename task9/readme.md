this project is to use multi docker-compose files to containerize spring-pet-clinic app.
the main docker-compose file is to run pet-app container from image built with multi stages Dockerfiel, volumes and networks .
docker-compose.dev.yml file is to create a container to store mysql data base in mysql based image. 
docker-compose.prod.yml file is to create a container to store postgresql database in postgres based image.

### steps to run services 

## to run pet-app service with mysql basedimage :
docker-compose -f docker-compose.yml -f docker-compose.dev.yml up --build -d 

## to down all services :
docker-compose -f docker-compose.yml -f docker-compose.dev.yml down

## to run pet-app service with postgres based image :
docker-compose -f docker-compose.yml -f docker-compose.prod.yml up --build -d 

## to down all services :
docker-compose -f docker-compose.yml -f docker-compose.prod.yml down
