import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);

	public static int Menu() {
		System.out.print("\n [1] Adicionar\n [2] Listar\n [9] Sair\n\n Escolha:");
		int m = leia.nextInt();
		return m;
	}

	public static String Menu2(String[] letras) {
		System.out.print("\n [A]luno\n [P]rofessor \n\n Escolha:");
		String m = leia.next();
		return Tratamento(m, letras);

	}

	public static Professor ObterProfessor() {
		System.out.print(" Digite o nome:");
		String nome = leia.next();
		System.out.print(" Digite o cpf:");
		String cpf = leia.next();
		System.out.print(" Digite o codigo:");
		int codMateria = leia.nextInt();
		Professor p = new Professor(nome, cpf, codMateria);
		return p;

	}

	public static Aluno ObterAluno() {
		System.out.print(" Digite o nome:");
		String nome = leia.next();
		System.out.print(" Digite o cpf:");
		String cpf = leia.next();
		System.out.print(" Digite a matricula:");
		int matricula = leia.nextInt();
		Aluno a = new Aluno(nome, cpf, matricula);
		return a;

	}

	private static String Tratamento(String m, String[] letras) { // tratamento de exceção
		try {
			Character caractere = m.charAt(0);

			if (Character.isDigit(caractere)) {
				throw new Exception("\nNão pode conter números\n");
			}
			String aux = null;
			for (int i = 0; i < letras.length; i++) {
				if (m.equalsIgnoreCase(letras[i])) {
					aux = letras[i];
					return aux;
				} else {
					aux = null;
				}
			}
			if (aux == null)
				throw new Exception("\nLetra não existe no menu\n");

		} catch (Exception e) {
			System.out.println();
			System.err.println(e);
			System.out.println();
		}
		return m;
	}

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		int m1 = 0;
		String m = "";
		do {
			switch (m1 = Menu()) { // podia ter criado uma exceção aqui... :S
			case 1:
				String[] letras = { "a", "p" }; // mas criei so pra letras msm proffs
				System.out.println(" Deseja adicionar aluno ou professor?");
				switch (m = Menu2(letras)) {
				case "a":
					lista.add(ObterAluno());
					break;
				case "p":
					lista.add(ObterProfessor());
					break;
				}
				break;
			case 2:
				imprimeDados(lista);
				break;
			case 9:
				System.out.println(" Arrivederci!");
				break;
			}

		} while (m1 != 9);
	}

	private static void imprimeDados(List<Pessoa> lista) {
		int i = 0;
		for (i = 0; i < lista.size(); i++) {
			if (Aluno.class.isInstance(lista.get(i))) { // operador para comparar o objeto com a classe
				Aluno a = (Aluno) lista.get(i); // downcasting
				a.listar();

			}
			if (Professor.class.isInstance(lista.get(i))) {
				Professor p = (Professor) lista.get(i);
				p.listar();
			}
		}
	}
}
