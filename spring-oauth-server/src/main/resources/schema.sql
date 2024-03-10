CREATE TABLE role (
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL
  );

CREATE TABLE app_user (
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username VARCHAR(64) NOT NULL,
  password VARCHAR(64) NOT NULL,
  role_id BIGINT NOT NULL,
  FOREIGN KEY (role_id) REFERENCES role(id)
  );


INSERT INTO role(name) VALUES ('user');
INSERT INTO role(name) VALUES ('admin');

INSERT INTO app_user(username, password, role_id) VALUES ('user', 'user', 1);
INSERT INTO app_user(username, password, role_id) VALUES ('admin', 'admin', 2);