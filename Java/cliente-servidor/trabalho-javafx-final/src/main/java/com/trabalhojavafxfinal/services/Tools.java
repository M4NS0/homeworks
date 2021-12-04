package com.trabalhojavafxfinal.services;

import com.trabalhojavafxfinal.controller.bean.CitizenBean;
import com.trabalhojavafxfinal.models.Citizen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Tools {
    public Date stringToDate(String vaxDate) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = sdf.parse(vaxDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String dateToString(Date vaxDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
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
            cititizenBean.setVaxDate(citizen.getVaxDate().toString());
            cititizenBean.setVaxDosage(citizen.getVaxDosage());
            citizenBeanList.add(cititizenBean);
        }
        return citizenBeanList;

    }


}
