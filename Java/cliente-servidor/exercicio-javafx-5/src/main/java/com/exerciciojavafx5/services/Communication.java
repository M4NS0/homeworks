package com.exerciciojavafx5.services;

import com.exerciciojavafx5.model.Aluno;
import com.exerciciojavafx5.persistence.Dao;

import java.sql.SQLException;
import java.util.List;

public class Communication {

    public List<Aluno> getAlunos() {
        Dao dao = new Dao();
        List<Aluno> alunos = null;
        try {
            dao.connect();
            alunos = dao.getAlunos();
            dao.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public void update(Aluno aluno) {
        Dao dao = new Dao();
        try {
            dao.connect();
            dao.update(aluno);
            dao.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Aluno aluno) {
        Dao dao = new Dao();
        try {
            dao.connect();
            dao.save(aluno);
            dao.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Aluno aluno) {
        Dao dao = new Dao();
        try {
            dao.connect();
            dao.delete(aluno);
            dao.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
