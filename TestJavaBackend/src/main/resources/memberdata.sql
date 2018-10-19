
IF not EXISTS member
create table member
(
 id integer not null,
username varchar(255) not null,
password varchar(255) not null,
address varchar(255),
phone varchar(20),
refsessioncode varchar(50),
membertype varchar(50),
salary double(10),
primary key(id)
);