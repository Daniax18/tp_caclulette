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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Δ = ").append(delta).append("\n");

        if (!Double.isNaN(x1)) {
            sb.append("x₁ = ").append(x1).append("\n");
        }
        if (!Double.isNaN(x2)) {
            sb.append("x₂ = ").append(x2).append("\n");
        }

        sb.append("Message : ").append(message);
        return sb.toString();
    }
}
