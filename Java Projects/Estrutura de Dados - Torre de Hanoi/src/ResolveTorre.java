/*
 ============================================================================
 Name  		: Torre de Hanoi
 Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Página		: 53
 Descrição	: Resolve o quebra-cabeça da Torre de Hanoi
 ============================================================================
 */

import java.util.Scanner;

public class ResolveTorre {
	static Scanner leia =  new Scanner(System.in);

	public static void main(String[] args) {
		Torre torre = new Torre();
		System.out.println("Insira a quantidade de Discos que a Torre de Hanoi possui: ");
		
		int n = leia.nextInt();					// Número de Discos totais
		int orig = 1;							// Posição Original dos Discos
		int dest = 3;							// Destino final dos Discos
		int aux = 2;							// Posição auxiliar 
		
		torre.MoveTorre(n, orig, dest, aux);
	}
}
