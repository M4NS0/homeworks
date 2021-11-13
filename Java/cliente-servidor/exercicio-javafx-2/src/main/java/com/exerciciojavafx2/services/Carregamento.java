package com.exerciciojavafx2.services;

import com.exerciciojavafx2.models.PessoaFisica;
import com.exerciciojavafx2.persistence.DAO;

import java.util.List;

public class Carregamento {

    public List<PessoaFisica> pegarLista() {
        List<PessoaFisica> lista;
        DAO dao = new DAO();
        lista = dao.lerPessoaFisica();

        return lista;

    }

}
