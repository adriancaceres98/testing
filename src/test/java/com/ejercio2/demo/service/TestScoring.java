package com.ejercio2.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScoring {

    @Test
    public void Scoring1() {
        //Arrange
        int cantidadMeses = 1;
        int cantidadVentas = 1;
        int esperado = 1;
        Scoring scoring = new Scoring(cantidadMeses,cantidadVentas);
        // Act
        int resultado = scoring.calcular();
        // Assert
        assertEquals(esperado,resultado,"Scoring 1");
    }



}
