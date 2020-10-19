package br.com.crudelis.modelCerto;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {

		/* TESTES */

		/* Adicionando Alunos às Matérias */
		/* Funcionários devem lançar os dados cadastrais abaixo */

		Materia dados = new Materia("Governança da TI", 01, 85);
		dados.setNomePessoa("Bruno C. Manso");
		dados.setNascimento("30/10/1980");
		dados.setCurso("Análise e Desenvolvimento de Sistemas");
		dados.setIdAluno(590);

		/* Alterando o status do aluno */
		/* O professor deverá lançar dados de presença e notas ao Aluno */

		Double N1 = 100.0;
		Double N2 = 100.0;
		int presenca = 85;

		/* Verifica o escopo dos numerais a serem digitados */

		VerificaInputs verificacao = new VerificaInputs();

		if (verificacao.VerificaN1(N1) == false) {
			System.out.println("A nota N1 deve estar entre 0.0 e 100.0 - Inserido: " + N1);
		}

		else if (verificacao.VerificaN2(N2) == false) {
			System.out.println("A nota N2 deve estar entre 0.0 e 100.0 - Inserido: " + N2);
		}

		else if (verificacao.VerificaFrequencia(presenca, dados.getCargaHoraria()) == false) {
			System.out.println("As presencas devem ser números inteiros entre 0 e " + dados.getCargaHoraria());
		
			
		/* Passando pelas verificações das condicionais acima: */
			
		} else {

			dados.setNotaN1(N1);
			dados.setNotaN2(N2);

			dados.setPresencas(presenca);
			dados.setStatus("");

			ModificaStatus novoStatus = new ModificaStatus();
			dados.setStatus(novoStatus.CalculaNota(dados.getNotaN1(), dados.getNotaN2(), dados.getPresencas(),
					dados.getCargaHoraria()));

			/* Reunindo objeto do tipo aluno dentro de um Array de Alunos */

			ArrayList<Materia> registros = new ArrayList<Materia>();
			registros.add(dados);

			/* Imprimindo array de Alunos */

			System.out.println("  -- Registro de Alunos -- \n");
			for (int i = 0; i < registros.size(); i++) {
				System.out.println("Registro: 00" + (i + 1));
				System.out.println("Nome: " + registros.get(i).getNomePessoa());
				System.out.println("Matricula: " + registros.get(i).getIdAluno());
				System.out.println("Nascimento: " + registros.get(i).getNascimento());
				System.out.println("Curso: " + registros.get(i).getCurso());
				System.out.println("ID da Materia 00:" + registros.get(i).getIdMateria());
				System.out.println("Materia: " + registros.get(i).getNomeMateria());
				System.out.println("Frequencia: " + registros.get(i).getPresencas() + "/" + registros.get(i).getCargaHoraria());
				System.out.println("Nota N1: " + registros.get(i).getNotaN1());
				System.out.println("Nota N2: " + registros.get(i).getNotaN2());
				System.out.println("Status: " + registros.get(i).getStatus());
				System.out.println();
			}
		}
	}
}
