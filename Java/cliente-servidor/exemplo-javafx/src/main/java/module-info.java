module com.exemplojavafx {
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

    opens com.exemplojavafx to javafx.fxml;
    exports com.exemplojavafx;
    exports com.exemplojavafx.controller;
    opens com.exemplojavafx.controller to javafx.fxml;
}