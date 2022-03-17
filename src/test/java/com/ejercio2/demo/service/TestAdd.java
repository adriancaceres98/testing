package com.ejercio2.demo.service;

import org.junit.jupiter.api.Test;

import static   org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdd {

    @Test
    public void addTest() {
        // Arrange
        int number1 = 3;
        int number2 = 5;
        int expectedResult = 8;
        Add addClass = new Add();
        // Act
        int result = addClass.add(number1,number2);
        // Assert
        assertEquals(expectedResult,result);
    }

}
