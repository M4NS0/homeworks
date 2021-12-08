package com.exerciciojavafx5.control;

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

    public boolean maskingMatricula(TextField matriculaTxt) {
        // ^\s*(?:[0-9]{3}\s+)?[0-9]{3}\s+[0-9]{3}\s*$
        Pattern pattern = Pattern.compile("[0-9]{4}\\.[0-9]{1}\\.[0-9]{4}\\.[0-9]{4}\\-[0-9]",
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(matriculaTxt.getText());
        boolean matchFound = matcher.find();

        if (matchFound) {
            matriculaTxt.setStyle("-fx-text-fill: green");
            return true;
        } else
            return false;
    }

    public boolean maskingNascimento(KeyEvent event, TextField data) {
        if (!"0123456789".contains(event.getCharacter())) {
            event.consume();
        }

        if (event.getCharacter().trim().length() == 0) {
            if (data.getText().length() == 3) {
                data.setText(data.getText().substring(0, 2));
                data.positionCaret(data.getText().length());
            }
            if (data.getText().length() == 6) {
                data.setText(data.getText().substring(0, 5));
                data.positionCaret(data.getText().length());
            }
        } else {

            if (data.getText().length() == 10) event.consume();

            if (data.getText().length() == 2) {
                data.setText(data.getText() + "/");
                data.positionCaret(data.getText().length());
            }
            if (data.getText().length() == 5) {
                data.setText(data.getText() + "/");
                data.positionCaret(data.getText().length());
            }
            if (data.getText().length() == 10) {
                data.setStyle("-fx-text-fill: green");
                return true;
            }

        }

        data.setOnKeyReleased((KeyEvent evt) -> {
            if (!data.getText().matches("\\d/*")) {
                data.setText(data.getText().replaceAll("[^\\d/]", ""));
                data.positionCaret(data.getText().length());
            }
        });
        return false;
    }
}
