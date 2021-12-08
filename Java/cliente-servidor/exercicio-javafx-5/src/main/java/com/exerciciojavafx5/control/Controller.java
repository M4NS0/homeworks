package com.exerciciojavafx5.control;

import com.exerciciojavafx5.control.bean.AlunoBean;
import com.exerciciojavafx5.model.Aluno;
import com.exerciciojavafx5.services.Communication;
import com.exerciciojavafx5.utils.Tools;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableColumn<AlunoBean, String> nameColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button cleanBtn;

    @FXML
    private TextField matriculaTextField;

    @FXML
    private Button delBtn;

    @FXML
    private TableColumn<AlunoBean, Integer> idColumn;

    @FXML
    private TextField idTextField;

    @FXML
    private Button saveBtn;

    @FXML
    private TableView<AlunoBean> tableRegister;

    @FXML
    private TextField nascimentoTextField;

    @FXML
    private TableColumn<AlunoBean, String> nascimentoColumn;

    @FXML
    private TableColumn<AlunoBean, String> matriculaColumn;

    private ObservableList<AlunoBean> alunos = FXCollections.observableArrayList();
    private boolean isNameValid;
    private boolean isMatriculaValid;
    private boolean isNascimentoValid;

    @FXML
    void clean(ActionEvent event) {
        nameTextField.setText("");
        matriculaTextField.setText("");
        nascimentoTextField.setText("");
        idTextField.setText("");
    }

    @FXML
    void save(ActionEvent event) {
        Communication communication = new Communication();
        Tools tools = new Tools();
        AlunoBean alunoBean = obtainDataInForm();
        Aluno aluno;
        aluno = tools.convertBeanToObject(alunoBean);
        saveBtn.setDisable(false);

        if (!idTextField.getText().isEmpty()) {
            communication.update(aluno);
        } else communication.save(aluno);
        loadAll();
    }

    private AlunoBean obtainDataInForm() {
        AlunoBean alunoBean = new AlunoBean();

        if(idTextField.getText().isEmpty()){
            int lastId = alunos.size() > 0 ? alunos.get(alunos.size() - 1).getId() + 1 : 1;
            alunoBean.setId(lastId -1);
        } else {
            alunoBean.setId(Integer.parseInt(idTextField.getText()));
        }
        alunoBean.setNome(nameTextField.getText());
        alunoBean.setMatricula(matriculaTextField.getText());
        alunoBean.setDataNascimento(nascimentoTextField.getText());
        return alunoBean;
    }

    @FXML
    void delete(ActionEvent event) {
        Communication communication = new Communication();
        Tools tools = new Tools();
        AlunoBean alunoBean = tableRegister.getSelectionModel().getSelectedItem();
        Aluno aluno = tools.convertBeanToObject(alunoBean);
        communication.delete(aluno);
        loadAll();
    }

    @FXML
    void mapBackspace(KeyEvent event) {
        if (event.getCode().toString().equals("BACK_SPACE")) {
            Object e = event.getSource();
            String eString = e.toString();
            String aux = eString.substring(eString.indexOf("id=") + 3, eString.indexOf(","));
            verifyThisField(aux);
        } else setFields();
    }

    private void verifyThisField(String aux) {
        switch (aux) {
            case "idTextField":
                idTextField.clear();
                setFields();
                break;

            case "nameTextField":
                nameTextField.clear();
                isNameValid = false;
                nameTextField.setStyle("-fx-text-inner-color: #bd0000;");
                setFields();
                break;

            case "matriculaTextField":
                matriculaTextField.clear();
                isMatriculaValid = false;
                matriculaTextField.setStyle("-fx-text-inner-color: #bd0000;");
                setFields();
                break;

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadAll();
    }

    @FXML
    void loadInForm(MouseEvent event) {
        AlunoBean alunoBean = tableRegister.getSelectionModel().getSelectedItem();
        greenFields();
        if (alunoBean != null) {
            nameTextField.setText(alunoBean.getNome());
            matriculaTextField.setText(alunoBean.getMatricula());
            nascimentoTextField.setText(alunoBean.getDataNascimento());
            idTextField.setText(String.valueOf(alunoBean.getId()));
        }
        setAllTrue();
        setFields();
    }

    private void setFields() {
        if (isMatriculaValid && isNameValid && isNascimentoValid) {
            saveBtn.setDisable(false);
        } else {
            saveBtn.setDisable(true);
        }
    }

    private void setAllTrue() {
        isNameValid = true;
        isMatriculaValid = true;
        isNascimentoValid = true;
    }

    private void greenFields() {
        idTextField.setStyle("-fx-text-inner-color: green");
        nameTextField.setStyle("-fx-text-inner-color: green");
        matriculaTextField.setStyle("-fx-text-inner-color: green");
        nascimentoTextField.setStyle("-fx-text-inner-color: green");
    }


    private void loadAll() {
        Communication communication = new Communication();
        List<Aluno> list = communication.getAlunos();
        Tools tools = new Tools();

        alunos.clear();
        reddenFields();
        maskingFields();
        alunos.addAll(tools.convertToBeanList(list));
        addInTable();
    }

    private void addInTable() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        nascimentoColumn.setCellValueFactory(cellData -> cellData.getValue().dataNascimentoProperty());
        matriculaColumn.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());
        tableRegister.setItems(alunos);
    }


    private void maskingFields() {
        Masks masks = new Masks();

        nameTextField.setOnKeyTyped((KeyEvent event) -> {
            isNameValid = masks.maskingName(nameTextField);
        });

        matriculaTextField.setOnKeyTyped((KeyEvent event) -> {
            isMatriculaValid = masks.maskingMatricula(matriculaTextField);
        });

        nascimentoTextField.setOnKeyTyped((KeyEvent event) -> {
            isNascimentoValid = masks.maskingNascimento(event, nascimentoTextField);
        });
        setFields();
    }

    private void reddenFields() {
        nameTextField.setStyle("-fx-text-inner-color: #ff0000");
        matriculaTextField.setStyle("-fx-text-inner-color: #ff0000");
        nascimentoTextField.setStyle("-fx-text-inner-color: #ff0000");
        idTextField.setStyle("-fx-text-inner-color: #ff0000");
    }
}
