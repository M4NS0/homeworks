package com.trabalhojavafxfinal.services;

import com.trabalhojavafxfinal.models.Citizen;
import com.trabalhojavafxfinal.persistence.Dao;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Communication {

    public List<Citizen> getListFromDB() throws SQLException {
        Dao dao = new Dao();
        Tools tools = new Tools();
        dao.connect();
        List<Citizen> list = dao.getListFromDB();
        dao.disconnect();
        return tools.sortList(list);
    }

    public void save(Citizen citizen) throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        dao.insert(citizen);
        dao.disconnect();
    }

    public void delete(Citizen citizen) throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        dao.delete(citizen);
        dao.disconnect();
    }

    public void update(Citizen citizen) throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        dao.update(citizen);
        dao.disconnect();
    }


    private List<Citizen> sortList(List<Citizen> list) {
        Collections.sort(list);
        return list;
    }

    public Citizen search(String search) throws SQLException {
        Dao dao = new Dao();
        dao.connect();
        Citizen citizen = dao.search(search);
        dao.disconnect();
        return citizen;
    }

}







