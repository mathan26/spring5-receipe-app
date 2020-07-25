
## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases

CREATE DATABASE recipe_app_dev;
CREATE DATABASE recipe_app_prod;

#Create database service accounts

CREATE USER 'dev_user'@'localhost' identified BY 'mathan';
CREATE USER 'prod_user'@'localhost' identified BY 'mathan';

#Database grants

GRANT SELECT ON recipe_app_dev.* to 'dev_user'@'localhost';
GRANT INSERT ON recipe_app_dev.* to 'dev_user'@'localhost';
GRANT DELETE ON recipe_app_dev.* to 'dev_user'@'localhost';
GRANT UPDATE ON recipe_app_dev.* to 'dev_user'@'localhost';
GRANT SELECT ON recipe_app_prod.* to 'prod_user'@'localhost';
GRANT INSERT ON recipe_app_prod.* to 'prod_user'@'localhost';
GRANT DELETE ON recipe_app_prod.* to 'prod_user'@'localhost';
GRANT UPDATE ON recipe_app_prod.* to 'prod_user'@'localhost';