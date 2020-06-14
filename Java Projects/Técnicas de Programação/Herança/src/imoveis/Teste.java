package imoveis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha3() {
		System.out.print("\nDeseja Visualizar a Lista de Imóveis [V]elhos ou [N]ovos ou [A]mbos:");
		String e = leia.next().toLowerCase();
		return e;
	}

	public static String Escolha2() {
		System.out.print("\nO imóvel é [V]elho ou [N]ovo?");
		String e = leia.next().toLowerCase();
		return e;
	}

	public static String Escolha() {
		System.out.println("\n\n~~~~~~Cadastro de Imóveis~~~~~~\n");
		System.out.print("[C]adastrar Imóvel\n" 
						+ "[I]mprimir\n" 
						+ "[S]air\n\n" 
						+ "Escolha: ");
		String e = leia.next().toLowerCase();
		return e;
	}

	public static void main(String[] args) {
		List<String> imoveisVelhos = new ArrayList<String>();
		List<String> imoveisNovos = new ArrayList<String>();
		Velho velho;
		Novo novo;
		String e = "";
		String e2 = "";
		String e3 = "";
		do {
			e = Escolha();
			switch (e) {
			case "c":
				System.out.print("Endereço:");
				String end = leia.next();
				System.out.print("Valor:");
				Double pre = leia.nextDouble();
				e2 = Escolha2();
				switch (e2) {
				case "v":
					System.out.println("Porcentagem de Desconto:");
					Double desc = leia.nextDouble();
					velho = new Velho(end, pre, desc);
					velho.desconta();
					imoveisVelhos.add(velho.getString());
					break;

				case "n":
					System.out.println("Valor do Acrécimo:");
					novo = new Novo(end, pre, leia.nextDouble());
					novo.acrescenta();
					imoveisNovos.add(novo.getString());
					break;
				}
				break;
			case "i":
				e3 = Escolha3().toLowerCase();
				switch (e3) {
				case "v":
					for (int i = 0; i < 100; i++) {
						System.out.println();
					}
					System.out.println("\n-----Imóveis Velhos-----\n");
					for (int i = 0; i < imoveisVelhos.size(); i++) {
					System.out.println(imoveisVelhos.get(i)); 
					}
					break;
					
				case "n":
					for (int i = 0; i < 100; i++) {
						System.out.println();
					}
					System.out.println("\n-----Imóveis Novos-----");
					for (int j = 0; j < imoveisNovos.size(); j++) {
					System.out.println(imoveisNovos.get(j));

					}
					break;
					
				case "a":
					for (int i = 0; i < 100; i++) {
						System.out.println();
					}
					System.out.println("\n-----Imóveis Velhos-----");
					for (int l = 0; l < imoveisVelhos.size(); l++) {
						System.out.println(imoveisVelhos.get(l));
					}
			
					System.out.println("\n-----Imóveis Novos-----");
					for (int t = 0; t < imoveisNovos.size(); t++) {
						System.out.println(imoveisNovos.get(t));
					}
					break;
				}
				break;
			case "s": 
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("Hasta!");
				System.exit(0);
				break;
			}

		} while (!e.equalsIgnoreCase("s") || !e.equalsIgnoreCase("c") || !e.equalsIgnoreCase("v"));

	}

}
