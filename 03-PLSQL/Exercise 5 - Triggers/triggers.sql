
CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    :new.LastModified := SYSDATE;
END;
/

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, ActionDate, Message)
    VALUES (:new.TransactionID, SYSDATE, 'Transaction of $' || :new.Amount || ' (' || :new.TransactionType || ') on Account ID ' || :new.AccountID);
END;
/

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_Balance NUMBER;
BEGIN
    IF :new.TransactionType = 'Deposit' AND :new.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive.');
    END IF;

    IF :new.TransactionType = 'Withdrawal' THEN
        SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = :new.AccountID;
        IF :new.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20003, 'Withdrawal amount must be positive.');
        ELSIF :new.Amount > v_Balance THEN
            RAISE_APPLICATION_ERROR(-20004, 'Insufficient funds. Withdrawal of $' || :new.Amount || ' exceeds balance of $' || v_Balance);
        END IF;
    END IF;
END;
/
