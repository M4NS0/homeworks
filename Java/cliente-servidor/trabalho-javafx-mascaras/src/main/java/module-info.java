module com.trabalhojavafxmascaras {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.trabalhojavafxmascaras to javafx.fxml;
    exports com.trabalhojavafxmascaras;
    exports com.trabalhojavafxmascaras.controller;
    opens com.trabalhojavafxmascaras.controller to javafx.fxml;
}