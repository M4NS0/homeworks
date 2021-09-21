package services;

import models.Aluno;

public class Fabrica {
    public static Aluno getAluno() {
        return new Aluno();
    }
}
