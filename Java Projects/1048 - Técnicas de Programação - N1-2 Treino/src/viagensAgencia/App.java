package viagensAgencia;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Pacote> lista = new ArrayList<Pacote>();
		System.out.println("\n ----- CADASTRO -----\n");
		System.out.print("Insira o Destino: ");
		String destino = leia.next();
		System.out.print("Insira o Valor: ");
		double valor = leia.nextDouble();

		Pacote pacotePraia = new ServicoMassagem(new ServicoBebidas(new PacotePraia(destino, valor)));
		lista.add(pacotePraia);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\nDestino: " + pacotePraia.getDescricao());
			System.out.println("Valor: " + pacotePraia.getPreco());
		}

	}
}
