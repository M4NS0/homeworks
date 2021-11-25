package com.exerciciojavafx4.services;

import com.exerciciojavafx4.models.PessoaJuridica;
import com.exerciciojavafx4.persistence.DaoPessoaJuridica;
import javafx.collections.ObservableList;

import java.util.List;


public class Comunication {
    /**
     * Recebe lista de empresas atualizada e envia para persistencia
     *
     * @param empresas
     */
    public void sendListToPersistence(ObservableList<PessoaJuridica> empresas) {
        DaoPessoaJuridica dao = new DaoPessoaJuridica();
        dao.save(empresas);
    }

    /**
     * Recebe lista de empresas da camada de persistência e envia para a camada de visão
     *
     * @return lista de empresas recebida da camada de persistência
     */
    public List<PessoaJuridica> getDataFromPersistence() {
        DaoPessoaJuridica dao = new DaoPessoaJuridica();
        return dao.getAll();
    }
}
