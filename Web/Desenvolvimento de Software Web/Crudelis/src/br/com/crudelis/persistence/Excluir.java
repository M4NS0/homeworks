package br.com.crudelis.persistence;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.com.crudelis.model.Aluno;

public class Excluir {

	public static final String home = System.getProperty("user.home");
	public static final String caminhoParaAlunos = "listaDeAlunos.csv";
	public static final String caminhoParaProfessores = "listaDeProfessores.csv";
	public static final String caminhoParaFuncionarios = "listaDeFuncionarios.csv";


	public void apagarElementoDaLista(Aluno aluno) {

		List<Aluno> listaDeAlunos = RetornarCsv.getListaDeAlunos();
		listaDeAlunos.remove(aluno);

		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter(home + "/Crudelis.academico/logs/" + caminhoParaAlunos))) {
			for (Aluno e : listaDeAlunos) {
				bw.write(e.getNomePessoa() + "," + e.getCurso() + "," + e.getNascimento() +  ","+ e.getIdAluno());
				bw.newLine();
				bw.close();
			}
		} catch (IOException f) {
			System.out.println("Erro: " + f.getMessage());
		}
	}
}
