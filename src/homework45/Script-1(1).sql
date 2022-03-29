CREATE TABLE vid_sporta (
id integer  NOT NULL,
vid_sporta varchar(50) not NULL
);

insert into vid_sporta values
(1, 'Football'),
(2, 'Volleyball'),
(3, 'Basketball');


create table trainers(
id integer primary key,
full_name varchar (100),
vid_sporta_id integer references vid_sporta(id) not null,
phone_number varchar(50),
inn varchar(14) not null unique
);


insert into trainers values
(1, 'A', 1, '0500123456', '1234567'),
(2, 'B', 2, '0500654321', '123456'),
(3, 'C', 3, '0500987654', '12345678');



create table visitors2 (
id integer primary key,
full_name varchar (50),
birth_date varchar(20),
gender varchar(10)
);

insert into visitors2 values 
(3, 'Key', '02.02.02', 'woman'),
(2, 'Lisa', '03.03.03', 'woman');


create table visits(
visitors_id integer references visitors2(id),
visit_time timestamp  not null default now(),
trainers_id integer references trainers(id) 
);


insert into visits values 
(1, '2019-02-01 06:00:00', 1),
(2, '2020-02-01 06:00:00', 2);


SELECT * FROM visits  ORDER BY visit_time desc;

select v2.full_name as visits_name, t.fullname as trainer_name ,v.visit_time  from visits v 
join visitors2 v2 on v2.id = v.visitors_id  
join trainers t on t.id = v.trainers_id 
where visitors_id =1;


