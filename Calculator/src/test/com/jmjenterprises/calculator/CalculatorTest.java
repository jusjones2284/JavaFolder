package com.jmjenterprises.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    private final Calculator calc = new Calculator();

    @Test
    public void canAddZeroPlusZero(){
        int sum = calc.add(5, 0);
        assertEquals(5,sum, "was expecting sum of 10");
        System.out.println();

    }

    @Test
    public void canAddOnePlusOne(){
        int sum = calc.add(1, 1);
        assertEquals(2,sum, "was expecting sum of 2");


    }
    @Test
    public void canSubPlusZero(){
        int subTrack = calc.subTrack(30,20);
        assertEquals(10, subTrack, "was expecting sub of 10");
    }
    @Test
    public void canAddMaxIntPlusOne(){
        int maxInt = calc.add(Integer.MAX_VALUE, 1);
        System.out.println(maxInt);//2147483647
        assertEquals((Integer.MAX_VALUE + 1), maxInt, "was expecting sub of 10");
    }
}


