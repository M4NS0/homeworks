module com.example.trabalhojavafxtabela {
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

    opens com.example.trabalhojavafxtabela to javafx.fxml;
    exports com.example.trabalhojavafxtabela;
    exports com.example.trabalhojavafxtabela.controllers;
    opens com.example.trabalhojavafxtabela.controllers to javafx.fxml;
}