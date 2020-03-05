package parte1;
import java.util.Scanner;

public class Exercicio8 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		float largura;
		float altura;
		float totaldeLuz;
		
		System.out.println("Digite a Largura do cômodo: ");
		largura = leia.nextFloat();
		System.out.println("Digite a Altura do cômodo: ");
		altura = leia.nextFloat();
		
		totaldeLuz = (largura*altura)*18; 
		System.out.println("As luzes do cômodo devem ter " + totaldeLuz + "W de potência");
	}

}
