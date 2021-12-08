package com.trabalhojavafxfinal.utils;

import com.trabalhojavafxfinal.controller.bean.CitizenBean;
import com.trabalhojavafxfinal.models.Citizen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tools {


    public Date stringToDate(String vaxDate) {
       Date date = new Date();
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = formatter.parse(vaxDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String dateToString(Date vaxDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(vaxDate);
        return date;
    }

    public List<Citizen> sortList(List<Citizen> list) {
        Collections.sort(list);
        return list;
    }

    public List<CitizenBean> convertToBeanList(List<Citizen> citizenList) {
        List<CitizenBean> citizenBeanList = new ArrayList<>();

        for (Citizen citizen : citizenList) {
            CitizenBean cititizenBean = new CitizenBean();
            cititizenBean.setId(citizen.getId());
            cititizenBean.setCitizenName(citizen.getCitizenName());
            cititizenBean.setCpf(citizen.getCpf());
            cititizenBean.setVaxName(citizen.getVaxName());
            cititizenBean.setVaxProducerName(citizen.getVaxProducerName());
            cititizenBean.setVaxCNPJ(citizen.getVaxCNPJ());
            cititizenBean.setVaxDate(convertToBetterDate(citizen.getVaxDate()));
            cititizenBean.setVaxDosage(citizen.getVaxDosage());
            citizenBeanList.add(cititizenBean);
        }
        return citizenBeanList;

    }

    private String convertToBetterDate(Date vaxDate) {
        String [] dateParts = vaxDate.toString().split("-");
        String year = dateParts[0];
        String month = dateParts[1];
        String day = dateParts[2];
        String newDate = day + "/" + month + "/" + year;
        return newDate;
    }


    public Citizen convertToBeanObject(CitizenBean citizenBean) {
        Citizen citizen = new Citizen();
        Tools tools = new Tools();
        citizen.setId(citizenBean.getId());
        citizen.setCitizenName(citizenBean.getCitizenName());
        citizen.setCpf(citizenBean.getCpf());
        citizen.setVaxDate(tools.stringToDate(citizenBean.getVaxDate()));
        citizen.setVaxCNPJ(citizenBean.getVaxCNPJ());
        citizen.setVaxDosage(citizenBean.getVaxDosage());
        citizen.setVaxName(citizenBean.getVaxName());
        citizen.setVaxProducerName(citizenBean.getVaxProducerName());

        return citizen;
    }


}
