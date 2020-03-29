import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n-------------------------\n" 
					+ "(I)nserir nome\n" 
					+ "(V)isualizar\n" + "(S)air"
					+ "\n-------------------------\n");
		String escolha = leia.next();
		return escolha;
	}

	public static void main(String[] args) {
		
		// professor, deu certo na mesma logica do exercicio, os anteriores não estão setando
		// os arrays com as devidas classes, estão setadas em array de String normais,
		// apartir desse irei arrumar os anteriores e envio novamente assim que terminar
		// acredito que a explicação do ultimo exercicio tenha ajudado na elaboração
		
		String escolha = "";
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		ArrayList<Materia> listaMateria = new ArrayList<Materia>();
		String aux1 = "";
		String aux2 = "";
		Materia estruturadeDados = new Materia("Estrutura de Dados");
		listaMateria.add(estruturadeDados);
		Materia tecnicasdeProgramacao = new Materia("Técnicas de Programação");
		listaMateria.add(tecnicasdeProgramacao);
		Materia projetodeBD = new Materia("Projeto de Banco de Dados");
		listaMateria.add(projetodeBD);

		do {
			escolha = Escolha();
			switch ((escolha).toLowerCase()) {
			case "i":
				for (int i = 0; i < 4; i++) {
					System.out.println("Digite o nome: ");
					String nome = leia.next();
					Aluno aluno = new Aluno(nome, listaMateria);
					listaAlunos.add(aluno);
				}
				break;
			case "v":
				System.out.println("---Lista de Alunos---");
				for (int i = 0; i < listaAlunos.size(); i++) {
					aux1 = listaAlunos.get(i).getNomeAluno();
					aux2 = listaMateria.get(0).getNomeMateria() + " - ";
					aux2 = aux2 + listaMateria.get(1).getNomeMateria() + " - ";
					aux2 = aux2 + listaMateria.get(2).getNomeMateria();
					System.out.println(aux1 + " - " + aux2);
				}
				break;
			case "s":
				System.exit(0);
			}

		} while (!escolha.equalsIgnoreCase("i") || !escolha.equalsIgnoreCase("v") || !escolha.equalsIgnoreCase("s"));

	}

}
