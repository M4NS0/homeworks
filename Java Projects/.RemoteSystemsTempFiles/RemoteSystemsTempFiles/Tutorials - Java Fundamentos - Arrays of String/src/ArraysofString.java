// Arrays of Strings
public class ArraysofString {
	public static void main (String [] args) {
		
		String [] words = new String[3];
		
		words[0] = "Hello"; // alocating memory
		words[1] = "to";
		words[2] = "you!";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println("\n");
		
		int value = 0; // int is a primitive type
		
		String text = null;	// this is allegating enough memory for a reference to a string
						// reference is basically an address for some memory
		String[] texts = new String [2]; // nester
		
		System.out.println(texts[0]);
		System.out.println("\n");
		
		texts[0] = "One"; 
		
	}
}





