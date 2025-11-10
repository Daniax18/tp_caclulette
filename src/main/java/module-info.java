module com.example.tp_calculette {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp_calculette to javafx.fxml;
    exports com.example.tp_calculette;
}