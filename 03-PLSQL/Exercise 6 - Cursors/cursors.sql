
DECLARE
    CURSOR c_monthly_statements IS
        SELECT c.Name, t.AccountID, t.TransactionDate, t.Amount, t.TransactionType
        FROM Transactions t
        JOIN Accounts a ON t.AccountID = a.AccountID
        JOIN Customers c ON a.CustomerID = c.CustomerID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- MONTHLY STATEMENTS FOR CURRENT MONTH ---');
    FOR rec IN c_monthly_statements LOOP
        DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.Name || ' | Account: ' || rec.AccountID || 
                             ' | Date: ' || TO_CHAR(rec.TransactionDate, 'YYYY-MM-DD') || 
                             ' | Type: ' || rec.TransactionType || ' | Amount: $' || rec.Amount);
    END LOOP;
END;
/

DECLARE
    CURSOR c_accounts IS
        SELECT AccountID, Balance FROM Accounts FOR UPDATE;
    v_Fee CONSTANT NUMBER := 50.00;
BEGIN
    FOR rec IN c_accounts LOOP
        UPDATE Accounts
        SET Balance = Balance - v_Fee, LastModified = SYSDATE
        WHERE CURRENT OF c_accounts;
        DBMS_OUTPUT.PUT_LINE('Deducted $' || v_Fee || ' annual fee from Account ID: ' || rec.AccountID);
    END LOOP;
    COMMIT;
END;
/

DECLARE
    CURSOR c_loans IS
        SELECT LoanID, InterestRate FROM Loans FOR UPDATE;
    v_RateIncrease CONSTANT NUMBER := 0.5;
BEGIN
    FOR rec IN c_loans LOOP
        UPDATE Loans
        SET InterestRate = InterestRate + v_RateIncrease
        WHERE CURRENT OF c_loans;
        DBMS_OUTPUT.PUT_LINE('Updated interest rate for Loan ID: ' || rec.LoanID || 
                             ' from ' || rec.InterestRate || '% to ' || (rec.InterestRate + v_RateIncrease) || '%');
    END LOOP;
    COMMIT;
END;
/
