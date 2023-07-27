module com.example.myfoodplanapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfoodplanapp to javafx.fxml;
    exports com.example.myfoodplanapp;
}