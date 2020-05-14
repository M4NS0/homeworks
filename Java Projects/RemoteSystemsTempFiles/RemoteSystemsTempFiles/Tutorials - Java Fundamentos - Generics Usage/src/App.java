import java.util.ArrayList;
import java.util.HashMap;

// Generic Class can work with another classes
// Specifies what type of objects to work with 


public class App {

	public static void main(String[] args) {
		
		//////////// Before Java 5 /////////////////
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String) list.get(1);
		
		System.out.println(fruit);
		
		//////////// Modern Style ////////////
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		//////////// There can be more than one type argument ////////////
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // Separated by commas
	
		
		//////////// Java 7 Style ////////////
		// ArrayList<Animal> someList = new ArrayList<>();
		
	}

}
