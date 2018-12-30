
USE javaee;
CREATE TABLE clinic (
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  name VARCHAR(255),
  description TEXT,
  address VARCHAR(150),
  contact VARCHAR(30)
);