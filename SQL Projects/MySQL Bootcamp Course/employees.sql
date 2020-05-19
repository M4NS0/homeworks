CREATE TABLE employees (
id INT NOT NULL auto_increment,
first_name VARCHAR(255) NOT NULL,
middle_name VARCHAR(255),
last_name VARCHAR(255) NOT NULL,
age INTEGER NOT NULL,
current_status VARCHAR(100) NOT NULL DEFAULT 'employed',
PRIMARY KEY (id));

INSERT INTO employees (first_name,last_name,age) VALUES ('Bruno', 'Manso', 39);