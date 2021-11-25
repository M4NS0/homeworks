package com.exerciciojavafx4.controller;

import com.exerciciojavafx4.models.PessoaJuridica;
import com.exerciciojavafx4.services.Comunication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class Control implements Initializable {

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TableColumn<PessoaJuridica, String> cidadeCol;

    @FXML
    private TableColumn<PessoaJuridica, String> cnpjCol;

    @FXML
    private TableColumn<PessoaJuridica, String> estadoCol;

    @FXML
    private TableColumn<PessoaJuridica, Integer> idCol;

    @FXML
    private TableColumn<PessoaJuridica, String> pagamentoCol;

    @FXML
    private TableColumn<PessoaJuridica, String> razaoSocialCol;

    @FXML
    private TableColumn<PessoaJuridica, String> statusCol;

    @FXML
    private TableView<PessoaJuridica> tabelaPessoa;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCnpj;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtPagamento;

    @FXML
    private TextField txtRazaoSocial;

    @FXML
    private TextField txtStatus;

    /**
     * Insere dados na tabela
     */
    private ObservableList<PessoaJuridica> empresas = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadAll();
    }

    /**
     * Carrega todos os dados da tabela
     */
    private void loadAll() {
        empresas.clear();
        obtainDataInFile();
        Collections.sort(empresas);
        addInTable();
        tabelaPessoa.setItems(empresas);
    }


    /**
     * Carrega dados da tabela clicando sobre uma linha qualquer e passa para o formulário
     *
     * @param event captura evento de clique
     */
    @FXML
    void carregaFormulario(MouseEvent event) {
        PessoaJuridica pessoa = tabelaPessoa.getSelectionModel().getSelectedItem();
        txtId.setText(String.valueOf(pessoa.getId()));
        txtRazaoSocial.setText(pessoa.getRazaoSocial());
        txtCnpj.setText(pessoa.getCnpj());
        txtCidade.setText(pessoa.getCidade());
        txtEstado.setText(pessoa.getEstado());
        txtPagamento.setText(pessoa.getPagamento());
        txtStatus.setText(pessoa.getStatus());
    }

    /**
     * Limpa dados do formulário
     *
     * @param event captura evento de clique
     */
    @FXML
    void limparCampos(ActionEvent event) {
        txtId.clear();
        txtRazaoSocial.clear();
        txtCnpj.clear();
        txtCidade.clear();
        txtEstado.clear();
        txtPagamento.clear();
        txtStatus.clear();
        loadAll();
    }

    /**
     * Envia lista com id verificado para serviço de comunicação
     * Lê novamente dados da tabela e atualiza a tabela
     *
     * @param event captura evento de clique
     */
    @FXML
    void salvar(ActionEvent event) {
        Comunication comunication = new Comunication();
        PessoaJuridica pessoa;
        pessoa = obtainDataInForm();

        if (!txtId.getText().isEmpty()) {
            empresas.remove(tabelaPessoa.getSelectionModel().getSelectedItem());
            pessoa.setId(Integer.parseInt(txtId.getText()));
        }
        empresas.add(pessoa);
        comunication.sendListToPersistence(empresas);
        loadAll();
    }

    /**
     * Envia lista de empresas com valor apagado para serviço de comunicação
     * Lê novamente dados da tabela e atualiza a tabela
     *
     * @param event captura evento de clique
     */
    @FXML
    void deletarRegistro(ActionEvent event) {
        PessoaJuridica pessoa = tabelaPessoa.getSelectionModel().getSelectedItem();
        empresas.remove(pessoa);
        Comunication comunication = new Comunication();
        comunication.sendListToPersistence(empresas);
        loadAll();
    }

    /**
     * Obtém dados de lista do comunicador e insere na lista de empresas
     */
    private void obtainDataInFile() {
        Comunication comunication = new Comunication();
        List<PessoaJuridica> list;
        list = comunication.getDataFromPersistence();

        empresas.addAll(list);
    }

    /**
     * Obtém dados do formulário e retorna um objeto PessoaJuridica
     *
     * @return objeto PessoaJuridica
     */
    private PessoaJuridica obtainDataInForm() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setId(empresas.size() + 1);
        pessoa.setRazaoSocial(txtRazaoSocial.getText());
        pessoa.setCnpj(txtCnpj.getText());
        pessoa.setCidade(txtCidade.getText());
        pessoa.setEstado(txtEstado.getText());
        pessoa.setPagamento(txtPagamento.getText());
        pessoa.setStatus(txtStatus.getText());

        return pessoa;
    }

    /**
     * Insere dados na tabela
     */
    private void addInTable() {
        idCol.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        razaoSocialCol.setCellValueFactory(cellData -> cellData.getValue().razaoSocialProperty());
        cnpjCol.setCellValueFactory(cellData -> cellData.getValue().cnpjProperty());
        cidadeCol.setCellValueFactory(cellData -> cellData.getValue().cidadeProperty());
        estadoCol.setCellValueFactory(cellData -> cellData.getValue().estadoProperty());
        pagamentoCol.setCellValueFactory(cellData -> cellData.getValue().pagamentoProperty());
        statusCol.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
    }


}
