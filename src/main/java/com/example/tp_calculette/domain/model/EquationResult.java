package com.example.tp_calculette.domain.model;

public class EquationResult {
    private double delta;
    private double x1;
    private double x2;
    private String message;

    public EquationResult(double delta, double x1, double x2, String message) {
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
        this.message = message;
    }

    public double getDelta() { return delta; }
    public double getX1() { return x1; }
    public double getX2() { return x2; }
    public String getMessage() { return message; }

    public String toString() {
        return "Δ = " + delta + "\n"
                + "x₁ = " + x1 + "\n"
                + "x₂ = " + x2 + "\n"
                + "Message : " + message;
    }
}
