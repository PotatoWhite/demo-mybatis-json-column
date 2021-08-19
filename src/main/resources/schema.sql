DROP TABLE IF EXISTS Users;

CREATE TABLE users
(
    id IDENTITY PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    email   VARCHAR(255) NOT NULL,
    contact VARCHAR(2000)
);