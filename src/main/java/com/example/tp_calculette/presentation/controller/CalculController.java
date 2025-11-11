package com.example.tp_calculette.presentation.controller;

import com.example.tp_calculette.domain.model.Equation;
import com.example.tp_calculette.domain.model.EquationResult;
import com.example.tp_calculette.domain.service.EquationSolver;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculController {
    @FXML
    private TextField valueAField;
    @FXML
    private TextField valueBField;
    @FXML
    private TextField valueCField;
    @FXML
    private Label resultLabel;
    @FXML
    protected void onCalculate() {
        try {

            double a = Double.parseDouble(valueAField.getText());
            double b = Double.parseDouble(valueBField.getText());
            double c = Double.parseDouble(valueCField.getText());

            Equation equation = new Equation(a, b, c);
            EquationResult result = EquationSolver.solve(equation);

            // Display results
            resultLabel.setText(result.toString());


        } catch (NumberFormatException e) {
            resultLabel.setText("Erreur : Veuillez entrer des nombres valides !");
        }
    }
}
