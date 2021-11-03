package com.exemplojavafx.controller;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    @FXML
    private Button btnValidar;

    @FXML
    private Label msgErroNome;

    @FXML
    private Label msgErroNumero;

    @FXML
    private Label msgErroValor;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtValor;

    @FXML
    void Validar(ActionEvent event) {

        boolean checkMatricula = regexValidation("numeric", txtMatricula.getText());
        boolean statusMatricula = setMatriculaErrorLabel(
                txtMatricula.getText().isBlank(),
                txtMatricula.getText().isEmpty(),
                txtMatricula.getText().length(),
                checkMatricula);

        if (statusMatricula == false){
            this.msgErroNumero.setVisible(true);
            fadeOut(this.msgErroNumero);
        }

        boolean checkNome = regexValidation("nome",txtNome.getText());
        boolean statusNome = setNomeErrorLabel(
                txtNome.getText().isBlank(),
                txtNome.getText().isEmpty(),
                txtNome.getText().length(),
                checkNome);

        if (statusNome == false){
            this.msgErroNome.setVisible(true);
            fadeOut(this.msgErroNome);
        }

        boolean checkDecimal = regexValidation("decimal", txtValor.getText());
        boolean statusValor = setValorErrorLabel(
                txtValor.getText().isBlank(),
                txtValor.getText().isEmpty(),
                checkDecimal);

        if(statusValor == false) {
            this.msgErroValor.setVisible(true);
            fadeOut(this.msgErroValor);
        }
    }

    private boolean setValorErrorLabel(boolean blank, boolean empty, boolean checkDecimal) {
        if (blank == true) {
            msgErroValor.setText("* Precisa conter o valor");
            return false;
        }
        if (empty == true) {
            msgErroValor.setText("* Não pode estar vazio");
            return false;
        }
        if (checkDecimal == false) {
            msgErroValor.setText("* Precisa ser decimal");
            return false;
        }
        return true;
    }

    private boolean setNomeErrorLabel(boolean blank, boolean empty, int length, boolean checkNome) {
        if (blank == true) {
            msgErroNome.setText("* Insira o nome");
            return false;
        }
        if (empty == true) {
            msgErroNome.setText("* Preencha o campo");
            return false;
        }
        if (checkNome == false) {
            msgErroNome.setText("* Nome inválido");
            return  false;
        }
        if (length > 50) {
            msgErroNome.setText("* Nome muito grande");
            return  false;
        }
        return true;
    }

    private boolean setMatriculaErrorLabel(boolean blank, boolean empty, int length, boolean checkMatricula) {

        if (blank == true) {
            msgErroNumero.setText("* Campo em branco");
            return false;
        }
        if (empty == true) {
            msgErroNumero.setText("* Campo vazio");
            return false;
        }
        if (checkMatricula == false) {
            msgErroNumero.setText("* Apenas numérico");
            return  false;
        }
        if (length > 10) {
            msgErroNumero.setText("* Contém mais de 10 caracteres");
            return  false;
        }
        if (length < 10) {
            msgErroNumero.setText("* Contém menos de 10 caracteres");
            return  false;
        }
        return true;
    }

    private boolean regexValidation(String txt, String input) {
        if (txt.equals("numeric")) {
            Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            boolean marchFound = matcher.find();
            return marchFound;
        }

        if (txt.equals("nome")) {
            Pattern pattern = Pattern.compile("^\\s*(?:((?:Dr.)|(?:Mr.)|(?:Mr?s.)|(?:Miss)|(?:2nd\\sLt.)|(?:Sen\\.?))\\s+)?((?:\\w+)|(?:\\w\\.))(?:\\s+((?:\\w\\.?)|(?:\\w\\w+)))?(?:\\s+((?:[OD]['’]\\s?)?[-\\w]+))(?:,?\\s+( (?:[JS]r\\.?)|(?:Esq\\.?)|(?:((?:M)|(?:Ph)|(?:Ed)) \\.?\\s*D\\.?)|(?: R\\.?N\\.?)|(?:IV)|(?:VI)|(?:V)|(?: I+)))?\\s*$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            boolean marchFound = matcher.find();
            return marchFound;
        }

        if (txt.equals("decimal")) {
            Pattern pattern = Pattern.compile("^-?(\\d+)[\\,\\.](\\d{2})$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            boolean marchFound = matcher.find();
            return marchFound;
        }
        return true;
    }

    private void fadeOut(Label label) {
        fadeOut = new FadeTransition();
        fadeOut.setDuration(Duration.millis(4000));
        fadeOut.setNode(label);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setCycleCount(1);
        fadeOut.setAutoReverse(false);
        fadeOut.playFromStart();
    }

    private FadeTransition fadeOut = new FadeTransition();

}

