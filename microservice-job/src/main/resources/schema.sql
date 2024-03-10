CREATE TABLE job (
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  position_description VARCHAR(45) NOT NULL
  );

INSERT INTO job(name, position_description) VALUES ('Ibm', 'intern');
INSERT INTO job(name, position_description) VALUES ('Microsoft', 'junior');
INSERT INTO job(name, position_description) VALUES ('SoftProgramming', '');
INSERT INTO job(name, position_description) VALUES ('Fox', '');
INSERT INTO job(name, position_description) VALUES ('GoGoIt', '');