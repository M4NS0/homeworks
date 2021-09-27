package services;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static List<Aluno> getMockdeAlunos() {
        List<Aluno> lista = new ArrayList<>();
        Aluno aluno = Fabrica.getAluno();
        aluno.setNome("Dwight Schrute");
        aluno.setMatricula(2020092309);
        aluno.setN1(95.5f);
        aluno.setN2(98.3f);
        lista.add(aluno);

        aluno = Fabrica.getAluno();
        aluno.setNome("Michael Scott");
        aluno.setMatricula(2020023549);
        aluno.setN1(55.5f);
        aluno.setN2(44.4f);
        lista.add(aluno);

        aluno = Fabrica.getAluno();
        aluno.setNome("Pam Beesly");
        aluno.setMatricula(2020356849);
        aluno.setN1(100.0f);
        aluno.setN2(100.0f);
        lista.add(aluno);

        return lista;
    }
}
