import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		String e;
		System.out.print("\n----------------------------\n" 
				+ " [C]onfigurar o tamanho da fila\n" 
				+ " [E]nfilera\n"
				+ " [D]esenfilera\n"
				+ " [I]mprime Fila\n"
				+ " [S]air\n" + "---------------------------\n"
				+ "\n\n Escolha: ");
		
		e = leia.next();
		return e;
	}

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pessoa nova = null;
		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "c":
				System.out.print(" Digite o tamanho da fila:");
				fila.setTamanho(leia.nextInt());
				break;
			case "e":
				nova = new Pessoa();
				System.out.print(" Digite o nome:");
				nova.setNome(leia.next());
				
				//System.out.print("Digite a matricula:"); nova.setNome(leia.next());
				//System.out.print("Digite o telefone:"); nova.setNome(leia.next());
				
				if (fila.enfileirar(nova) == true)
					System.out.println(" Pessoa incluida na fila");
				else {
					System.out.println(" Pessoa não foi incluida, lista cheia");
				}
				break;
			case "d":
				if ((nova = fila.desenfileirar()) == null)
					System.out.println(" Impossível desenfileirar");
				else {
					System.out.println(nova.getPessoa());
				}
				break;
			case "i":
				fila.imprime();
			}

		} while (!e.equalsIgnoreCase("c")||!e.equalsIgnoreCase("e")||!e.equalsIgnoreCase("d")||!e.equalsIgnoreCase("i")||!e.equalsIgnoreCase("s"));

	}

}
