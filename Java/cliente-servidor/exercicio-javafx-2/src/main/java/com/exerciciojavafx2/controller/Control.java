package com.exerciciojavafx2.controller;


import com.exerciciojavafx2.models.PessoaFisica;
import com.exerciciojavafx2.models.Telefone;
import com.exerciciojavafx2.services.Carregamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;

import java.util.List;
import java.util.ResourceBundle;

public class Control implements Initializable {
    private int count = 0;
    private int max;

    @FXML
    private Button btnAnterior;

    @FXML
    private Button btnProximo;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtComercial;

    @FXML
    private TextField txtContato;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtStatus;

    @FXML
    void onClickNext(ActionEvent event) {
        count += 1;
        if (count == max) {
            count = 0;
            carregar(count);
        }
        carregar(count);
    }

    @FXML
    void onClickPreviously(ActionEvent event) {
        if (count > 0) {
            count -= 1;
            carregar(count);
        } else count = max;
    }

    private void carregar(int count) {
        Carregamento carregamento = new Carregamento();
        preencherFormulario(carregamento.pegarLista(), count);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Carregamento carregamento = new Carregamento();
        preencherFormulario(carregamento.pegarLista(), 0);
        this.max = carregamento.pegarLista().size();
    }

    private void preencherFormulario(List<PessoaFisica> lista, int i) {
        txtId.setText(String.valueOf(lista.get(i).getID()));
        txtNome.setText(lista.get(i).getNome());
        txtCidade.setText(lista.get(i).getCidade());
        txtEstado.setText(lista.get(i).getEstado());
        txtStatus.setText(lista.get(i).getStatus());

        verificarCampoBranco(lista.get(i).getTelefones().get(0));

        try {
            txtCelular.setText(String.valueOf(lista.get(i).getTelefones().get(0).getCelular()));
            txtContato.setText(String.valueOf(lista.get(i).getTelefones().get(0).getContato()));
            txtComercial.setText(String.valueOf(lista.get(i).getTelefones().get(0).getComercial()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void verificarCampoBranco(Telefone telefone) {
        if (telefone.getContato() == "")
            telefone.setContato("s/n");

        if (telefone.getComercial() == "")
            telefone.setComercial("s/n");

        if (telefone.getCelular() == "")
            telefone.setCelular("s/n");
    }
}
