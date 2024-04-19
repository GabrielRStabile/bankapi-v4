package br.edu.utfpr.bankapi.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterestCalculatorTest {
    /*
     * Should calculate interest correctly
     */
    @Test
    public void testCalculateInterest() {
        // ARANGE
        InterestCalculator interestCalculator = new InterestCalculator();

        // ACT
        double interest = interestCalculator.calculateJustInterest(1000.0, 1.5, 6);
        double interestMonth = interestCalculator.calculateJustInterest(1000.0, 1.5, 1);

        // ASSERT
        assertEquals(93.44, interest);
        assertEquals(15.00, interestMonth);
    }
}
