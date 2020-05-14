import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		AdivinhaNumero jogo = new AdivinhaNumero();
		Scanner leia = new Scanner(System.in);
		int i, n = 5;

		for (i = 1; i <= n; i++) {
			System.out.println("Qual é o número sorteado?");
			if (jogo.dica(leia.nextInt()) == true) break;
				

		}
		
		System.out.println("O numero era: " + jogo.getNumero());
		leia.close();
	}
	

}
