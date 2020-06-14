package outrosAnimais;

public class Teste {

	    public static void main(String[] args) {
	        Cachorro cao1 = new Cachorro ("Fred","Boxer");
	        Gato     cat1 = new Gato("John");
	        Animal   cao2 = new Cachorro ("Minduim", "Pinscher");
	        Animal   cat2 = new Gato("Haroldo");
	        Animal   cat4 = new Gato("Garfield");
	        Animal    et  = new Animal("Predador");
	        
	        cat1.setRaca("Viralatas");
	        System.out.println("Cachorro 1:");
	        System.out.println("Nome:" + cao1.getNome());
	        System.out.println("Raca:" + cao1.getRaca());
	        cao1.late();
	        
	        System.out.println("\nGato 1:");
	        System.out.println("Nome:" + cat1.getNome());
	        System.out.println("Raca:" + cat1.getRaca());
	        cat1.mia();
	        
	        System.out.println("Cachorro 2:");
	        System.out.println("Nome:" + cao2.getNome());
	        System.out.println("Raca:" + cao2.getRaca());
	        //cao2.late();  nao consegue porque nao pode usar os metodos das subclasses
	        
	        cat2.setRaca("Siames");
	        System.out.println("\nGato 2:");
	        System.out.println("Nome:" + cat2.getNome());
	        System.out.println("Raca:" + cat2.getRaca());
	        //cat2.mia();
	        
	        //DOWNCASTING - 1 forma de downcasting
	        if (Cachorro.class.isInstance(cao2))
	        {
	            Cachorro cao3 = Cachorro.class.cast(cao2);
	            //Cachorro cao3 = (Cachorro)cao2;
	            cao3.late();
	        }
	        
	        //DOWNCASTING - 2 forma
	        if (Gato.class.isInstance(cat2))
	        {
	            Gato cat3 = (Gato)cat2;
	            cat3.mia();
	        }
	        
	        //DOWNCASTING - 3 forma
	        Gato cat5 = (Gato)cat4;
	        cat5.mia();
	        
	        System.out.println("Gato 5 caminha? " + cat5.caminha());
	    }
	    
	}