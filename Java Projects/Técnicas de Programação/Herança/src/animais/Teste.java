package animais;

public class Teste {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex", 30.0, "Boxer");
		Peixe fish = new Peixe("Neon", 0.2, "Ornamental");
		Animal cat = new Animal("Gato", 10.0);
		
		dog.imprimeCachorro();
		fish.imprimePeixe();
		cat.imprimeAnimal();
		
	}

}
