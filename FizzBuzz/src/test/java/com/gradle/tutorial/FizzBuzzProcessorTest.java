package com.gradle.tutorial;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzProcessorTest {
    @Test
    @Disabled("Not Implemented")
    public void FizzBuzzNormalNumbers() {
        assertEquals("1", FizzBuzzProcessor.convert(1));
        assertEquals("2", FizzBuzzProcessor.convert(2));
    }

    @Test
    @DisplayName("Name of the test")
    public void FizzBuzzThreeNumbers() {
        assertEquals("Fizz", FizzBuzzProcessor.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {
        assertEquals("Buzz", FizzBuzzProcessor.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {
        assertEquals("Buzz", FizzBuzzProcessor.convert(5));
    }


}