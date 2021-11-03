package com.trabalhojavafxmascaras.controller;

import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Masks {
    /***
     * Mascara para CPF
     * @param event recebe evento de teclas
     * @param txtCpf onde foi guardado o texto
     */
    public void cpf(KeyEvent event, TextField txtCpf) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }
        if (event.getCharacter().trim().length() == 0) {
            if (txtCpf.getText().length() == 4) {
                txtCpf.setText(txtCpf.getText().substring(0, 3));
                txtCpf.positionCaret(txtCpf.getText().length());
            }
            if (txtCpf.getText().length() == 8) {
                txtCpf.setText(txtCpf.getText().substring(0, 7));
                txtCpf.positionCaret(txtCpf.getText().length());
            }
            if (txtCpf.getText().length() == 12) {
                txtCpf.setText(txtCpf.getText().substring(0, 11));
                txtCpf.positionCaret(txtCpf.getText().length());
            }
        } else {
            if (txtCpf.getText().length() == 14) event.consume();

            if (txtCpf.getText().length() == 3) {
                txtCpf.setText(txtCpf.getText() + ".");
                txtCpf.positionCaret(txtCpf.getText().length());
            }
            if (txtCpf.getText().length() == 7) {
                txtCpf.setText(txtCpf.getText() + ".");
                txtCpf.positionCaret(txtCpf.getText().length());
            }
            if (txtCpf.getText().length() == 11) {
                txtCpf.setText(txtCpf.getText() + "-");
                txtCpf.positionCaret(txtCpf.getText().length());
            }
            if (txtCpf.getText().length() == 14) {
                txtCpf.setStyle("-fx-text-fill: green");
            }
        }

        txtCpf.setOnKeyReleased((KeyEvent evt) -> {
            if (!txtCpf.getText().matches("\\d.-*")) {
                txtCpf.setText(txtCpf.getText().replaceAll("[^\\d.-]", ""));
                txtCpf.positionCaret(txtCpf.getText().length());
            }
        });
    }

    /**
     * Mascara para CNPJ
     * @param event recebe evento de teclas
     * @param txtCnpj onde foi guardado o texto
     */
    public void cnpj(KeyEvent event, TextField txtCnpj) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }

        if (event.getCharacter().trim().length() == 0) {
            if (txtCnpj.getText().length() == 3) {
                txtCnpj.setText(txtCnpj.getText().substring(0, 2));
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 7) {
                txtCnpj.setText(txtCnpj.getText().substring(0, 6));
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 11) {
                txtCnpj.setText(txtCnpj.getText().substring(0, 10));
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 16) {
                txtCnpj.setText(txtCnpj.getText().substring(0, 15));
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
        } else {
            if (txtCnpj.getText().length() == 18) event.consume();

            if (txtCnpj.getText().length() == 2) {
                txtCnpj.setText(txtCnpj.getText() + ".");
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 6) {
                txtCnpj.setText(txtCnpj.getText() + ".");
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 10) {
                txtCnpj.setText(txtCnpj.getText() + "/");
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 15) {
                txtCnpj.setText(txtCnpj.getText() + "-");
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
            if (txtCnpj.getText().length() == 18) {
                txtCnpj.setStyle("-fx-text-fill: green");
            }

        }
        txtCnpj.setOnKeyReleased((KeyEvent evt) -> {

            if (!txtCnpj.getText().matches("\\d./-*")) {
                txtCnpj.setText(txtCnpj.getText().replaceAll("[^\\d./-]", ""));
                txtCnpj.positionCaret(txtCnpj.getText().length());
            }
        });
    }

    /**
     * Mascara para data
     * @param event recebe evento de teclas
     * @param txtData onde foi guardado o texto
     */
    public void data(KeyEvent event, TextField txtData) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }

        if (event.getCharacter().trim().length() == 0) {
            if (txtData.getText().length() == 3) {
                txtData.setText(txtData.getText().substring(0, 2));
                txtData.positionCaret(txtData.getText().length());
            }
            if (txtData.getText().length() == 6) {
                txtData.setText(txtData.getText().substring(0, 5));
                txtData.positionCaret(txtData.getText().length());
            }
        } else {

            if (txtData.getText().length() == 10) event.consume();

            if (txtData.getText().length() == 2) {
                txtData.setText(txtData.getText() + "/");
                txtData.positionCaret(txtData.getText().length());
            }
            if (txtData.getText().length() == 5) {
                txtData.setText(txtData.getText() + "/");
                txtData.positionCaret(txtData.getText().length());
            }
            if (txtData.getText().length() == 10) {
                txtData.setStyle("-fx-text-fill: green");
            }

        }

        txtData.setOnKeyReleased((KeyEvent evt) -> {
            if (!txtData.getText().matches("\\d/*")) {
                txtData.setText(txtData.getText().replaceAll("[^\\d/]", ""));
                txtData.positionCaret(txtData.getText().length());
            }
        });
    }

    /**
     * Mascara para moeda
     * @param textField onde foi guardado o texto
     */
    public static void moeda(final TextField textField) {
        textField.lengthProperty().addListener((observable, oldValue, newValue) -> {
            try {
                String value = textField.getText();
                value = value.replaceAll("[^0-9]", "");
                value = value.replaceAll("([0-9])([0-9]{14})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{11})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{8})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{5})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{2})$", "$1,$2");
                textField.setText(value);
                positionCaret(textField);

                textField.textProperty().addListener((observableValue, oldValue1, newValue1) -> {
                    if (newValue1.length() > 17)
                        textField.setText(oldValue1);
                });
            } catch (IllegalArgumentException i) {
                i.printStackTrace();
            }

        });

        textField.focusedProperty().addListener((observableValue, aBoolean, fieldChange) -> {
            if (!fieldChange) {
                final int length = textField.getText().length();
                if (length > 0 && length < 3) {
                    textField.setText(textField.getText() + "00");
                }
            }
        });
    }

    /**
     * Apanha a posição dos caracteres enquanto teclas são digitadas
     * @param textField onde foi guardado o texto
     */
    private static void positionCaret(final TextField textField) {
        Platform.runLater(() -> textField.positionCaret(textField.getText().length()));
    }

}
