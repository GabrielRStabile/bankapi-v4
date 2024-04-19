package br.edu.utfpr.bankapi.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    private final TransactionService transactionService = new TransactionService();

    @Test
    void testWithdraw() {
        // Setup
        // Use the appropriate values for your test
        double initialBalance = 100.0;
        double amountToWithdraw = 50.0;

        // Execute
        transactionService.withdraw(initialBalance, amountToWithdraw);

        // Verify
        // Use the appropriate method to get the balance after withdrawal
        double finalBalance = transactionService.getBalance();
        assertEquals(50.0, finalBalance);
    }

    @Test
    void testTransfer() {
        // Setup
        // Use the appropriate values for your test
        double initialBalance = 100.0;
        double amountToTransfer = 50.0;

        // Execute
        transactionService.transfer(initialBalance, amountToTransfer);

        // Verify
        // Use the appropriate method to get the balance after transfer
        double finalBalance = transactionService.getBalance();
        assertEquals(50.0, finalBalance);
    }
}
