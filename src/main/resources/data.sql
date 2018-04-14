create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birthdate timestamp,
primary key(id)
);

insert into person(
id,name,location,birthdate
) values (1,'ashish','Pune',sysdate());

insert into person(
id,name,location,birthdate
) values (2,'aman','Delhi',sysdate());

insert into person(
id,name,location,birthdate
) values (3,'amit','Hyderabad',sysdate());

select * from person;
