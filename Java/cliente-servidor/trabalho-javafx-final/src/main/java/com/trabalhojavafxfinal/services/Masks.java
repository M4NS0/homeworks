package com.trabalhojavafxfinal.services;

import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Masks {
    public boolean maskingName(TextField citizenNameTxt) {
        Pattern pattern = Pattern.compile("^\\s*(?:((?:Dr.)|(?:Mr.)|(?:Mr?s.)|(?:Miss)|(?:2nd\\sLt.)|(?:Sen\\.?))\\s+)?((?:\\w+)|(?:\\w\\.))(?:\\s+((?:\\w\\.?)|(?:\\w\\w+)))?(?:\\s+((?:[OD]['’]\\s?)?[-\\w]+))(?:,?\\s+( (?:[JS]r\\.?)|(?:Esq\\.?)|(?:((?:M)|(?:Ph)|(?:Ed)) \\.?\\s*D\\.?)|(?: R\\.?N\\.?)|(?:IV)|(?:VI)|(?:V)|(?: I+)))?\\s*$",
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(citizenNameTxt.getText());
        boolean matchFound = matcher.find();

        if (matchFound) {
            citizenNameTxt.setStyle("-fx-text-fill: green");
            return true;
        } else
            return false;
    }

    public Boolean maskingCpf(KeyEvent event, TextField cpfTxt) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }
        if (event.getCharacter().trim().length() == 0) {
            if (cpfTxt.getText().length() == 4) {
                cpfTxt.setText(cpfTxt.getText().substring(0, 3));
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
            if (cpfTxt.getText().length() == 8) {
                cpfTxt.setText(cpfTxt.getText().substring(0, 7));
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
            if (cpfTxt.getText().length() == 12) {
                cpfTxt.setText(cpfTxt.getText().substring(0, 11));
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
        } else {
            if (cpfTxt.getText().length() == 14) event.consume();

            if (cpfTxt.getText().length() == 3) {
                cpfTxt.setText(cpfTxt.getText() + ".");
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
            if (cpfTxt.getText().length() == 7) {
                cpfTxt.setText(cpfTxt.getText() + ".");
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
            if (cpfTxt.getText().length() == 11) {
                cpfTxt.setText(cpfTxt.getText() + "-");
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
            if (cpfTxt.getText().length() == 14) {
                cpfTxt.setStyle("-fx-text-fill: green");
                return true;
            }
        }

        cpfTxt.setOnKeyReleased((KeyEvent evt) -> {
            if (!cpfTxt.getText().matches("\\d.-*")) {
                cpfTxt.setText(cpfTxt.getText().replaceAll("[^\\d.-]", ""));
                cpfTxt.positionCaret(cpfTxt.getText().length());
            }
        });
        return false;
    }

    public Boolean maskingVacinationDay(KeyEvent event, TextField vacinationDateTxt) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }

        if (event.getCharacter().trim().length() == 0) {
            if (vacinationDateTxt.getText().length() == 3) {
                vacinationDateTxt.setText(vacinationDateTxt.getText().substring(0, 2));
                vacinationDateTxt.positionCaret(vacinationDateTxt.getText().length());
            }
            if (vacinationDateTxt.getText().length() == 6) {
                vacinationDateTxt.setText(vacinationDateTxt.getText().substring(0, 5));
                vacinationDateTxt.positionCaret(vacinationDateTxt.getText().length());
            }
        } else {

            if (vacinationDateTxt.getText().length() == 10) event.consume();

            if (vacinationDateTxt.getText().length() == 2) {
                vacinationDateTxt.setText(vacinationDateTxt.getText() + "-");
                vacinationDateTxt.positionCaret(vacinationDateTxt.getText().length());
            }
            if (vacinationDateTxt.getText().length() == 5) {
                vacinationDateTxt.setText(vacinationDateTxt.getText() + "-");
                vacinationDateTxt.positionCaret(vacinationDateTxt.getText().length());
            }
            if (vacinationDateTxt.getText().length() == 10) {
                vacinationDateTxt.setStyle("-fx-text-fill: green");
                return true;
            }

        }

        vacinationDateTxt.setOnKeyReleased((KeyEvent evt) -> {
            if (!vacinationDateTxt.getText().matches("\\d-*")) {
                vacinationDateTxt.setText(vacinationDateTxt.getText().replaceAll("[^\\d-]", ""));
                vacinationDateTxt.positionCaret(vacinationDateTxt.getText().length());
            }
        });
        return false;
    }

    public Boolean maskingCnpj(KeyEvent event, TextField vaxCnpjTxt) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }

        if (event.getCharacter().trim().length() == 0) {
            if (vaxCnpjTxt.getText().length() == 3) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText().substring(0, 2));
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 7) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText().substring(0, 6));
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 11) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText().substring(0, 10));
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 16) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText().substring(0, 15));
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
        } else {
            if (vaxCnpjTxt.getText().length() == 18) event.consume();

            if (vaxCnpjTxt.getText().length() == 2) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText() + ".");
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 6) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText() + ".");
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 10) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText() + "/");
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 15) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText() + "-");
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
            if (vaxCnpjTxt.getText().length() == 18) {
                vaxCnpjTxt.setStyle("-fx-text-fill: green");
                return true;
            }

        }
        vaxCnpjTxt.setOnKeyReleased((KeyEvent evt) -> {

            if (!vaxCnpjTxt.getText().matches("\\d./-*")) {
                vaxCnpjTxt.setText(vaxCnpjTxt.getText().replaceAll("[^\\d./-]", ""));
                vaxCnpjTxt.positionCaret(vaxCnpjTxt.getText().length());
            }
        });
        return false;
    }

    public void maskingVaxDosage(TextField vaxDosageTxt) {
        vaxDosageTxt.lengthProperty().addListener((observable, oldValue, newValue) -> {
            try {
                String value = vaxDosageTxt.getText();
                value = value.replaceAll("[^0-9]", "");
                value = value.replaceAll("([0-9])([0-9]{14})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{11})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{8})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{5})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{2})$", "$1.$2");
                vaxDosageTxt.setText(value);
                positionCaret(vaxDosageTxt);

                vaxDosageTxt.textProperty().addListener((observableValue, oldValue1, newValue1) -> {
                    if (newValue1.length() > 17)
                        vaxDosageTxt.setText(oldValue1);
                });
            } catch (IllegalArgumentException i) {
                i.printStackTrace();
            }

        });

        vaxDosageTxt.focusedProperty().addListener((observableValue, aBoolean, fieldChange) -> {
            if (!fieldChange) {
                final int length = vaxDosageTxt.getText().length();
                if (length > 0 && length < 3) {
                    vaxDosageTxt.setText(vaxDosageTxt.getText() + "00");
                }
            }
        });

    }
    private static void positionCaret(final TextField textField) {
        Platform.runLater(() -> textField.positionCaret(textField.getText().length()));
    }
}

