
DROP TABLE Customers CASCADE CONSTRAINTS;

CREATE TABLE Customers (
    CustomerID    NUMBER          PRIMARY KEY,
    CustomerName  VARCHAR2(100)   NOT NULL,
    DateOfBirth   DATE            NOT NULL,
    Balance       NUMBER(15, 2)   DEFAULT 0,
    IsVIP         VARCHAR2(10)    DEFAULT 'FALSE'
);
