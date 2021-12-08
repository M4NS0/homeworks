module com.exerciciojavafx5 {
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
    requires java.sql;

    opens com.exerciciojavafx5 to javafx.fxml;
    exports com.exerciciojavafx5;
    exports com.exerciciojavafx5.control;
    opens com.exerciciojavafx5.control to javafx.fxml;
}