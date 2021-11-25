package com.exerciciojavafx3.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Control implements Initializable {

    Boolean isDataValid = false;
    Boolean isNomeValid = false;
    Boolean isPlacaValid = false;
    Boolean isMoedaValid = false;

    @FXML
    private Button btnValidar;

    @FXML
    private TextField txtData;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtValor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtData.setStyle("-fx-text-fill: #bd0000");
        txtData.setOnKeyTyped((KeyEvent event) -> {
            Masks masks = new Masks();
            isDataValid = masks.mapearData(event, txtData);
        });

        txtNome.setStyle("-fx-text-fill: #bd0000");
        txtNome.setOnKeyTyped((KeyEvent event) -> {
            Masks masks = new Masks();
            isNomeValid = masks.mapearNome(txtNome);
        });

        txtValor.setStyle("-fx-text-fill: #bd0000");
        txtValor.setOnKeyTyped((KeyEvent event) -> {
            Masks masks = new Masks();
            isMoedaValid = masks.mapearMoeda(txtValor);
        });

        txtPlaca.setStyle("-fx-text-fill: #bd0000");
        txtPlaca.setOnKeyTyped((KeyEvent event) -> {
            Masks masks = new Masks();
            isPlacaValid = masks.mapearPlaca(txtPlaca);
        });
    }

    @FXML
    void changeButtonState(ActionEvent event) {
        if (isPlacaValid == true && isNomeValid == true && isDataValid == true && isMoedaValid == true) {
            btnValidar.setStyle("-fx-text-fill: green");
            btnValidar.setText("Válido ✓");
        } else {
            btnValidar.setStyle("-fx-text-fill: #bd0000");
            btnValidar.setText("Inválido ✕");
        }
    }
}