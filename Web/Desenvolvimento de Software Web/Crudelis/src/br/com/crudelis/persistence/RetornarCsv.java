package br.com.crudelis.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.com.crudelis.model.Aluno;

public class RetornarCsv {
	public static String home = System.getProperty("user.home");
	public static final String caminhoParaAlunos = "listaDeAlunos.csv";
	public static final String caminhoParaProfessores = "listaDeProfessores.csv";
	public static final String caminhoParaFuncionarios = "listaDeFuncionarios.csv";

	public static List<Aluno> getListaDeAlunos() {

		List<Aluno> alunos = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(home + "/Crudelis.academico/logs/" + caminhoParaAlunos))) {

			String line = br.readLine();

			while (line != null) {
				String[] campos = line.split(",");
				Aluno aluno = new Aluno();
				aluno.setNomePessoa(campos[0]);
				aluno.setCurso(campos[1]);
				aluno.setNascimento(campos[2]);
				aluno.setIdAluno(Integer.parseInt(campos[3]));
				alunos.add(aluno);
				line = br.readLine();
			}
			br.close();
			return alunos;

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return null;
	}
}