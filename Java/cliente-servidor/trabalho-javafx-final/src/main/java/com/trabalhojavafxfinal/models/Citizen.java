package com.trabalhojavafxfinal.models;

import javafx.beans.property.*;

import java.util.Date;

public class Citizen implements Comparable<Citizen> {
    private int id;
    private String citizenName;
    private String cpf;
    private String vaxName;
    private Date vaxDate;
    private String vaxProducerName;
    private Double vaxDosage;
    private String vaxCNPJ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getVaxName() {
        return vaxName;
    }

    public void setVaxName(String vaxName) {
        this.vaxName = vaxName;
    }

    public Date getVaxDate() {
        return vaxDate;
    }

    public void setVaxDate(Date vaxDate) {
        this.vaxDate = vaxDate;
    }

    public String getVaxProducerName() {
        return vaxProducerName;
    }

    public void setVaxProducerName(String vaxProducerName) {
        this.vaxProducerName = vaxProducerName;
    }

    public Double getVaxDosage() {
        return vaxDosage;
    }

    public void setVaxDosage(Double vaxDosage) {
        this.vaxDosage = vaxDosage;
    }

    public String getVaxCNPJ() {
        return vaxCNPJ;
    }

    public void setVaxCNPJ(String vaxCNPJ) {
        this.vaxCNPJ = vaxCNPJ;
    }

    @Override
    public int compareTo(Citizen citizen) {
        return this.getId() - citizen.getId();
    }
}
