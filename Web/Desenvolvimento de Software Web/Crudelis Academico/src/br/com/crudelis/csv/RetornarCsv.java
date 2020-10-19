package br.com.crudelis.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.crudelis.model.Aluno;
import br.com.crudelis.model.Funcionario;

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
				Aluno aluno = new Aluno(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]), campos[4], null);
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

	public static List<Funcionario> getListaDeFuncionarios() {

		List<Funcionario> funcionarios = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(home + "/Crudelis.academico/logs/" + caminhoParaFuncionarios))) {

			String line = br.readLine();

			while (line != null) {
				String[] campos = line.split(",");
				Funcionario funcionario = new Funcionario(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						campos[4]);
				funcionarios.add(funcionario);
				line = br.readLine();
			}
			br.close();
			return funcionarios;
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return null;
	}

	public static List<Funcionario> getListaDeProfessores() {

		List<Funcionario> professores = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(home + "/Crudelis.academico/logs/" + caminhoParaProfessores))) {

			String line = br.readLine();

			while (line != null) {
				String[] campos = line.split(",");
				Funcionario professor = new Funcionario(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						campos[4]);
				professores.add(professor);
				line = br.readLine();
			}
			br.close();
			return professores;
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return null;
	}
}