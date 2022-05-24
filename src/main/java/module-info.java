module com.seaster {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.seaster to javafx.fxml;
    exports com.seaster;
}
