docker run -p 3307:3306 --name some-mysql -e MYSQL_DATABASE=accountsdb  -e MYSQL_ROOT_PASSWORD=root -d mysql

# latest RabbitMQ 4.0.x
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4.0-management

#cards below, accounts above 
 docker run -p 3308:3306 --name some-cards-mysql -e MYSQL_DATABASE=cardsdb  -e MYSQL_ROOT_PASSWORD=root -d mysql


docker run -p 3309:3306 --name some-loans-mysql -e MYSQL_DATABASE=loansdb  -e MYSQL_ROOT_PASSWORD=root -d mysql


docker run -p 6379:6379 --name some-redis -d redis


docker run -d -p 7080:8080 -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:26.1.4 start-dev













