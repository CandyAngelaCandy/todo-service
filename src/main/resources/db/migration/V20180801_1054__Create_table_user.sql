 create table user(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) UNIQUE,
    password varchar(100)
 );