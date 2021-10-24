package controller;

import models.Aluno;
import services.Mock;
import services.ObterAluno;

import java.util.ArrayList;
import java.util.List;

public class Control {



    public void start() {
        List<Aluno> alunos;
        alunos = obterAluno(getListaDeAlunos());
        for (Aluno aluno:
             alunos) {
            System.out.println(aluno.getNome());
        }


    }

    private List<Aluno> obterAluno(List<Aluno> listaDeAlunos) {
        ObterAluno obterAluno = new ObterAluno();
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(obterAluno.novoAluno());
        return alunos;
    }

    public List<Aluno> getListaDeAlunos() {
        Mock mock = new Mock();
        List<Aluno> alunos;
        alunos = mock.getMockdeAlunos();

        return alunos;
    }
}
