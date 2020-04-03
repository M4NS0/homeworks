import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		String e;
		System.out.println("\n------------------\n" 
				+ "[I]nsere na Fila\n" 
				+ "[E]xclui primeiro da fila\n"
				+ "[C]onsulta Fila\n" 
				+ "[V]isualiza Fila\n" 
				+ "[S]air\n" + "------------------\n");
		e = leia.next();
		return e;
	}

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pessoa pessoa = new Pessoa();
		fila.criaFila();
		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "i":
				System.out.printf("Insira o nome:");
				pessoa.setNome(leia.next());
				fila.insereFila(pessoa);
				
				break;
			case "e":
				fila.excluiFila();
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
