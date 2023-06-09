module com.example.homework11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework11 to javafx.fxml;
    exports com.example.homework11;
}