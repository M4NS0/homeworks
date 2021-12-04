module com.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.demo to javafx.fxml;
    exports com.demo;
    exports com.demo.controle;
    opens com.demo.controle to javafx.fxml;
    opens com.demo.view to javafx.fxml;
}