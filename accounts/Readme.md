docker run -p 3307:3306 --name some-mysql -e MYSQL_DATABASE=accountsdb  -e MYSQL_ROOT_PASSWORD=root -d mysql

# latest RabbitMQ 4.0.x
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4.0-management
