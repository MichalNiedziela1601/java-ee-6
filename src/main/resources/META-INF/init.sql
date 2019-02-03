CREATE SCHEMA IF NOT EXISTS javaee AUTHORIZATION sunday;

CREATE TABLE javaee.clinic (
  id SERIAL PRIMARY KEY NOT NULL,
  name VARCHAR(255),
  description TEXT,
  address VARCHAR(150),
  contact VARCHAR(30)
);
