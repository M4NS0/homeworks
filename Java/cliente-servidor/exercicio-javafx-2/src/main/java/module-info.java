module com.exerciciojavafx2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.exerciciojavafx2 to javafx.fxml;
    exports com.exerciciojavafx2;
    exports com.exerciciojavafx2.controller;
    opens com.exerciciojavafx2.controller to javafx.fxml;
}