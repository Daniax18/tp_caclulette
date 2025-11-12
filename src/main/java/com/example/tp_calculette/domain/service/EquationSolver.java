package com.example.tp_calculette.domain.service;

import com.example.tp_calculette.domain.model.Equation;
import com.example.tp_calculette.domain.model.EquationResult;

public class EquationSolver {

    /**
     * Résout une équation du second degré de la forme ax² + bx + c = 0
     * @return tableau contenant les racines (ou null si pas de solutions réelles)
     */
    public static EquationResult solve(Equation equation) {
        double a = equation.getValueA();
        double b = equation.getValueB();
        double c = equation.getValueC();

        double delta = b * b - 4 * a * c;
        double x1, x2;
        String message;

        if (a == 0) {
            if (b == 0) {
                message = (c == 0) ? "Une infinité de solutions" : "Aucune solution";
                return new EquationResult(Double.NaN, Double.NaN, Double.NaN, message);
            } else {
                // Cas d’une équation linéaire bx + c = 0
                x1 = -c / b;
                message = "Équation linéaire – une seule solution";
                return new EquationResult(Double.NaN, x1, Double.NaN, message);
            }
        }

        if (delta < 0) {
            message = "Aucune solution réelle (Δ < 0)";
            x1 = x2 = Double.NaN;
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
            message = "Racine double (Δ = 0)";
        } else {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            message = "Deux solutions réelles distinctes (Δ > 0)";
        }

        return new EquationResult(delta, x1, x2, message);
    }
}
