CREATE TABLE athletes(
    TableId int NOT NULL AUTO_INCREMENT,
    Id int NOT NULL,
    Name varchar(255) NOT NULL,
    Sex varchar(50) NOT NULL,
    Age int NOT NULL,
    Height varchar(255),
    Weight varchar(255),
    Team varchar(120),
    NOC varchar(10),
    Games varchar(30),
    Year varchar(15),
    Season varchar(30),
    City varchar(30),
    Sport varchar(30),
    Event varchar(255),
    Medal varchar(10) DEFAULT 'None',
    PRIMARY KEY(TableId)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;