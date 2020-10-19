package br.com.crudelis.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.crudelis.model.Aluno;
import br.com.crudelis.model.Funcionario;

public class SalvarCsv {
	String home = System.getProperty("user.home");
	public static final String caminhoParaAlunos = "listaDeAlunos.csv";
	public static final String caminhoParaProfessores = "listaDeProfessores.csv";
	public static final String caminhoParaFuncionarios = "listaDeFuncionarios.csv";

	public void adcionarAlunoAoCsv(Aluno aluno) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(home + "/Crudelis.academico/logs/" + caminhoParaAlunos, true))) {
			bw.write(aluno.getNome() + "," + aluno.getRegistoDoAlunos() + "," + aluno.getEmail() + ","
					+ aluno.getDataDeNascimento() + "," + aluno.getCurso());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void adcionarProfessorAoCsv(Funcionario professor) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(home + "/Crudelis.academico/logs/"+ caminhoParaProfessores, true))) {
			bw.write(professor.getNome() + "," + professor.getEmail() + "," + professor.getDataDeNascimento() + ","
					+ professor.getCnh() + "," + professor.getCargo());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void adcionarFuncionarioAoCsv(Funcionario funcionario) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(home + "/Crudelis.academico/logs/" + caminhoParaFuncionarios, true))) {
			bw.write(funcionario.getNome() + "," + funcionario.getEmail() + "," + funcionario.getDataDeNascimento()
					+ "," + funcionario.getCnh() + "," + funcionario.getCargo());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}