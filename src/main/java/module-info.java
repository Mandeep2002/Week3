module com.example.week3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.week3 to javafx.fxml;
    exports com.example.week3;
}