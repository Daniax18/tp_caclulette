package com.example.tp_calculette;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculController {
    public TextField value1, value2, value3;
    public Label response;

    @FXML
    protected void onClicked(){
        response.setText("I am clicked here !");
    }

}
