package App;

import models.Aluno;
import services.GetAluno;
import services.Mock;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Mock mock = new Mock();
        List<Aluno> alunos = new ArrayList<>();
        alunos = mock.getMockdeAlunos();

        GetAluno getAlunoInMock = new GetAluno();
//        alunos = getAlunoInMock.novoAluno

    }
}
