# Olympic Athletes


Web based application with the CRUD functionality. Database consist of data on all Olympic athletes from the 1896 Olympics through Rio 2016. 


# Features That Are Used!

  - Java EE
  - Spring Boot
  - Spring JPA
  - MySQL
  - Flyway
  - Maven
  - Thymeleaf

In future more functionality and integration with Thymeleaf template engine will be added.



### Database

Database was taken from the kaggle datasets

* [Database] - Olympic History Database


### Installation

Application requires [Java](https://java.com/en/download/help/download_options.xml) and [MySQL](https://dev.mysql.com/downloads/mysql/) installed on your computer.

Create MySQL Database
```SQL
    CREATE DATABASE olympic;
```

Then download the repository

```sh
$ git clone https://github.com/Stirbul/SpringBootOlympicAthletes.git
```
In the application.properties file under the ###DATASOURCE you have to write your username and password instead of * ... *
```properties
##DATASOURCE
spring.datasource.url=jdbc:mysql://localhost:3306/olympic?useSSL=false
spring.datasource.username=*root*
spring.datasource.password=*password*

##Hibernate Properties
#Selecting Dialect for the database
spring.jpa.properties.hibernate.Dialect=org.hibernate.dialect.MySQL5InnoDBDialect
#Naming strategy
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

#Validate for flyway
spring.jpa.hibernate.ddl-auto=validate
```
Also in the file V2__copy.sql you have to specify the exact path to athlete_eventsV2.csv file in your filesystem
```SQL
LOAD DATA LOCAL INFILE '/home/alexei/Documents/Codes/Olympic_history/Olympic\ history/athlete_eventsV2.csv'
INTO TABLE athletes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
```
Open folder with your favorite IDE and your are set to go


### Todos

 - Add Thymeleaf engine
 - Write Tests

License
----

[MIT](https://github.com/Stirbul/SpringBootOlympicAthletes/blob/master/LICENSE)


[//]: # 
   [Database]: <https://www.kaggle.com/heesoo37/120-years-of-olympic-history-athletes-and-results>
