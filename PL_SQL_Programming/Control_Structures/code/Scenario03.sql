BEGIN
    FOR rec IN (
        SELECT c.CUSTOMERNAME, l.DUEDATE
        FROM CUSTOMERS c
        JOIN LOANS l
        ON c.CUSTOMERID = l.CUSTOMERID
        WHERE l.DUEDATE BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: ' || rec.CUSTOMERNAME ||
                             ' - Loan Due Date: ' || rec.DUEDATE);
    END LOOP;
END;
/