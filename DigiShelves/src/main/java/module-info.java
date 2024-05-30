module com.example.digishelves {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.digishelves to javafx.fxml;
    exports com.example.digishelves;
}