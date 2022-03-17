package com.ejercio2.demo.service;

public class Scoring {

    private int cantidadMeses;
    private int cantidadVentas;

    public Scoring(int cantidadMeses, int cantidadVentas) {
        this.cantidadMeses = cantidadMeses;
        this.cantidadVentas = cantidadVentas;
    }

    public int calcular() {
        int rta = 0;
        if( cantidadMeses < 12) {
            if(cantidadVentas < 12) {
                rta = 1;
            } else {
                rta = 2;
            }
        } else {
            if(cantidadVentas < 12) {
                rta = 3;
            } else {
                rta = 4;
            }
        }
        return rta;
    }

}
