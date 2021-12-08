module com.example.trabalhojavafxfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.trabalhojavafxfinal to javafx.fxml;
    exports com.trabalhojavafxfinal;
    exports com.trabalhojavafxfinal.controller;
    opens com.trabalhojavafxfinal.controller to javafx.fxml;
    exports com.trabalhojavafxfinal.services;
    opens com.trabalhojavafxfinal.services to javafx.fxml;
    exports com.trabalhojavafxfinal.utils;
    opens com.trabalhojavafxfinal.utils to javafx.fxml;
}