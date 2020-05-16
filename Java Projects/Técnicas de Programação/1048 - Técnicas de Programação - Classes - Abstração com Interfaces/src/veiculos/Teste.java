package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	public static ArrayList<Veiculo> lista;
	private static Carro carro;
	
	private static Veiculo ObterCarro() {
		System.out.print(" Tipo: ");
		String tipo = leia.next();
		System.out.print(" Motor: ");
		String motor = leia.next();
		System.out.print(" Kms: ");
		double km = leia.nextDouble();
		carro = new Carro(tipo, motor, km);
		return carro;
		
	}
	
	public static int EscolhaVeiculo() {
		System.out.println("\n 1. Carro");
		System.out.println(" 2. Barco");
		System.out.println(" 3. Bicicleta\n");
		System.out.print(" Escolha: ");
		int ev = leia.nextInt();
		return ev;
	}

	public static void main(String[] args) {
		System.out.print(" Informe a quantidade de veiculos que deseja criar: ");
		int quantidade = leia.nextInt();
		
		ArrayList<Veiculo> Lista = new ArrayList<Veiculo>();
		
		for (int i = 0; i < quantidade; i++) {
			int ev = 0;
			do {
				switch (ev = EscolhaVeiculo()) {
				
				case 1:
					Lista.add(ObterCarro());					
					break;
				
				}

			} while (i == quantidade);
			System.out.println("Imprimindo lista");
			System.out.println(" Carros:");
			carro.CalculaCo2();
		}

	}

}
