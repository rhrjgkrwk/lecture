
create table TelTable5(
	id number(5),
	name varchar2(20),
	tel varchar2(20),
	d date
);

INSERT INTO TelTable5
VALUES (1,'hong', '010-9962-6542', '20160201');

SELECT *
FROM TelTable5;

SELECT name, id
FROM TelTable5;

INSERT INTO TelTable5
VALUES (2,'maerong', '010-8222-6542', '20501001');

SELECT *
FROM TELTABLE5
WHERE name = 'hong';

UPDATE TELTABLE5
SET name = 'kim'
WHERE (name = 'hong' and id = '1');


create table sawon(
	id number(5),
	name varchar2(20),
	sal number(10),
	d date
);

INSERT INTO sawon
VALUES (1,'lee', 5000000, '20180205');
INSERT INTO sawon
VALUES (2,'kim', 3000000, '20180205');
INSERT INTO sawon
VALUES (3,'hong', 4000000, '20180205');
INSERT INTO sawon
VALUES (4,'choi', 6000000, '20180205');

SELECT *
FROM sawon;

UPDATE sawon
SET sal = sal*1.1;

UPDATE sawon
SET d = '20160202';

UPDATE sawon
SET d = '20180202';

DELETE FROM sawon
WHERE name = 'kim';

DELETE FROM sawon
WHERE sal < 5000000;

DESC sawon;

DROP TABLE sawon;

SELECT * 
FROM tab;

DELETE FROM sawon;

select * from employees;
select * from departments;















