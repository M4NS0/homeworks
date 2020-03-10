import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite seu nome: ");
		Pessoa.setNome(leia.next());
		System.out.println("Digite a data do seu nascimento");
		Pessoa.setNascimento(leia.next());
		
		Pessoa.pegaData();
		
		Pessoa.regexAno();
		Pessoa.regexMes();
		Pessoa.regexDia();
		Pessoa.calculaRegex();
		System.out.println();
		System.out.println(Pessoa.getNome() + " tem " + Pessoa.getAnos() + " anos");
		/*
		Pessoa.substring();
		Pessoa.calculaSubstring();
		System.out.println();
		System.out.println(Pessoa.getNome() + " tem " + Pessoa.getAnos() + " anos");
		 */
	}

}
