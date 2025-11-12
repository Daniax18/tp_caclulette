package com.example.tp_calculette.domain.service;

import com.example.tp_calculette.domain.model.Equation;
import com.example.tp_calculette.domain.model.EquationResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationSolverTest {

    @Test
    void testDeuxSolutionsReelles() {
        Equation eq = new Equation(1, -3, 2); // x² - 3x + 2 = 0 → x1=1, x2=2
        EquationResult result = EquationSolver.solve(eq);

        assertEquals(1.0, result.getX1(), 0.001);
        assertEquals(2.0, result.getX2(), 0.001);
        assertEquals(1.0, result.getDelta(), 0.001);
        assertTrue(result.getMessage().contains("Deux solutions"));
    }

    @Test
    void testRacineDouble() {
        Equation eq = new Equation(1, -2, 1); // x² - 2x + 1 = 0 → Δ=0, x=1
        EquationResult result = EquationSolver.solve(eq);

        assertEquals(0.0, result.getDelta(), 0.001);
        assertEquals(1.0, result.getX1(), 0.001);
        assertEquals(1.0, result.getX2(), 0.001);
        assertTrue(result.getMessage().contains("Racine double"));
    }

    @Test
    void testAucuneSolutionReelle() {
        Equation eq = new Equation(1, 1, 1); // Δ < 0
        EquationResult result = EquationSolver.solve(eq);

        assertTrue(Double.isNaN(result.getX1()));
        assertTrue(Double.isNaN(result.getX2()));
        assertTrue(result.getMessage().contains("Aucune solution"));
    }

    @Test
    void testEquationLineaire() {
        Equation eq = new Equation(0, 2, -4); // 2x - 4 = 0 → x=2
        EquationResult result = EquationSolver.solve(eq);

        assertEquals(2.0, result.getX1(), 0.001);
        assertTrue(result.getMessage().contains("linéaire"));
    }

    @Test
    void testAucuneSolutionPouraEtbZero() {
        Equation eq = new Equation(0, 0, 5); // 0x + 5 = 0 → aucune solution
        EquationResult result = EquationSolver.solve(eq);

        assertTrue(Double.isNaN(result.getX1()));
        assertTrue(result.getMessage().contains("Aucune solution"));
    }
}
