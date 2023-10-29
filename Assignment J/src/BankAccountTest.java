import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("123456789", "John Doe", 500);
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(100);
        assertEquals(600, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() throws InsufficientFundsException {
        bankAccount.withdraw(200);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(600));
    }

    @Test
    void testGetAccountNumber() {
        assertEquals("123456789", bankAccount.getAccountNumber());
    }

    @Test
    void testGetAccountName() {
        assertEquals("John Doe", bankAccount.getAccountName());
    }
}