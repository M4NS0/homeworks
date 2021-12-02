package com.trabalhojavafxfinal.controller.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class CitizenBean implements Comparable<CitizenBean> {
    private IntegerProperty id;
    private SimpleStringProperty citizenName;
    private SimpleStringProperty cpf;
    private SimpleStringProperty vaxName;
    private SimpleStringProperty vaxDate;
    private SimpleStringProperty vaxProducerName;
    private SimpleDoubleProperty vaxDosage;
    private SimpleStringProperty vaxCNPJ;

    public CitizenBean() {
        this.id = new SimpleIntegerProperty();
        this.citizenName = new SimpleStringProperty();
        this.cpf = new SimpleStringProperty();
        this.vaxName = new SimpleStringProperty();
        this.vaxDate = new SimpleStringProperty("dd/MM/yyyy");
        this.vaxProducerName = new SimpleStringProperty();
        this.vaxDosage = new SimpleDoubleProperty();
        this.vaxCNPJ = new SimpleStringProperty();
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getCitizenName() {
        return citizenName.get();
    }

    public SimpleStringProperty citizenNameProperty() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName.set(citizenName);
    }

    public String getCpf() {
        return cpf.get();
    }

    public SimpleStringProperty cpfProperty() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf.set(cpf);
    }

    public String getVaxCNPJ() {
        return vaxCNPJ.get();
    }

    public SimpleStringProperty vaxCNPJProperty() {
        return vaxCNPJ;
    }

    public void setVaxCNPJ(String vaxCNPJ) {
        this.vaxCNPJ.set(vaxCNPJ);
    }

    public String getVaxName() {
        return vaxName.get();
    }

    public SimpleStringProperty vaxNameProperty() {
        return vaxName;
    }

    public void setVaxName(String vaxName) {
        this.vaxName.set(vaxName);
    }

    public String getVaxDate() {
        return vaxDate.get();
    }

    public SimpleStringProperty vaxDateProperty() {
        return vaxDate;
    }

    public void setVaxDate(String vaxDate) {
        this.vaxDate.set(vaxDate);
    }

    public String getVaxProducerName() {
        return vaxProducerName.get();
    }

    public SimpleStringProperty vaxProducerNameProperty() {
        return vaxProducerName;
    }

    public void setVaxProducerName(String vaxProducerName) {
        this.vaxProducerName.set(vaxProducerName);
    }

    public double getVaxDosage() {
        return vaxDosage.get();
    }

    public SimpleDoubleProperty vaxDosageProperty() {
        return vaxDosage;
    }

    public void setVaxDosage(double vaxDosage) {
        this.vaxDosage.set(vaxDosage);
    }


    @Override
    public int compareTo(CitizenBean citizen) {
        return this.getId() - citizen.getId();
    }
}
