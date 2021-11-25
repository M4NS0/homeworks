package com.trabalhojavafxfinal.services;

import com.trabalhojavafxfinal.models.Citizen;
import com.trabalhojavafxfinal.persistence.Dao;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Communication {



    public List<Citizen> getListFromDB() throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        List<Citizen> list = dao.getListFromDB();
        dao.disconnect();
        return sortList(list);
    }

    public void save(Citizen citizen) throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        dao.saveCitizen(citizen);
        dao.disconnect();
    }

    public void delete(Citizen citizen) {
        Dao dao = new Dao();
        dao.deleteCitizen(citizen);
    }

    public void update(Citizen citizen) {
        Dao dao = new Dao();
        dao.updateCitizen(citizen);
    }


    private List<Citizen> sortList(List<Citizen> list) {
        Collections.sort(list);
        return list;
    }

    public Citizen getCitizenBySearch(String search) {
        Dao dao = new Dao();
        return dao.getCitizenBySearch(search);
    }


}







