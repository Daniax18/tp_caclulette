package com.example.tp_calculette.domain.model;

public class Equation {
    private double valueA;
    private double valueB;
    private double valueC;

    public Equation(double valueA, double valueB, double valueC) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
    }

    public double getValueA() { return valueA; }
    public double getValueB() { return valueB; }
    public double getValueC() { return valueC; }
}
