module com.exerciciojavafx3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.exerciciojavafx3 to javafx.fxml;
    exports com.exerciciojavafx3;
    exports com.exerciciojavafx3.Controller;
    opens com.exerciciojavafx3.Controller to javafx.fxml;
}