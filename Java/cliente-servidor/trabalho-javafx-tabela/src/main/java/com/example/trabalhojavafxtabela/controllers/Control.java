package com.example.trabalhojavafxtabela.controllers;

import com.example.trabalhojavafxtabela.models.PessoaFisica;
import com.example.trabalhojavafxtabela.models.Telefone;
import com.example.trabalhojavafxtabela.persistence.DaoPessoaFisica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Control implements Initializable {

    @FXML
    private TableColumn<PessoaFisica, Integer> idCol;

    @FXML
    private TableColumn<PessoaFisica, String> nomeCol;

    @FXML
    private TableView<PessoaFisica> tabelaPessoa;

    @FXML
    private TableColumn<Telefone, String> celularCol;

    @FXML
    private TableColumn<PessoaFisica, String> cidadeCol;

    @FXML
    private TableColumn<Telefone, String> comercialCol;

    @FXML
    private TableColumn<Telefone, String> contatoCol;

    @FXML
    private TableColumn<PessoaFisica, String> cpfCol;

    @FXML
    private TableColumn<PessoaFisica, String> estadoCol;


    @FXML
    private TableColumn<?, ?> statusCol;
    private ObservableList<PessoaFisica> personData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getDataInFile();
        addInTabela();

        tabelaPessoa.setItems(personData);
    }

    private void addInTabela() {
        idCol.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nomeCol.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        cpfCol.setCellValueFactory(cellData -> cellData.getValue().cpfProperty());
        cidadeCol.setCellValueFactory(cellData -> cellData.getValue().cidadeProperty());
        estadoCol.setCellValueFactory(cellData -> cellData.getValue().estadoProperty());
//        celularCol.setCellValueFactory(cellData -> cellData.getValue().celularProperty());
//        contatoCol.setCellValueFactory(cellData -> cellData.getValue().contatoProperty());
//        comercialCol.setCellValueFactory(cellData -> cellData.getValue().comercialProperty());
//        statusCol.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
    }

    private void getDataInFile() {
        DaoPessoaFisica dao = new DaoPessoaFisica();
        List<PessoaFisica> list;
        list = dao.getAll();
        personData.addAll(list);

    }

}
