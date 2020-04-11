package Mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	public static String Escolha() {
		System.out.println("\n--------------------------\n");
		System.out.println(" [A]diciona produtos");
		System.out.println(" [V]er produtos");
		System.out.println(" [C]onsulta Valor");
		System.out.println(" [S]air");
		System.out.println("\n--------------------------\n");
		System.out.print(" Escolha:");
		
		String e;
		return e = leia.next();
	}
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		System.out.println("\n\n---------Cadastro-----------\n");
		System.out.print(" Digite o nome do estabelecimento: ");
		Mercado m1 = new Mercado(leia.next());
		String e = "";
		
		do {
			switch (e=Escolha().toLowerCase()) {
			
			case "a":
				System.out.print(" Insira o nome do produto: ");
				String nome = leia.next();
				System.out.print(" Insira o valor de " + nome + ": ");
				Produto p1 = new Produto(nome, leia.nextDouble());
				lista.add(p1);
				m1.setListaProdutos(lista);
				break;
				
			case "v":
				m1.verProdutos();
				break;
				
			case "c":
				System.out.print(" Insira o nome do produto que deseja consultar o valor: ");
				m1.consultaValor(leia.next());
				break;
				
			case "s": 
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("Bye bye Jonny");
				System.exit(0);
			}
			
		} while (!e.equalsIgnoreCase("a")||!e.equalsIgnoreCase("v")||!e.equalsIgnoreCase("c")|| !e.equalsIgnoreCase("s"));
		

	}

}
