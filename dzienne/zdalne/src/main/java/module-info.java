module zdalne {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;

    exports firma.javafx;
    opens firma.javafx;
}