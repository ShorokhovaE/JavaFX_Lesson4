module lesson4.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lesson4.javafx to javafx.fxml;
    exports lesson4.javafx;
}