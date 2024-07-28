this project is to run spring-pet-clinic app with five container based on image built with multi stages docker file 
with nginx container as a load balancer that balance traffic between these five images and two containers for database based on mysql image and
postgres images both connected to pet app and each one configured in seperated docker compose file (docker-compose.dev.yml:mysql & docker-compose.prod.yml:postgres)

## steps to run services  
## to run pet-app service with mysql basedimage :
docker-compose -f docker-compose.yml -f docker-compose.dev.yml up --build -d

## to down all services :
docker-compose -f docker-compose.yml -f docker-compose.dev.yml down

## to run pet-app service with postgres based image :
docker-compose -f docker-compose.yml -f docker-compose.prod.yml up --build -d

## to down all services :
docker-compose -f docker-compose.yml -f docker-compose.prod.yml down
