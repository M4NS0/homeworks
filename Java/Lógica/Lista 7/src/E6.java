

import java.util.Scanner;

public class E6 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String voto, sexo;
		String escolha = "S";
		int a = 0, b = 0, c = 0, m = 0, h = 0;
		int idade, media = 0;
		int maisvotado = 0;
		int somaidadeA = 0;
		int somaidadeB = 0;
		int somaidadeC = 0;
		int maisvotadosHA = 0;
		int maisvotadosHB = 0;
		int maisvotadosHC = 0;
		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("\n\n____________________________\n " + "\n    ESCOLHA SEU CANDIDATO\n"
					+ "____________________________\n\n" + "  Digite 'A', 'B' ou 'C': ");
			voto = leia.next();

			System.out.println("> Qual seu sexo? 'M' ou 'H': ");
			sexo = leia.next();

			if (sexo.equalsIgnoreCase("M")) {
				m++;
			}
			if (sexo.equalsIgnoreCase("H")) {
				h++;
			}
			System.out.println("> Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nSe quiser continuar digite 'S', ou digite 'N' par exibir o relatorio");
			escolha = leia.next();

			if (voto.equalsIgnoreCase("A")) {
				a++;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHA++;
				}
			}
			if (voto.equalsIgnoreCase("B")) {
				b++;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHB++;
				}
			}
			if (voto.equalsIgnoreCase("C")) {
				c++;
				somaidadeC = somaidadeC + idade;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHC++;
				}
			}
			somaidadeA = somaidadeA + idade;
			somaidadeB = somaidadeB + idade;
			somaidadeC = somaidadeC + idade;

			if (a > b && a > c) {
				maisvotado++;
				media = somaidadeA / (a + b + c); 
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato A com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
			}
			if (b > a && b > c) {
				maisvotado++;
				media = somaidadeB / (a + b + c);
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato B com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
	
			}
			if (c > a && c > b) {
				maisvotado++;
				media = somaidadeC / (a + b + c);
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato C com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
			}
			if (maisvotadosHA > maisvotadosHB && maisvotadosHA > maisvotadosHC) {
				maisvotadosHA++;
				System.out.println("O mais votado entre os Homens foi o candidato A com " + maisvotadosHA + " votos");
			}
			if (maisvotadosHB > maisvotadosHA && maisvotadosHB > maisvotadosHC) {
				maisvotadosHB++;
				System.out.println("O mais votado entre os Homens foi o candidato B com " + maisvotadosHB + " votos");

			}
			if (maisvotadosHC > maisvotadosHA && maisvotadosHC > maisvotadosHB) {
				maisvotadosHC++;
				System.out.println("O mais votado entre os Homens foi o candidato C com " + maisvotadosHC + " votos");

			}
			
			if (escolha.equalsIgnoreCase("N")) {
				System.out.println("\n\t [FIM]\n ");
				
			}
		}
	}
}

/*
 String candidato, op = "N";
		int idade, sexo, contA = 0, contB = 0, contC = 0;
		int contHomemA = 0, contHomemB = 0, contHomemC = 0; 
		float somaA = 0, somaB = 0, somaC = 0, mediaIdade;
		Scanner leia = new Scanner(System.in);
		
		while (!op.equalsIgnoreCase("S")) {
			System.out.print("Digite o candidato escolhido pelo eleitor (A, B ou C)....: ");
			candidato = leia.next();
			System.out.print("Digite o sexo do eleitor (1 = Masculino ou 2 = Feminino).: ");
			sexo = leia.nextInt();
			System.out.print("Digite a idade do eleitor................................: ");
			idade = leia.nextInt();
			
			if (candidato.equalsIgnoreCase("A")) {
				contA++;
				somaA = somaA + idade;
				if (sexo == 1) {
					contHomemA++;
				}
			}
			else if (candidato.equalsIgnoreCase("B")) {
				contB++;
				somaB = somaB + idade;
				if (sexo == 1) {
					contHomemB++;
				}
			}
			else if (candidato.equalsIgnoreCase("C")) {
				contC++;
				somaC = somaC + idade;
				if (sexo == 1) {
					contHomemC++;
				}
			}

			
			System.out.println("Deseja sair do programa? S = Sim ou N = N�o: ");
			op = leia.next();
		}
		
		System.out.println("A = " + contA + " voto(s)\tB = " + contB + " voto(s)\tC = " + contC + " voto(s)");
		
		if ((contA > contB) && (contA > contC)) {
			System.out.println("O candidato A foi o mais votado");
			mediaIdade = somaA / contA;
		}
		else if ((contB > contA) && (contB > contC)) {
			System.out.println("O candidato B foi o mais votado");
			mediaIdade = somaB / contB;
		}
		else {
			System.out.println("O candidato C foi o mais votado");
			mediaIdade = somaC / contC;
		}

		System.out.println("A m�dia de idade do candidato mais votado = " + mediaIdade);

		if ((contHomemA > contHomemB) && (contHomemA > contHomemC)) {
			System.out.println("O candidato preferido dos Homens � o candidato A");
		}
		else if ((contHomemB > contHomemA) && (contHomemB > contHomemC)) {
			System.out.println("O candidato preferido dos Homens � o candidato B");
		}
		else {
			System.out.println("O candidato preferido dos Homens � o candidato C");
		}
	}
 */
