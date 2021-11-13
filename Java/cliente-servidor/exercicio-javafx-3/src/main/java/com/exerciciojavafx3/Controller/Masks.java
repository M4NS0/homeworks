package com.exerciciojavafx3.Controller;

import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Masks {
    /**
     * Mascara para data
     * @param event recebe evento de teclas
     * @param txtData onde foi guardado o texto
     * @return validador para mudar estado de botao
     */
    public boolean mapeiaData(KeyEvent event, TextField txtData) {
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
                return true;
            }
        }

        txtData.setOnKeyReleased((KeyEvent evt) -> {
            if (!txtData.getText().matches("\\d/*")) {
                txtData.setText(txtData.getText().replaceAll("[^\\d/]", ""));
                txtData.positionCaret(txtData.getText().length());
            }
        });
        return false;
    }

    /**
     * Mascara para Nomes
     * @param txtNome onde foi guardado o texto
     * @return validador para mudar estado de botao
     */
    public Boolean mapeiaNome(TextField txtNome) {
        Pattern pattern = Pattern.compile("^\\s*(?:((?:Dr.)|(?:Mr.)|(?:Mr?s.)|(?:Miss)|(?:2nd\\sLt.)|(?:Sen\\.?))\\s+)?((?:\\w+)|(?:\\w\\.))(?:\\s+((?:\\w\\.?)|(?:\\w\\w+)))?(?:\\s+((?:[OD]['’]\\s?)?[-\\w]+))(?:,?\\s+( (?:[JS]r\\.?)|(?:Esq\\.?)|(?:((?:M)|(?:Ph)|(?:Ed)) \\.?\\s*D\\.?)|(?: R\\.?N\\.?)|(?:IV)|(?:VI)|(?:V)|(?: I+)))?\\s*$",
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(txtNome.getText());
        boolean matchFound = matcher.find();

        if(matchFound) {
            txtNome.setStyle("-fx-text-fill: green");
            return true;
        } else

            return false;
    }

    /**
     * Mascara para moeda
     * @param txtMoeda onde foi guardado o texto
     * @return validador para mudar estado de botao
     */
    public static boolean mapeiaMoeda(final TextField txtMoeda) {
        Pattern pattern = Pattern.compile("([0-9]+[\\,])?([0-9]+[\\.,])+([0-9]{2})+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txtMoeda.getText());

        txtMoeda.lengthProperty().addListener((observable, oldValue, newValue) -> {
            try {
                String value = txtMoeda.getText();
                value = value.replaceAll("[^0-9]", "");
                value = value.replaceAll("([0-9])([0-9]{14})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{11})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{8})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{5})$", "$1.$2");
                value = value.replaceAll("([0-9])([0-9]{2})$", "$1,$2");
                txtMoeda.setText(value);
                positionCaret(txtMoeda);

                txtMoeda.textProperty().addListener((observableValue, oldValue1, newValue1) -> {
                    if (newValue1.length() > 17)
                        txtMoeda.setText(oldValue1);
                });
            } catch (IllegalArgumentException i) {
                i.printStackTrace();
            }
        });

        txtMoeda.focusedProperty().addListener((observableValue, aBoolean, fieldChange) -> {
            if (!fieldChange) {
                final int length = txtMoeda.getText().length();
                if (length > 0 && length < 3) {
                    txtMoeda.setText(txtMoeda.getText() + "00");
                }
            }
        });
        boolean matchFound = matcher.find();
        if(matchFound) {
            txtMoeda.setStyle("-fx-text-fill: green");
            return true;
        } else

        return false;
    }

    /**
     * Apanha a posição dos caracteres enquanto teclas são digitadas
     * @param textField onde foi guardado o texto
     */
    private static void positionCaret(final TextField textField) {
        Platform.runLater(() -> textField.positionCaret(textField.getText().length()));
    }


    /**
     * Máscara para renavan antigo e mercosul
     * @param renavam onde foi guardado o texto
     * @return validador para mudar estado de botao
     */
    public static boolean mapeiaPlaca(TextField renavam) {
        Pattern pattern = Pattern.compile("[A-Z0-9]{3}[-][a-zA-Z0-9]{4}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(renavam.getText());

        renavam.lengthProperty().addListener((observable, oldValue, newValue) -> {
            try {
                String value = renavam.getText();
                value = value.replaceAll("([A-Z])([0-9]{4})$", "$1-$2");

                renavam.setText(value);
                positionCaret(renavam);

                renavam.textProperty().addListener((observableValue, oldValue1, newValue1) -> {
                    if (newValue1.length() > 8)
                        renavam.setText(oldValue1);

                });

            } catch (IllegalArgumentException i) {
                i.printStackTrace();
            }
        });

        renavam.focusedProperty().addListener((observableValue, aBoolean, fieldChange) -> {
            if (!fieldChange) {
                final int length = renavam.getText().length();
                if (length > 0 && length < 3) {
                    renavam.setText(renavam.getText() + "00");

                }
            }
        });

        boolean matchFound = matcher.find();
        if(matchFound)
            renavam.setStyle("-fx-text-fill: green");
        return matchFound;
    }
}
