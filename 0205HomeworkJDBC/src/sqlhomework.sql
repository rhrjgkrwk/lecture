CREATE TABLE Products(
	p_id number(5),
	p_name varchar2(20),
	p_date date,
	p_price number(10)
);

INSERT INTO Products
VALUES (10234, '��Ĭ��', '19580206', 1550000);
INSERT INTO Products
VALUES (10235, '��ǻŸ', '19120206', 2550000);
INSERT INTO Products
VALUES (10236, '�����', '19770206', 4550000);
INSERT INTO Products
VALUES (10237, '�����', '19980206', 2550000);
INSERT INTO Products
VALUES (10238, 'Ƽ����', '20120206', 550000);

SELECT *
FROM Products;

UPDATE Products
SET p_price = p_price*1.2;

SELECT *
FROM Products;

DELETE FROM Products
WHERE p_id = 10234;

SELECT *
FROM Products;

SELECT employee_id, first_name, last_name, hire_date, salary
FROM employees
WHERE hire_date > '20051231' and salary >= 5000;