package com.example.tp_calculette.presentation.controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.application.Platform;
import org.junit.jupiter.api.BeforeAll;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class CalculControllerTest {

    private CalculController controller;

    @BeforeAll
    static void initToolkit() {
        // Initialise JavaFX Toolkit pour éviter l'erreur
        Platform.startup(() -> {});
    }


    @BeforeEach
    void setUp() throws Exception {
        controller = new CalculController();

        // Injection des composants FXML simulés
        injectPrivateField(controller, "valueAField", new TextField());
        injectPrivateField(controller, "valueBField", new TextField());
        injectPrivateField(controller, "valueCField", new TextField());
        injectPrivateField(controller, "resultLabel", new Label());
    }

    private void injectPrivateField(Object target, String fieldName, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    private Object getPrivateField(Object target, String fieldName) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(target);
    }

    @Test
    void testDeuxSolutionsReelles() throws Exception {
        ((TextField) getPrivateField(controller, "valueAField")).setText("1");
        ((TextField) getPrivateField(controller, "valueBField")).setText("-3");
        ((TextField) getPrivateField(controller, "valueCField")).setText("2");

        controller.onCalculate();

        Label resultLabel = (Label) getPrivateField(controller, "resultLabel");
        assertTrue(resultLabel.getText().contains("Deux solutions réelles distinctes"));
    }

    @Test
    void testRacineDouble() throws Exception {
        ((TextField) getPrivateField(controller, "valueAField")).setText("1");
        ((TextField) getPrivateField(controller, "valueBField")).setText("2");
        ((TextField) getPrivateField(controller, "valueCField")).setText("1");

        controller.onCalculate();

        Label resultLabel = (Label) getPrivateField(controller, "resultLabel");
        assertTrue(resultLabel.getText().contains("Racine double"));
    }

    @Test
    void testAucuneSolutionReelle() throws Exception {
        ((TextField) getPrivateField(controller, "valueAField")).setText("1");
        ((TextField) getPrivateField(controller, "valueBField")).setText("2");
        ((TextField) getPrivateField(controller, "valueCField")).setText("5");

        controller.onCalculate();

        Label resultLabel = (Label) getPrivateField(controller, "resultLabel");
        assertTrue(resultLabel.getText().contains("Aucune solution réelle"));
    }

    @Test
    void testErreurDeSaisie() throws Exception {
        ((TextField) getPrivateField(controller, "valueAField")).setText("abc");
        ((TextField) getPrivateField(controller, "valueBField")).setText("2");
        ((TextField) getPrivateField(controller, "valueCField")).setText("3");

        controller.onCalculate();

        Label resultLabel = (Label) getPrivateField(controller, "resultLabel");
        assertEquals("Erreur : Veuillez entrer des nombres valides !", resultLabel.getText());
    }
}