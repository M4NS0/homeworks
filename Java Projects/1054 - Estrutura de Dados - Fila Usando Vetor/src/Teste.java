import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		String e;
		System.out.println("\n----------------------------\n" 
				+ "[E]nfilera\n" 
				+ "[D]esenfilera\n"
				+ "[C]onsulta primeiro e último elemento\n" 
				+ "[V]isualiza Fila\n" 
				+ "[S]air\n" + "---------------------------\n");
		e = leia.next();
		return e;
	}

	public static void main(String[] args) {
		FilaCircular fila = new FilaCircular();
		Pessoa pessoa = new Pessoa();
		fila.criaFila();
		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "e":
				
				System.out.print("Insira o nome:");
				pessoa.setNome(leia.next());
				System.out.print("Insira o matricula:");
				pessoa.setMatricula(leia.next());
				System.out.print("Insira o Telefone:");
				pessoa.setTelefone(leia.next());
				System.out.println(fila.enfilera(pessoa));
				
				break;
				
			case "d":
				fila.desenfilera();
				System.out.println("Excluída com sucesso!");
				break;
				
			case "c":
				System.out.println(fila.consultaFila());
				break;
				
			case "v":
				fila.exibeFila();
				break;
				
			}

		} while (e != "s");
		System.exit(0);
	}

}
