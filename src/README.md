# Rest API - marketplace

This is a Demo rest API using Spring Boot, PostgreSQL


# Requirements

* JAVA 8
* Maven
* Swagger for test Endpoints
* Spring Security
* MyBatis or Hibernate (ORM)


## Steps to Setup

**1. Clone the application**
```
https://github.com/devLeon93/marketplace-restAPI.git
```

## **Build and run the app using maven**
```
mvn package
java -jar target/marketplace-0.0.1-SNAPSHOT.jar
```

## Вatabase configuration

Enter following at the command line:

**psql -U postgres**

Enter your password from DB Server PostgreSQL:

**Password for user postgres:** ******************

**postgres=#  create database marketplace_db;**

**CREATE DATABASE**

Create user and password for db:

**postgres=# create user xxxxx  with encrypted password '*******';**

**CREATE ROLE**

Grant privileges:

**postgres=# grant all privileges on database marketplace_db to testuser;**

**GRANT**

After that you will need to connect the database in the IDE IntellijIdea itself or separately in another editor, for example: Data Grip
In the **resources directory** you are find sql file  **script.sql** for help run script


##   Explore Rest APIs

**These are all Endpoints that I have been able to implement :**

## product Endpoints

**The app will start running at [http://localhost:8085](http://localhost:8085/).**

**GET :    localhost:8085/marketplace/listProducts**

**GET :    localhost:8085/marketplace/viewProduct/{product_id}**

**GET : localhost:8085/product/{pageNo}/{pageSize}**

**POST : localhost:8085/marketplace/createdProduct**

**PUT :   localhost:8085/marketplace/editProduct/{product_id}**

**DELETE : localhost:8085/deleteProductById/{product_id}**

## User Endpoints

**GET :  localhost:8085/v1/users**
**GET :  localhost:8085/v1/showUserInfo**
**POST :  localhost:8085/v1/registerUser**

**All Endpoints can be tested using Docs API - Swagger**

** To test how it works you can follow this link, but before you will need to authenticate
http://localhost:8085/swagger-ui/index.html 
**

```
login - leo93
password - pass93
```

**This login and password are taken from the users table, which contains the users**
