USE javaee;

CREATE TABLE IF NOT EXISTS clinic (
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  name VARCHAR(255),
  description TEXT,
  address VARCHAR(150),
  contact VARCHAR(30)
);