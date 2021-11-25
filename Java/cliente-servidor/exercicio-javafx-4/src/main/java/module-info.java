module com.exerciciojavafx4 {
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

    opens com.exerciciojavafx4 to javafx.fxml;
    exports com.exerciciojavafx4;
    exports com.exerciciojavafx4.controller;
    opens com.exerciciojavafx4.controller to javafx.fxml;
}