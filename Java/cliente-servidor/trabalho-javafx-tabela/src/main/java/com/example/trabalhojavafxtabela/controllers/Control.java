package com.example.trabalhojavafxtabela.controllers;

import com.example.trabalhojavafxtabela.models.DTO;
import com.example.trabalhojavafxtabela.persistence.DaoPessoaFisica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Control implements Initializable {

    @FXML
    private TableColumn<DTO, Integer> idCol;

    @FXML
    private TableColumn<DTO, String> nomeCol;

    @FXML
    private TableView<DTO> tabelaPessoa;

    @FXML
    private TableColumn<DTO, String> celularCol;

    @FXML
    private TableColumn<DTO, String> cidadeCol;

    @FXML
    private TableColumn<DTO, String> comercialCol;

    @FXML
    private TableColumn<DTO, String> contatoCol;

    @FXML
    private TableColumn<DTO, String> cpfCol;

    @FXML
    private TableColumn<DTO, String> estadoCol;

    @FXML
    private TableColumn<DTO, String> statusCol;

    private ObservableList<DTO> personData = FXCollections.observableArrayList();

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
        celularCol.setCellValueFactory(cellData -> cellData.getValue().celularProperty());
        contatoCol.setCellValueFactory(cellData -> cellData.getValue().contatoProperty());
        comercialCol.setCellValueFactory(cellData -> cellData.getValue().comercialProperty());
        statusCol.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
    }

    private void getDataInFile() {
        DaoPessoaFisica dao = new DaoPessoaFisica();
        List<DTO> list;
        list = dao.getAll();
        personData.addAll(list);

    }

}
