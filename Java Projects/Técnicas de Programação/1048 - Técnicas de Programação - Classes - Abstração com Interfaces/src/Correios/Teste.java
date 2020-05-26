package Correios;

public class Teste {

	public static void main(String[] args) {
		
		Revista revista = new Revista("1001", "Goiânia", "São Paulo", "Revista", 05);
		revista.getRevista(revista);
		
		Carta carta = new Carta("1002", "Recife", "Alagoas", "Presente do Papai Noel");
		carta.getCarta(carta);
		
		Pacote pacote = new Pacote("1003", "Rio de Janeiro", "Porto Alegre", 10.5, "Talheres de Inox");
		pacote.getPacote(pacote);
	}

}
