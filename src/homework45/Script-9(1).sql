create table university(
id integer primary key,
name varchar(50)
);

insert into university 
values (1,'AUCA');


create table faculty(
id integer primary key,
name varchar(50),
university_id integer references university(id)
);


create table groupp(
id integer primary key,
faculty_id integer references faculty(id),
code varchar(50)
);

insert into groupp values 
(1, 2, '12345'),
(2, 1, '54321'),
(3, 3, '76543');


create table student(
id integer primary key,
full_name varchar(100),
group_id integer references groupp (id),
birth_date varchar(50)
);


insert into student values
(1, 'A', 1, '11.11.11'),
(2, 'B', 2, '02.02.02'),
(3, 'C', 3, '01.01.01');


create table subject(
id integer primary key,
name varchar(50)
);

insert into subject values
(1, 'Maths'),
(2, 'English language');


create table marks(
student_id integer references student(id),
mark integer,
subject_id integer references subject(id)
);


insert into marks values 
(1, 5, 1),
(2, 4, 1),
(1, 3, 2),
(3, 5, 2);


insert into faculty values
(1, 'Programming', 1),
(2,'Ecology', 1),
(3, 'Business management', 1);


select avg(mark) from marks m 
join student s on s.id = m.student_id 
where s.id = 1;


select s.full_name ,g.code ,f."name" ,u."name" 
from student s 
join groupp g on g.id = s.group_id 
join faculty f on f.id = g.faculty_id 
join university u on u.id = f.university_id 
where s.id = 1;


