package com.ejercio2.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusServiceTest {

    @Test
    public void testStatusOk() {
        //Arrange
        String expectedResult = "Status ok";
        StatusService statusService = new StatusService();
        //Act
        String status = statusService.getStatus(1);
        //Assert
        assertEquals(expectedResult,status);
    }


}
