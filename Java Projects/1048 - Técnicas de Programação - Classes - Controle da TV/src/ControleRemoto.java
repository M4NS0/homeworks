import java.util.Scanner;

// Crie uma classe classeControleRemoto que pode 
// controlar o volume e trocar os canais da televisão.
public class ControleRemoto {
	static Scanner leia = new Scanner(System.in);
	
	static public int Escolha() {
		System.out.println(" ###### Menu do Controle #####\n");
		System.out.println("1. Aumentar Volume\n"
						+ "2. Diminuir Volume\n"
						+ "3. Aumentar Canal\n"
						+ "4. Diminuir Canal\n"
						+ "5. Trocar para canal\n"
						+ "6. Consultar\n"
						+ "7. Sair"
						+ "\n\nEscolha:");
		
		int n = leia.nextInt();
		return n;
		
	}
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		int n = 0;
		do {
			n = Escolha();
			switch(n) {
			case 1:
				tv.aumentarVolume();
				
				break;
			case 2:
				tv.diminuirVolume();
				break;
			case 3:
				tv.aumentarCanal();
				break;
			case 4:
				tv.diminuirCanal();			
				break;
			case 5:
				System.out.println("Digite:");
				int canal = leia.nextInt();
				tv.setCanal(canal);
				break;
			case 6:
				System.out.println("\n"	+ "\n|Volume: " + tv.getVolume() + " |\n| Canal: " +  tv.getCanal() + "|\n\n");
				break;
			case 7:
				System.out.println("Don't touch that dial!");
			}
		} while (n != 7);
	}

	
}
