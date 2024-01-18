package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2024IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2024);
        Assertions.assertTrue(result);
    }
    @Test
    public void test2025IsNotLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2025);
        Assertions.assertFalse(result);
    }
    @Test
    public void test2400IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2400);
        Assertions.assertTrue(result);
    }
    @Test
    public void test2100IsNotLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2100);
        Assertions.assertFalse(result);
    }
    @Test
    public void test2000IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2000);
        Assertions.assertTrue(result);
    }
    @Test
    public void test1000IsNotLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1000);
        Assertions.assertFalse(result);
    }
    @Test
    public void test1228IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1228);
        Assertions.assertTrue(result);
    }
}
