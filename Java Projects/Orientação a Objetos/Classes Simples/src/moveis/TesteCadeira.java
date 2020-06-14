package moveis;


public class TesteCadeira {

	public static void main(String[] args) {
		
		Cadeira objCadeira1 = new Cadeira();
		Cadeira objCadeira2 = new Cadeira();
		Mesa objMesa = new Mesa();
		
		// N�o acessar diretamente um m�todo *** Errado ***
		objCadeira1.cor = "Azul";
		objCadeira1.modelo = "Confort�vel";
		objCadeira1.altura = 60;
		objCadeira1.movimentar();
		
		objCadeira2.cor = "Preta";
		objCadeira2.modelo = "Rodas";
		objCadeira2.altura = 85;

		objMesa.movimentar();
		//objMesa.valor = 50;
		objMesa.altura = 1;
		objMesa.largura = 2;
		objMesa.setNumLugares(8);
		
		System.out.println("Dados da Mesa = " 
							+ "Altura: "+ objMesa.altura + " "
							+ "Largura: " + objMesa.largura + " "
							+ "N� Lugares: " + objMesa.getNumLugares());
	}
}
