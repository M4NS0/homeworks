package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	public static ArrayList<Veiculo> lista;

	public static void ObtemVeiculo(int escolha) {
		System.out.print("\n Insira o tipo: ");
		String tipo = leia.next();
		System.out.print(" Insira o motor: ");
		String motor = leia.next();
		System.out.print(" Insira a Kilometragem: ");
		double km = leia.nextDouble();
		
		do {
			if (escolha == 1) {
				ObtemCarro(tipo, motor, km);
			}
			if (escolha == 2) {
				ObtemBarco(tipo, motor, km);
			}
			if (escolha == 3) {
				ObtemBicicleta(tipo, motor, km);
			}

		} while (escolha == 1 && escolha == 2 && escolha == 3);

	}

	private static void ObtemBicicleta(String tipo, String motor, double km) {
		Veiculo novo = new Bicicleta(tipo, motor, km);
		lista.add(novo);

	}

	private static void ObtemBarco(String tipo, String motor, double km) {
		Veiculo novo = new Barco(tipo, motor, km);
		lista.add(novo);
	}

	private static void ObtemCarro(String tipo, String motor, double km) {
		Veiculo novo = new Carro(tipo, motor, km);
		lista.add(novo);

	}

	public static int Escolha2() {
		System.out.println("\n 1. Carro ");
		System.out.println(" 2. Barco");
		System.out.println(" 3. Bicicleta");
		System.out.print("\nEscolha: ");
		int e = leia.nextInt();
		return e;
	}

	public static String Escolha() {
		System.out.println("\n[I]nserir Veiculos ");
		System.out.println("[V]er lista de Veiculos");
		System.out.print("\nEscolha: ");
		String e = leia.next();
		return e.toLowerCase();
	}

	public static void main(String[] args) {
		String e1 = "";
		do {
			switch (e1 = Escolha()) {
			case "i":
				System.out.print("\n Digite quantidade de veículos que deseja cadastrar: ");
				int quantidade = leia.nextInt();

				for (int i = 0; i < quantidade; i++) {
					System.out.println("\n 1. Carro");
					System.out.println(" 2. Barco");
					System.out.println(" 3. Bicicleta");
					System.out.print("\n Escolha: ");
					ObtemVeiculo(leia.nextInt());
					
				}

				break;
			case "v":
				break;
			}
		} while (!e1.equalsIgnoreCase("d") && !e1.equalsIgnoreCase("i"));
	}
}
