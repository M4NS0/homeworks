package espetaculo;

public class Teste {

	public static void main(String[] args) {
		
		CamaroteInferior inferior = new CamaroteInferior(150.0, "B52");
		inferior.imprimeValorNormal();
		inferior.imprimeCamaroteInferior();
		
		
		
		CamaroteSuperior superior = new CamaroteSuperior(200.0, 50.0, "A22");
		superior.imprimeVip();
		superior.imprimeCamaroteSuperior();
		

	}

}
