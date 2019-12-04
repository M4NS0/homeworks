package interfaces2;

import java.util.ArrayList;
import java.util.Scanner;



public class Escola {
	
	static Scanner leia = new Scanner(System.in);
	private static int op = -1;
	static ArrayList<Profissional> lista = new ArrayList<Profissional>();
	static Profissional profissional;

	public static void main (String Args[] ) {
	
		Menu();
	}
	private static void Menu() {
		System.out.println("\nDeseja inserir um novo professor, \nse não digite 0 para imprimir relatório: "
				+ "\n1- Professor de Português"
				+ "\n2- Professor de Informática"
				+ "\n3- Professor de Matemática"
				+ "\n4- Professor Completo"
				+ "\n5- Diretor"
				+ "\n0- Imprime Relatório e sai do programa"
				+ "\nEscolha:");
		op = leia.nextInt();
		
		if (op == 1) {
			MenuProfessorPortugues();
			Menu();
		}
		if (op == 2) {
			MenuProfessorInformatica();
			Menu();
		}
		if (op == 3) {
			MenuProfessorMatematica();
			Menu();
		}
		if (op == 4) {
			MenuProfessorCompleto();
			Menu();
		}
		if (op == 5) {
			MenuDiretor();
			Menu();
		}
		if (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 && op !=0 ) {
			System.out.println("\nOpção inválida!\nDeseja inserir um novo professor, \nse não digite 0 para imprimir relatório: "
					+ "\n1- Professor de Português"
					+ "\n2- Professor de Informática"
					+ "\n3- Professor de Matemática"
					+ "\n4- Professor Completo"
					+ "\n5- Diretor"
					+ "\n0- Imprime Relatório e sai do programa"
					+ "\nEscolha:");
			op = leia.nextInt();
		}
		if (op == 0) {
			Imprime();
			Menu();
		}
	}

	private static void Imprime() {
		//System.out.println(lista);
		
		String texto = "";
		for (int i = 0; i < lista.size(); i ++) {
		texto += lista.get(i).toString() + "\n";
		
		}
		System.out.println(texto);
	}
	private static void MenuDiretor() {
		
		profissional = new Diretor();
		System.out.println("Insira o nome: ");
		String nome = leia.next();
		System.out.println("Insira a escolaridade:");
		String escolaridade = leia.next();
		
		profissional.Setnome(nome);
		profissional.SetEscolaridade(escolaridade);
		
		lista.add(profissional);
		
	
	}
	
	private static void MenuProfessorCompleto() {
		System.out.println("Insira o nome: ");
		String nome = leia.next();
		System.out.println("Insira a escolaridade:");
		String escolaridade = leia.next();
		
		profissional = new ProfCompleto();
		profissional.Setnome(nome);
		profissional.SetEscolaridade(escolaridade);
		lista.add(profissional);
	
		
	}
	private static void MenuProfessorMatematica() {
		System.out.println("Insira o nome: ");
		String nome = leia.next();
		System.out.println("Insira a escolaridade:");
		String escolaridade = leia.next();
		
		profissional = new ProfMatematica();
		profissional.Setnome(nome);
		profissional.SetEscolaridade(escolaridade);
		lista.add(profissional);

		
	}

	private static void MenuProfessorInformatica() {
		System.out.println("Insira o nome: ");
		String nome = leia.next();
		System.out.println("Insira a escolaridade:");
		String escolaridade = leia.next();
		
		ProfInformatica p1 = new ProfInformatica();
		p1.Setnome(nome);
		p1.SetEscolaridade(escolaridade);
		lista.add(p1);

		
	}

	private static void MenuProfessorPortugues() {
		System.out.println("Insira o nome: ");
		String nome = leia.next();
		System.out.println("Insira a escolaridade:");
		String escolaridade = leia.next();
		
		profissional = new ProfPortugues();
		profissional.Setnome(nome);
		profissional.SetEscolaridade(escolaridade);
		lista.add(profissional);

		
	}
}
