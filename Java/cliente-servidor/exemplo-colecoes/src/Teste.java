import models.Aluno;
import services.Fabrica;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
    private static final List<Aluno> lista = new ArrayList<>();
    public static void main(String[] args) {
        mockandoAlunos();
        obtendoNovoAluno();
        ordenarAlfabeticamente();
        calculaNotaFinal();
        imprimeTela(montaStringComArray());
        System.exit(0);
    }

    private static void calculaNotaFinal() {
        for (Aluno aluno : lista) {
            float operation = aluno.getN1() * 0.4f + aluno.getN2() * 0.6f;
            aluno.setNotaFinal(operation);
            if (operation >= 60.0f) {
                aluno.setStatus("Aprovado");
            } else {
                aluno.setStatus("Reprovado");
            }
        }
    }

    private static void imprimeTela(String dados) {
        JFrame frame = new JFrame("JOptionPane exemplo");
        JOptionPane.showMessageDialog(frame, dados, "Lista de Alunos",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String montaStringComArray() {
        StringBuilder dados = new StringBuilder();
        for (Aluno dado : lista) {
            dados.append(dado).append("\n");
        }
        return dados.toString();
    }
    private static void ordenarAlfabeticamente() {
        Collections.sort(lista);
    }

    private static void obtendoNovoAluno() {
        Aluno aluno = Fabrica.getAluno();
        obtendoNome(aluno);
        obtendoMatricula(aluno);
        obtendoN1(aluno);
        obtendoN2(aluno);
        lista.add(aluno);
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

    private static void mockandoAlunos() {
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

    }
}
