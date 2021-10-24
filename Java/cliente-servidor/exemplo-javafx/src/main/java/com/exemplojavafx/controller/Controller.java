package com.exemplojavafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    void Cancelar(ActionEvent event) {
        Alert alert;
        alert = new Alert(Alert.AlertType.INFORMATION, "Cancelado", ButtonType.OK);
        alert.setTitle("Atenção");
        alert.setHeaderText("Info");
        alert.show();
    }

    @FXML
    void Salvar(ActionEvent event) {
        Alert alert;
        alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
        alert.setTitle("Atenção");
        alert.setHeaderText("Info");
        alert.show();
    }

}
