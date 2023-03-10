package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    //tests two positive numbers
    @Test
    public void testAddPositive() {
        int result = Main.add(2, 3);
        assertEquals(5, result);
    }
    //tests two negative numbers
    @Test
    public void testAddNegative() {
        int result = Main.add(-2, -3);
        assertEquals(-5, result);
    }
    //tests positive number with zero
    @Test
    public void testAddZeroPositive() {
        int result = Main.add(0, 7);
        assertEquals(7, result);
    }
    //tests negative number with zero
    @Test
    public void testAddZeroNegative() {
        int result = Main.add(0, -4);
        assertEquals(-4, result);
    }
    //tests negative and positive number
    @Test
    public void testAddPositiveNegative() {
        int result = Main.add(-2, 3);
        assertEquals(1, result);
    }
}