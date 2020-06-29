package marcasdeCarro;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	static Carro carroFiat;
	static Carro carroVolks;
	static Carro carroKia;

	public static int Escolha() {

		System.out.println("\n__________________________________________\n" 
						 + "\n1. Inserir carro"
						 + "\n2. Ver o menor valor dos carros cadastrados" 
						 + "\n3. Sair"
						 + "\n__________________________________________\n");
		
		int n = leia.nextInt();
		return n;
	}

	public static void main(String[] args) {
		Object[] fiat = new Object[4];
		Object[] volks = new Object[4];
		Object[] kia = new Object[4];
		int n = 0;

		do {
			n = Escolha();

			String marca;
			String modelo;
			double valor;

			switch (n) {
			case 1:
				System.out.println("Digite a Marca:");
				marca = leia.next();
				System.out.println("Digite o modelo:");
				modelo = leia.next();
				System.out.println("Digite o valor: ");
				valor = leia.nextDouble();

				if (marca.equalsIgnoreCase("Fiat")) {
					fiat[1] = marca;
					fiat[2] = modelo;
					fiat[3] = valor;
					carroFiat = new Carro(marca, modelo, valor);
					carroFiat.setMarca(marca);
					carroFiat.setModelo(modelo);
					carroFiat.setValor(valor);
					//System.out.println(carroFiat); // debugando metodo toString
					break;
				}
				if (marca.equalsIgnoreCase("Volks") || marca.equalsIgnoreCase("VolksWagen")) {
					volks[1] = marca;
					volks[2] = modelo;
					volks[3] = valor;
					carroVolks = new Carro(marca, modelo, valor);
					carroVolks.setMarca(marca);
					carroVolks.setModelo(modelo);
					carroVolks.setValor(valor);
					//System.out.println(carroVolks); // debugando metodo toString
					break;
				}
				if (marca.equalsIgnoreCase("Kia")) {
					kia[1] = marca;
					kia[2] = modelo;
					kia[3] = valor;
					carroKia = new Carro(marca, modelo, valor);
					carroKia.setMarca(marca);
					carroKia.setModelo(modelo);
					carroKia.setValor(valor);
					//System.out.println(carroKia); // debugando metodo toString
					break;
				
				} else {
					System.out.println("Esta marca não está cadastrada! escolher: Volkswagen, Fiat ou Kia");
					break;

				}
						
			case 2:
				double valorFiat  = (double) fiat[3];
				double valorVolks = (double) volks[3];
				double valorKia   = (double) kia[3];

				if ((valorFiat < valorVolks) && (valorFiat < valorKia)) {
					System.out.println(carroFiat.getMarca() 
							+ " " + carroFiat.getModelo() 
							+ " é o carro mais barato custando " 
							+ valorFiat + " R$");

				} else if ((valorVolks < valorFiat) && (valorVolks < valorKia)) {
					System.out.println(carroVolks.getMarca() 
							+ " " + carroVolks.getModelo() 
							+ " é o carro mais barato custando " 
							+ valorVolks + " R$");

				} else if ((valorKia < valorFiat) && (valorKia < valorVolks)) {
					System.out.println(carroKia.getMarca() 
							+ " " + carroKia.getModelo() 
							+ " é o carro mais barato custando " 
							+ valorKia + " R$");
				}
				break;
			case 3:
				System.out.println("Bye bye, Johny!");
			}

		} while (n != 3);

	}

}
