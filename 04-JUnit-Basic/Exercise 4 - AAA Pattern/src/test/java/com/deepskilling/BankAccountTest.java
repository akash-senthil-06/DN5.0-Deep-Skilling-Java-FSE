package com.deepskilling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100.00);
        account.deposit(50.00);
        assertEquals(150.00, account.getBalance());
    }
    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount(100.00);
        account.withdraw(40.00);
        assertEquals(60.00, account.getBalance());
    }
    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100.00);
        account.withdraw(150.00);
        assertEquals(100.00, account.getBalance());
    }
    public static void main(String[] args) {
        TestRunner.runTests(BankAccountTest.class);
    }
}
