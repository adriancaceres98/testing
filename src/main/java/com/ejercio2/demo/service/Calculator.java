package com.ejercio2.demo.service;

public class Calculator {
    public int calculateTotal(int a, int b) {
        return a+b;
    }
    public int calculateMinNumber(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
