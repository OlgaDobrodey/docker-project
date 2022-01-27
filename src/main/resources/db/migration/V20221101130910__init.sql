CREATE SCHEMA IF NOT EXISTS employees_database;

CREATE TABLE IF NOT EXISTS employees
(
    id                       SERIAL  NOT NULL,
    name                     VARCHAR(30)           NOT NULL,
    surname                  VARCHAR(30)           NOT NULL,
    department               VARCHAR(30)           NOT NULL,
    salary                   INTEGER               NOT NULL,
    PRIMARY KEY (id)
);
























