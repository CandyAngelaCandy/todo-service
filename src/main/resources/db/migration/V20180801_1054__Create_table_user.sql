 create table user(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) UNIQUE,
    password varchar(100)
 );

INSERT INTO user VALUES (null,'xiaohong','123');
INSERT INTO user VALUES (null,'xiaoliang','789');