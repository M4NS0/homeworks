// Arrays

public class Arrays {
	public static void main(String[] args) {

		int value = 7; // creating a bucket - value type
		int[] values; // creating a label - reference type

		values = new int[3];// this is a new list of integers
							// number of integers inside the variable values is 3
							// new keyword do allocate some memory and the amount is enough to hold 3
							// integers

		System.out.println(values[0]); 	// printing the first number of the integer
										// the default values inside the arrays are always equals to zero
		System.out.println("\n");

		values[0] = 10; // setting values inside the array
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println("\n");

		for(int i = 0; i < values.length; i++) { // i is smaller than the length of the array
			System.out.println(values[i]);
			
		}
		System.out.println("\n");

		int [] numbers = {5,6,7,};
		
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.println(numbers[i]);
		}
		System.out.println("\n");

	}

}
