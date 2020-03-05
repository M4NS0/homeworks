package parte1;
import java.util.Scanner;

public class Exercicio6 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);

		float valordaConta;
		int diasdeAtraso;
		float valordaMulta;
		float valordosJuros;
		float total;

		System.out.println("Digite o valor da Conta: ");
		valordaConta = leia.nextFloat();

		System.out.println("Digite o números de Dias de Atraso ");
		diasdeAtraso = leia.nextInt();

		System.out.println("Digite o valor da Multa ");
		valordaMulta = leia.nextFloat();

		System.out.println("Digite o valor dos Juros: ");
		valordosJuros = leia.nextFloat();

		total = valordaConta + ((valordaConta * (valordosJuros / 100)) * diasdeAtraso) + (valordaMulta);

		System.out.println("Valor da  Conta: " + valordaConta);
		System.out.println("Dias de  Atraso: " + diasdeAtraso);
		System.out.println("Valor da  Multa: " + valordaMulta);
		System.out.println("Valor dos Juros: " + valordosJuros);
		System.out.println("Total  a  pagar: " + total);
	}
}
