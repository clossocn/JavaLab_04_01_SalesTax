module com.example.lab_04_01_salestax {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_04_01_salestax to javafx.fxml;
    exports com.example.lab_04_01_salestax;
}