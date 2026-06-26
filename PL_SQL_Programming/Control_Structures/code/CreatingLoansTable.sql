
DROP TABLE Loans CASCADE CONSTRAINTS;


CREATE TABLE Loans (
    LoanID        NUMBER          PRIMARY KEY,
    CustomerID    NUMBER          NOT NULL,
    LoanAmount    NUMBER(15, 2)   NOT NULL,
    InterestRate  NUMBER(5, 2)    NOT NULL,
    DueDate       DATE            NOT NULL,
    CONSTRAINT fk_loans_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

SELECT table_name, column_name, data_type, nullable
FROM   user_tab_columns
WHERE  table_name = 'LOANS'
ORDER BY column_id;