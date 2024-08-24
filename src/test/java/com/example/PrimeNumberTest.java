package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeNumberTest {

    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumber.isPrime(2), "2 should be prime");
        assertTrue(PrimeNumber.isPrime(3), "3 should be prime");
        assertFalse(PrimeNumber.isPrime(4), "4 should not be prime");
        assertFalse(PrimeNumber.isPrime(9), "9 should not be prime");
        assertTrue(PrimeNumber.isPrime(13), "13 should be prime");
    }
}
