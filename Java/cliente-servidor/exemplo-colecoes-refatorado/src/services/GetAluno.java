package services;

import models.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GetAluno {
    public static List<Aluno> novoAluno() {
        Aluno aluno = Fabrica.getAluno();
        List<Aluno> alunos = new ArrayList<>();
        obtendoNome(aluno);
        obtendoMatricula(aluno);
        obtendoN1(aluno);
        obtendoN2(aluno);
        alunos.add(aluno);
        return alunos;
    }
    private static void obtendoN2(Aluno aluno) {
        try {
            aluno.setN2(Float.parseFloat(JOptionPane.showInputDialog("Insira a nota de n2")));
        } catch (NumberFormatException e) {
            obtendoN2(aluno);
        }
    }

    private static void obtendoN1(Aluno aluno) {
        try {
            aluno.setN1(Float.parseFloat(JOptionPane.showInputDialog("Insira a nota de n1")));
        } catch (NumberFormatException e) {
            obtendoN1(aluno);
        }
    }

    private static void obtendoMatricula(Aluno aluno) {
        try {
            aluno.setMatricula(Long.parseLong(JOptionPane.showInputDialog("Insira a matricula")));
        } catch (NumberFormatException e) {
            obtendoMatricula(aluno);
        }
    }

    private static void obtendoNome(Aluno aluno) {
        aluno.setNome(JOptionPane.showInputDialog("Insira o nome"));
        if (aluno.getNome().isBlank()) {
            aluno.setNome(JOptionPane.showInputDialog("Insira o nome"));
        }
    }
}
