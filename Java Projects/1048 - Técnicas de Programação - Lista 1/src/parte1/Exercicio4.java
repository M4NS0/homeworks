package parte1;
import java.util.Scanner;

public class Exercicio4 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		float acresMilho;
		float acresFeijao;
		float acresCafe;
		float valordeCobertura;
		float porcentagem = 3.5f;
		float total;
		
		System.out.println("Insira a quantidade de acres de Milho: ");
		acresMilho = leia.nextFloat();
		System.out.println("Insira a quantidade de acres de Feijão: ");
		acresFeijao = leia.nextFloat();
		System.out.println("Insira a quantidade de acres de Café: ");
		acresCafe = leia.nextFloat();
		
		System.out.println("Insira o valor da Cobertura por acre:  ");
		valordeCobertura = leia.nextFloat();
		
		valordeCobertura = valordeCobertura*porcentagem;
		total = valordeCobertura*(acresMilho + acresFeijao + acresCafe);
		
		System.out.println("O total do Seguro será: " + total + "R$");
		
		
	}
	

}
