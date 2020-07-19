package corrigidos;

import java.util.Scanner;

public class Lista1 {
	private static Scanner leia;

	public static void main(String[] args) {

		// Declaracao de Variaveis
		// String = literal
		String nome, endereco, email, fone;
		leia = new Scanner(System.in);

		// Leitura de Dados
		// system out print = escreva
		System.out.print("Digite o nome da pessoa: ");
		// leia.next() = leia
		// = atribuicao <-
		nome = leia.nextLine();

		System.out.print("Digite o endereco da pessoa: ");
		endereco = leia.next();

		System.out.print("Digite o email da pessoa: ");
		email = leia.next();

		System.out.print("Digite o fone da pessoa: ");
		fone = leia.next();

		// impressao de dados
		System.out.println("o nome digitado foi: " + nome);
		System.out.println("o endereco digitado foi: " + endereco);
		System.out.println("o email digitado foi: " + email);
		System.out.println("o fone digitado foi: " + fone);

		System.out.println("\n\nExercicio 6 ");
		int v1, v2, v3;
		float calc1, calc2, calc3, calc4;

		System.out.println("Escreva o primeiro valor: ");
		v1 = leia.nextInt();

		System.out.println("Escreva o segundo valor: ");
		v2 = leia.nextInt();

		System.out.println("Escreva o terceiro valor: ");
		v3 = leia.nextInt();


		calc1 = (float) Math.sqrt(v1);
		calc2 = v2 * 10;
		calc3 = v3 - 1;
		calc4 = calc1 + calc2 + calc3;

		System.out.println("A raiz quadratica do primeiro numero é: " + calc1);
		System.out.println("O segundo valor digitado multiplicado por dez é: " + calc2);
		System.out.println("O terceiro valor digitado menos um é: " + calc3);
		System.out.println("O quarto valor sera a soma dos resultados anteriores: " + calc4);

		System.out.println("\n\nExercicio 7 ");

		int km, milha;
		System.out.println("Digite o valor a ser convertido para quilometros: ");
		milha = leia.nextInt();
		km = (milha * 1852) / 1000;
		
		System.out.println("O valor das milhas em quilometros é: " + km);
		
		System.out.println("\n\nExercicio 8 ");

		int U, R, i;

		System.out.println("Digite o valor da resistência: ");
		R = leia.nextInt();
		System.out.println("Digite o valor da corrente: ");
		i = leia.nextInt();
		U = R * i;
		System.out.println("O valor da resistencia será: " + U);
		
		System.out.println("\n\nExercicio 9 ");
		
		int D, Cot;
		System.out.println("Escreva o valor em Dolares para a conversão em reais: ");
		D = leia.nextInt();
		System.out.println("Escreva o valor da cotação do dollar do dia de hoje: ");
		Cot = leia.nextInt();
		R = D * Cot;
		System.out.println("O valor convertido em reais é de: " + R);

		System.out.println("\n\nExercicio 10 ");
		
		int p1, p2, p3, p4, p5, som, pag, tro;
			
		System.out.println("Escreva o valor do primeiro produto: ");
		p1 =  leia.nextInt();

		System.out.println("Escreva o valor do segundo produto: ");
		p2 =  leia.nextInt();

		System.out.println("Escreva o valor do terceiro produto: ");
		p3 =  leia.nextInt();

		System.out.println("Escreva o valor do quarto produto: ");
		p4 =  leia.nextInt();

		System.out.println("Escreva o valor do quinto produto: ");
		p5 =  leia.nextInt();
		
		System.out.println("Escreva o valor do pagamento efetuado: ");
		pag =  leia.nextInt();

		som = p1 + p2 + p3 + p4 + p5;
		tro = pag - som;
		
		System.out.println("A soma dos valores pagos é de: " + som);
		System.out.println("O troco correspondente ao valor total menos o valor pago é de: " + tro);
	}
}
