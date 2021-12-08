package com.trabalhojavafxfinal.controller;

import com.trabalhojavafxfinal.controller.bean.CitizenBean;
import com.trabalhojavafxfinal.models.Citizen;
import com.trabalhojavafxfinal.services.Communication;
import com.trabalhojavafxfinal.utils.Tools;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class Control implements Initializable {

    private Boolean isNameValid = false;
    private Boolean isCpfValid = false;
    private Boolean isVacinationDayValid = false;
    private Boolean isCnpjValid = false;
    private Boolean isVaxNameValid = false;
    private Boolean isVaxDosageValid = false;
    private Boolean isVaxProducerNameValid = false;


    @FXML
    private TableView<CitizenBean> tableRegister;

    @FXML
    private TableColumn<CitizenBean, Integer> idCol;

    @FXML
    private TableColumn<CitizenBean, String> citizenNameCol;

    @FXML
    private TableColumn<CitizenBean, String> cpfCol;

    @FXML
    private TableColumn<CitizenBean, String> vaxCNPJCol;

    @FXML
    private TableColumn<CitizenBean, String> vaxDateCol;

    @FXML
    private TableColumn<CitizenBean, Double> vaxDoseCol;

    @FXML
    private TableColumn<CitizenBean, String> vaxNameCol;

    @FXML
    private TableColumn<CitizenBean, String> vaxProducerNameCol;


    @FXML
    private TextField idTxt;

    @FXML
    private TextField citizenNameTxt;

    @FXML
    private TextField cpfTxt;

    @FXML
    private TextField vacinationDateTxt;

    @FXML
    private TextField vaxCnpjTxt;

    @FXML
    private TextField vaxDosageTxt;

    @FXML
    private TextField vaxNameTxt;

    @FXML
    private TextField vaxProducerNameTxt;


    @FXML
    private TextField searchTxt;

    @FXML
    private Button cleanBtn;

    @FXML
    private Button delBtn;

    @FXML
    private Button saveBtn;

    public Control() {
    }


    private ObservableList<CitizenBean> citizens = FXCollections.observableArrayList();

    /**
     * Carrega dados no formulário quando um item da tabela é selecionado
     *
     * @param event
     */
    @FXML
    void loadInForm(MouseEvent event) {
        CitizenBean citizen = tableRegister.getSelectionModel().getSelectedItem();
        greenFields();

        if (citizen != null) {
            idTxt.setText(String.valueOf(citizen.getId()));
            citizenNameTxt.setText(citizen.getCitizenName());
            cpfTxt.setText(citizen.getCpf());
            vacinationDateTxt.setText(citizen.getVaxDate());
            vaxCnpjTxt.setText(citizen.getVaxCNPJ());
            vaxDosageTxt.setText(String.valueOf(citizen.getVaxDosage()));
            vaxNameTxt.setText(citizen.getVaxName());
            vaxProducerNameTxt.setText(citizen.getVaxProducerName());
        }
        setAllTrue();
        setFields();
    }

    private void setAllTrue() {
        isNameValid = true;
        isCpfValid = true;
        isVacinationDayValid = true;
        isCnpjValid = true;
        isVaxNameValid = true;
        isVaxDosageValid = true;
        isVaxProducerNameValid = true;
    }

    @FXML
    void clear(ActionEvent event) {
        idTxt.clear();
        citizenNameTxt.clear();
        cpfTxt.clear();
        vacinationDateTxt.clear();
        vaxCnpjTxt.clear();
        vaxDosageTxt.clear();
        vaxNameTxt.clear();
        vaxProducerNameTxt.clear();
    }

    @FXML
    void delete(ActionEvent event) throws SQLException {
        Communication communication = new Communication();
        Tools tools = new Tools();
        CitizenBean citizenBean = tableRegister.getSelectionModel().getSelectedItem();
        Citizen citizen;
        citizen = tools.convertToBeanObject(citizenBean);

        communication.delete(citizen);
        loadAll();
    }

    @FXML
    void save(ActionEvent event) throws SQLException {
        Communication communication = new Communication();
        Tools tools = new Tools();
        CitizenBean citizenBean;
        citizenBean = obtainDataInForm();
        Citizen citizen;

        citizen = tools.convertToBeanObject(citizenBean);

        saveBtn.setDisable(false);

        if (!idTxt.getText().isEmpty()) {
            communication.update(citizen);
        } else {
            communication.save(citizen);
        }
        loadAll();
    }


    @FXML
    private void mapBackspace(KeyEvent event) {
        if (event.getCode() == KeyCode.BACK_SPACE) {
            Object e = event.getSource();
            String eString = e.toString();
            String aux = eString.substring(eString.indexOf("id=") + 3, eString.indexOf(","));
            verifyCurrentlyField(aux);
        } else
            setFields();
    }

    public void verifyCurrentlyField(String aux) {
        switch (aux) {
            case "idTxt":
                idTxt.clear();
                citizenNameTxt.setStyle("-fx-text-inner-color: #bd0000;");

                break;
            case "citizenNameTxt":
                citizenNameTxt.clear();
                citizenNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isNameValid = false;
                break;
            case "cpfTxt":
                cpfTxt.clear();
                cpfTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isCpfValid = false;
                break;
            case "vacinationDateTxt":
                vacinationDateTxt.clear();
                vacinationDateTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isVacinationDayValid = false;
                break;
            case "vaxCnpjTxt":
                vaxCnpjTxt.clear();
                vaxCnpjTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isCnpjValid = false;
                break;
            case "vaxDosageTxt":
                vaxDosageTxt.clear();
                vaxDosageTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isVaxDosageValid = false;
                break;
            case "vaxNameTxt":
                vaxNameTxt.clear();
                vaxNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isVaxNameValid = false;
                break;
            case "vaxProducerNameTxt":
                vaxProducerNameTxt.clear();
                vaxProducerNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
                isVaxProducerNameValid = false;
                break;
        }
        setFields();
    }

    private void setFields() {
        if (isNameValid && isCpfValid && isVacinationDayValid && isVaxNameValid && isCnpjValid && isVaxProducerNameValid && isVaxDosageValid) {
            saveBtn.setDisable(false);
        } else {
            saveBtn.setDisable(true);
        }
    }
//TODO:
    private CitizenBean obtainDataInForm() {
        CitizenBean citizen = new CitizenBean();

        if (idTxt.getText().isEmpty()) {
            int lastId = citizens.size() > 0 ? citizens.get(citizens.size() - 1).getId() + 1 : 1;
            System.out.println(lastId);
            citizen.setId(lastId + 1);
        } else {
            citizen.setId(Integer.parseInt(idTxt.getText()));
        }
        citizen.setCitizenName(citizenNameTxt.getText());
        citizen.setCpf(cpfTxt.getText());
        citizen.setVaxCNPJ(vaxCnpjTxt.getText());
        citizen.setVaxDate(vacinationDateTxt.getText());
        citizen.setVaxDosage(Double.parseDouble(vaxDosageTxt.getText()));
        citizen.setVaxName(vaxNameTxt.getText());
        citizen.setVaxProducerName(vaxProducerNameTxt.getText());
        return citizen;
    }

    private List<Citizen> obtainList() throws SQLException {
        Communication communication = new Communication();
        List<Citizen> citizenList = communication.getListFromDB();
        return citizenList;
    }

    private void addInTable() {
        idCol.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        citizenNameCol.setCellValueFactory(cellData -> cellData.getValue().citizenNameProperty());
        cpfCol.setCellValueFactory(cellData -> cellData.getValue().cpfProperty());
        vaxCNPJCol.setCellValueFactory(cellData -> cellData.getValue().vaxCNPJProperty());
        vaxDateCol.setCellValueFactory(cellData -> cellData.getValue().vaxDateProperty());
        vaxDoseCol.setCellValueFactory(cellData -> cellData.getValue().vaxDosageProperty().asObject());
        vaxNameCol.setCellValueFactory(cellData -> cellData.getValue().vaxNameProperty());
        vaxProducerNameCol.setCellValueFactory(cellData -> cellData.getValue().vaxProducerNameProperty());

        tableRegister.setItems(citizens);
    }

    private void maskingFields() {
        Masks mask = new Masks();
        citizenNameTxt.setOnKeyTyped((KeyEvent event) -> {
            isNameValid = mask.maskingName(citizenNameTxt);

        });
        cpfTxt.setOnKeyTyped((KeyEvent event) -> {
            isCpfValid = mask.maskingCpf(event, cpfTxt);

        });
        vacinationDateTxt.setOnKeyTyped((KeyEvent event) -> {
            isVacinationDayValid = mask.maskingVacinationDay(event, vacinationDateTxt);

        });
        vaxNameTxt.setOnKeyTyped((KeyEvent event) -> {
            isVaxNameValid = mask.maskingName(vaxNameTxt);

        });
        vaxCnpjTxt.setOnKeyTyped((KeyEvent event) -> {
            isCnpjValid = mask.maskingCnpj(event, vaxCnpjTxt);

        });
        vaxDosageTxt.setOnKeyTyped((KeyEvent event) -> {
            isVaxDosageValid = mask.maskingVaxDosage(vaxDosageTxt);

        });
        vaxProducerNameTxt.setOnKeyTyped((KeyEvent event) -> {
            isVaxProducerNameValid = mask.maskingName(vaxProducerNameTxt);

        });
        setFields();
    }

    private void reddenFields() {
        idTxt.setStyle("-fx-text-inner-color: #bd0000;");
        citizenNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
        cpfTxt.setStyle("-fx-text-inner-color: #bd0000;");
        vacinationDateTxt.setStyle("-fx-text-inner-color: #bd0000;");
        vaxCnpjTxt.setStyle("-fx-text-inner-color: #bd0000;");
        vaxDosageTxt.setStyle("-fx-text-inner-color: #bd0000;");
        vaxNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
        vaxProducerNameTxt.setStyle("-fx-text-inner-color: #bd0000;");
    }

    private void greenFields() {
        idTxt.setStyle("-fx-text-inner-color: green;");
        citizenNameTxt.setStyle("-fx-text-inner-color: green;");
        cpfTxt.setStyle("-fx-text-inner-color: green;");
        vacinationDateTxt.setStyle("-fx-text-inner-color: green;");
        vaxCnpjTxt.setStyle("-fx-text-inner-color: green;");
        vaxDosageTxt.setStyle("-fx-text-inner-color: green;");
        vaxNameTxt.setStyle("-fx-text-inner-color: green;");
        vaxProducerNameTxt.setStyle("-fx-text-inner-color: green;");
    }

    private void loadAll() throws SQLException {
        Tools tools = new Tools();
        citizens.clear();
        reddenFields();
        maskingFields();
        List<Citizen> citizenList = obtainList();

        citizens.addAll(tools.convertToBeanList(citizenList));
        addInTable();
        tableRegister.setItems(citizens);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
