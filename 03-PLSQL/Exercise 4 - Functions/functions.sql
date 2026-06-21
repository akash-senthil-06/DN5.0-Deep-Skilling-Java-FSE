
CREATE OR REPLACE FUNCTION CalculateAge (
    p_DOB IN DATE
) RETURN NUMBER IS
    v_Age NUMBER;
BEGIN
    v_Age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_DOB) / 12);
    RETURN v_Age;
END CalculateAge;
/

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_LoanAmount   IN NUMBER,
    p_InterestRate IN NUMBER, -- Annual interest rate (e.g. 5 for 5%)
    p_DurationYears IN NUMBER
) RETURN NUMBER IS
    v_MonthlyRate NUMBER;
    v_TotalMonths NUMBER;
    v_EMI         NUMBER;
BEGIN
    v_MonthlyRate := (p_InterestRate / 100) / 12;
    v_TotalMonths := p_DurationYears * 12;
    
    IF v_MonthlyRate = 0 THEN
        v_EMI := p_LoanAmount / v_TotalMonths;
    ELSE
        v_EMI := p_LoanAmount * v_MonthlyRate * POWER(1 + v_MonthlyRate, v_TotalMonths) / (POWER(1 + v_MonthlyRate, v_TotalMonths) - 1);
    END IF;
    
    RETURN ROUND(v_EMI, 2);
END CalculateMonthlyInstallment;
/

CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_AccountID IN NUMBER,
    p_Amount    IN NUMBER
) RETURN VARCHAR2 IS
    v_Balance NUMBER;
BEGIN
    SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = p_AccountID;
    
    IF v_Balance >= p_Amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 'INVALID_ACCOUNT';
END HasSufficientBalance;
/
