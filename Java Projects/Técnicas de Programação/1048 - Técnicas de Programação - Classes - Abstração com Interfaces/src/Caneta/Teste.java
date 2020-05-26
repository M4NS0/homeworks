package Caneta;

import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Esferografica azul = new Esferografica("azul");
		Esferografica.escreverTexto(azul, "'Teste de escrita'");
		
		Giz verde = new Giz("verde");
		Giz.escreverTexto(verde, "'Teste de escrita'");
		
		Lapis preto = new Lapis("preto");
		Lapis.escreverTexto(preto, "'Teste de escrita'");
	}
}	
