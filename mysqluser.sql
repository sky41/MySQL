show databases ;
create database mysqluser;
use mysqluser;
create table user(
                     id int(20) not null primary key ,
                     name varchar(200) not null ,
                     passwd varchar(200) not null
) DEFAULT CHARSET=utf8;

show tables ;
insert into user(id, name, passwd)
VALUES
    ('1','admin','123456'),
    ('2','root','123456'),
    ('3','rs','root');
select * from user;

select * from mysqluser.user;
select * from mysqluser.user where id = 1;
insert into user(id, name, passwd)
VALUES
    ('1','admin','123456');


