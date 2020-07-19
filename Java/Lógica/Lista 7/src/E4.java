

import java.util.Scanner;

public class E4 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		System.out.println("");
		
		float tokio = 55000;
		float aparecida = 1500;
		float meses = 0;
		float anos;
		float porcentagemTokio = ((0.5f) / 100);
		float porcentagemAparecida = ((0.89f) /100);

		while (tokio >= aparecida) {
			tokio = (tokio + (tokio * porcentagemTokio));
			aparecida = (aparecida + (aparecida * porcentagemAparecida));
			meses ++;
			
		}
		anos = meses /12;		
		System.out.println("Aparecida alcançara tokio em: "  + anos
				+ "\nquantidade de motos em AP: " + aparecida
				+ "\nquantidade de motos em TK: " + tokio); 
			}
		

	}
/*
		float qtdeMotoAp = 1500f, qtdeMotoTokio = 55000f;
		int meses = 0, anos = 0;

		while (qtdeMotoAp < qtdeMotoTokio) {
			qtdeMotoAp = qtdeMotoAp + (qtdeMotoAp * 0.89f / 100);
			qtdeMotoTokio = qtdeMotoTokio + (qtdeMotoTokio * 0.50f / 100);
			meses++;
		}
		anos = meses / 12;
		System.out.println("Aparecida de Goiania alca�ar� T�kio em " + anos + "ano(s).");
		System.out.println("Quantidade de motos Aparecida de Goiania = " + qtdeMotoAp);
		System.out.println("Quantidade de motos T�kio                = " + qtdeMotoTokio);
		System.out.println("Motos a mais                             = " + (qtdeMotoAp - qtdeMotoTokio));
*/
