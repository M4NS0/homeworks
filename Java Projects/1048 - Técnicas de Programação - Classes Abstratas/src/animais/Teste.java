package animais;

public class Teste {

	public static void imprimir(Animal cao, Animal vaca, Animal passaro, Animal bicho) {
		
	}


	public static void main(String[] args) {

		// Animal objAnimal 	= new Animal 	("Bicho"); nao pode ser instanciado
		// Animal objMamifero 	= new Mamifero 	("Bicho"); nao pode ser instanciado
		// Animal objPassaro 	= new Passaro 	("Bicho"); nao pode ser instanciado

		Animal cachorro = new Cachorro	("Snoopy");
		Animal vaca 	= new Vaca		("Malhada");
		Animal passaro 	= new BemteVi	("Papo Amarelo");

		System.out.println("Nome do cachorro 1: " + cachorro.getName());
		cachorro.talk();
		System.out.println();
		
		System.out.println("Nome da vaca: " + vaca.getName());
		vaca.talk();
		System.out.println();

		System.out.println("Nome do Pássaro: " + passaro.getName());
		passaro.talk();
		System.out.println();

		Cachorro cao = new Cachorro("Minduim");
		System.out.println("Nome cachorro 2: " + cao.getName());
		cao.morde();
		
		

	}
}