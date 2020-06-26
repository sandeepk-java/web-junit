DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');
  

CREATE TABLE login (
  username VARCHAR(250) PRIMARY KEY,
  password VARCHAR(250) NOT NULL,
  status VARCHAR(250) DEFAULT NULL
);

CREATE TABLE registration (
  username VARCHAR(250) PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250),
  designation VARCHAR(250) NOT NULL,
  status VARCHAR(250) DEFAULT NULL
);