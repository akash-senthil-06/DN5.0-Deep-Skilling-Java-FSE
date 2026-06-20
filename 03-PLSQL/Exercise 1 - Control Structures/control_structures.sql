
DECLARE
    CURSOR c_senior_loans IS
        SELECT l.LoanID, l.InterestRate, c.DOB
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID;
    
    v_age NUMBER;
BEGIN
    FOR rec IN c_senior_loans LOOP
        v_age := MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12;
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
            DBMS_OUTPUT.PUT_LINE('Applied 1% interest rate discount to Loan ID: ' || rec.LoanID);
        END IF;
    END LOOP;
    COMMIT;
END;
/

DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, Balance FROM Customers;
BEGIN
    FOR rec IN c_customers LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
            DBMS_OUTPUT.PUT_LINE('Promoted Customer ID ' || rec.CustomerID || ' to VIP status.');
        END IF;
    END LOOP;
    COMMIT;
END;
/

DECLARE
    CURSOR c_due_loans IS
        SELECT l.LoanID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- LOAN DUE REMINDERS ---');
    FOR rec IN c_due_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Hello ' || rec.Name || ', your Loan (ID: ' || rec.LoanID || ') is due on ' || TO_CHAR(rec.EndDate, 'YYYY-MM-DD') || '. Please arrange payment.');
    END LOOP;
END;
/
