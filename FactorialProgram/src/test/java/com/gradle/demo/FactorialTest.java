package com.gradle.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void factorialOfZero(){
        Assertions.assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void factorialOfPositiveNumber(){
        Assertions.assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void factorialOfLargeNumber() {
        Assertions.assertEquals(3628800, Factorial.factorial(10));
    }
}