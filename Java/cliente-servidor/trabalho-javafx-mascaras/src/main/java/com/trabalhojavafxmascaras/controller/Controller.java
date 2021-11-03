package com.trabalhojavafxmascaras.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField txtCnpj;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtData;

    @FXML
    private TextField txtMoeda;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtCpf.setStyle("-fx-text-fill: #bd0000");
        txtCpf.setOnKeyTyped((KeyEvent event) -> {
            Masks mask = new Masks();
            mask.cpf(event, txtCpf);
        });

        txtCnpj.setStyle("-fx-text-fill: #bd0000");
        txtCnpj.setOnKeyTyped((KeyEvent event) -> {
            Masks mask = new Masks();
            mask.cnpj(event, txtCnpj);
        });

        txtData.setStyle("-fx-text-fill: #bd0000");
        txtData.setOnKeyTyped((KeyEvent event) -> {
            Masks mask = new Masks();
            mask.data(event, txtData);
        });

        txtMoeda.setStyle("-fx-text-fill: #bd0000");
        txtMoeda.setOnKeyTyped(event -> {
            txtMoeda.setStyle("-fx-text-fill: green");
            Masks masks = new Masks();
            masks.moeda(txtMoeda);
        });


    }
}
