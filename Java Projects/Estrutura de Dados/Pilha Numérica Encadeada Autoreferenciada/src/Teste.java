/*
 ============================================================================
 Name  		: Pilha Numérica Encadeada/Autoreferenciada
 Livro		: Estrutura de Dados em Java
 Autores    : Luzzardi
 Página		: 62-64
 Descrição	: O programa abaixo demonstra a inclusão, exclusão
			  e consulta em uma Pilha alocada dinamicamente
 ============================================================================
*/

import java.util.Scanner;

public class Teste {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String s;
		PilhaDinamica pilha = new PilhaDinamica();
		int valor, erro = 0;
		char tecla;
		pilha.criaPilha();

		do {
			pilha.exibePilha();
			System.out.print("[P]ush, p[O]p, [C]onsultar ou [F]im?");
			do {
				s = entrada.nextLine();
				tecla = s.charAt(0);
				tecla = Character.toLowerCase(tecla);
				
			} while (tecla != 'p' && tecla != 'o' && tecla != 'c' && tecla != 'f');
			
			switch (tecla) {

			case 'p':
				System.out.print("Valor a ser Empilhado: ");
				s = entrada.nextLine();
				valor = Integer.parseInt(s);
				erro = pilha.push(valor);
				break;

			case 'o':
				erro = pilha.pop();
				break;

			case 'c':
				erro = pilha.consultaPilha();
				break;
			}
			if (erro != 0) {
				pilha.imprimeErro(erro);
			}
		} while (tecla != 'f');
		System.exit(0);
	}
}