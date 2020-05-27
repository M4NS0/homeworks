
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);


	public static void imprimirVeiculos(ArrayList<Carro> carros, ArrayList<Barco> barcos, ArrayList<Bicicleta> bicicletas) {
		System.out.println("\n  --- Imprimindo lista ---");
		System.out.println("\n\tCarros ");
		
		for (int j = 0; j < carros.size(); j++) {
			System.out.println("\n  Tipo: " + carros.get(j).getTipo() 
							 + "\n Motor: " + carros.get(j).getMotor()
							 + "\n    Km: " + carros.get(j).getKm());
			
			Carro.CalculaEmissao(carros.get(j));
		}
		
		System.out.println("\n\n\t Barcos:");
		
		for (int j = 0; j < barcos.size(); j++) {
			System.out.println("\n  Tipo: " + barcos.get(j).getTipo() 
							 + "\n Motor: " + barcos.get(j).getMotor()
							 + "\n    Km: " + barcos.get(j).getKm());
			
			Barco.CalculaEmissao(barcos.get(j));
		}
		System.out.println("\n\n\t Bicicleta:");
		
		for (int j = 0; j < bicicletas.size(); j++) {
			System.out.println("\n  Tipo: " + bicicletas.get(j).getTipo() 
							 + "\n Motor: " + bicicletas.get(j).getMotor()
							 + "\n    Km: " + bicicletas.get(j).getKm());
			
			Bicicleta.CalculaEmissao(bicicletas.get(j));
		}
		
	}
	private static Bicicleta ObterBicicleta() {
		System.out.print(" Tipo: ");
		String tipo = leia.next();
		System.out.print(" Motor: ");
		String motor = leia.next();
		System.out.print(" Kms: ");
		double km = leia.nextDouble();
		Bicicleta bicicleta = new Bicicleta(tipo, motor, km);
		return bicicleta;
	}
	
	private static Veiculo ObterBarco() {

		System.out.print(" Tipo: ");
		String tipo = leia.next();
		System.out.print(" Motor: ");
		String motor = leia.next();
		System.out.print(" Kms: ");
		double km = leia.nextDouble();
		Barco barco = new Barco(tipo, motor, km);
		return barco;

	}

	private static Veiculo ObterCarro() {

		System.out.print(" Tipo: ");
		String tipo = leia.next();
		System.out.print(" Motor: ");
		String motor = leia.next();
		System.out.print(" Kms: ");
		double km = leia.nextDouble();
		Carro carro = new Carro(tipo, motor, km);
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
	public static int Menu () {
		System.out.println("\n 1. Inserir veículos");
		System.out.println(" 2. Imprimir lista de Veiculos");
		System.out.println(" 3. Sair");
		System.out.print(" Escolha: ");
		int m = leia.nextInt();
		return m;
	}
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		ArrayList<Barco> barcos = new ArrayList<Barco>();
		ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
		int m = 0;
		
		do {
			switch (m = Menu()) {
			case 1:
				System.out.print(" Informe a quantidade de veiculos que deseja criar: ");
				int quantidade = leia.nextInt();
				for (int i = 0; i < quantidade; i++) {
					int ev = 0;
					do {
						switch (ev = EscolhaVeiculo()) {

						case 1:
							carros.add((Carro) ObterCarro());
							break;
						case 2: 
							barcos.add((Barco) ObterBarco());
							break;
						case 3:
							bicicletas.add((Bicicleta) ObterBicicleta());
							break;
						}
						
					} while (i == quantidade);
				}
				break;
			case 2:
				imprimirVeiculos(carros, barcos, bicicletas);
				break;
			case 3:
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("See you on the Dark Side of the Moon!  WOOAAAAAOOOHHH");
				System.exit(0);
				break;	
			}
						
		} while (m != 0);
	
	}
}

