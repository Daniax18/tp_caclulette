module com.example.tp_calculette {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.tp_calculette.presentation.controller to javafx.fxml;
    exports com.example.tp_calculette.app;
}
