CREATE TABLE student (
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  mark DOUBLE NOT NULL
  );

INSERT INTO student(name, mark) VALUES ('Harry', 4.5);
INSERT INTO student(name, mark) VALUES ('Nik', 2.5);
INSERT INTO student(name, mark) VALUES ('Olga', 4.7);
INSERT INTO student(name, mark) VALUES ('Oleg', 4.1);
INSERT INTO student(name, mark) VALUES ('Jim', 4.2);