package br.com.crudelis.persistence;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.crudelis.model.Aluno;


public class SalvarCsv {
	String home = System.getProperty("user.home");
	public static final String caminhoParaAlunos = "listaDeAlunos.csv";
	public static final String caminhoParaProfessores = "listaDeProfessores.csv";
	public static final String caminhoParaFuncionarios = "listaDeFuncionarios.csv";

	public void adcionarAlunoAoCsv(Aluno aluno) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(home + "/Crudelis.academico/logs/" + caminhoParaAlunos, true))) {
			bw.write(aluno.getNomePessoa() + "," + aluno.getCurso() + "," + aluno.getNascimento()  +  "," +  aluno.getIdAluno());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}