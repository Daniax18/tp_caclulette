package com.example.tp_calculette.presentation.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
