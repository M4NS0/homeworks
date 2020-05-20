
public class stringBuilderBufferFormatting {
	public static void main(String[] args) {
		
		// Inneficient coding
		String info = ""; // empty string is gonna be a empty string for the rest of it's life
		
		info += "- My name is Bob";
		info += " ";
		info += "I'am a Cat!"; // is creating each time a new string called info
		
		System.out.println(info);
		
		// More  memory efficient way
		StringBuilder sb = new StringBuilder("");
		
		sb.append("- My name is Alice.");
		sb.append(" ");
		sb.append("I'm lost!");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("- My name is Bob.");
		s.append(" ");
		s.append("where u wanna go little girl?");
		
		System.out.println(s.toString());
		
		//////// Formating ////////
		
		System.out.print("\nHere is some text.\tThat was a tab.\nThats was a new line.");
		System.out.println(" More text."); // without a println will write in front of the previous text
	
		System.out.print("\nHere is some text.\tThat was a tab.\nThats was a new line.");
		System.out.println(" More text.\n"); // with println  it will write on different lines

		System.out.printf("Total cost: %d; quantity is %d\n", 5, 120); // printf will use the sintax with %d
		System.out.printf("Total cost: %10d; quantity is %d\n", 5, 120); // printf will use the sintax with %d
		System.out.printf("Total cost: %-10d; quantity is %d\n", 5, 120); // printf will use the sintax with %d
		System.out.println("\n");
		
		//////// Formating Integers ////////
		
		for (int i = 0; i<20; i++) {
			System.out.printf("Number: %5d  \n",i);	 // will be align	
			
		}
		System.out.println("\n");
		for (int i = 0; i<20; i++) {
			System.out.printf("Number: %-2d  \n",i);	 // will be align		
		}
		System.out.println("\n");
		
		//////// Formating Floating Points Values ////////
		System.out.printf("Total value: %f\n", 5.6); // %xf (x) = number of decimal places you want
		System.out.printf("Total value: %.5f\n", 5.6); 
		System.out.printf("Total value: %.4f\n", 5.6); 
		System.out.printf("Total value: %.3f\n", 5.6); 
		System.out.printf("Total value: %.2f\n", 5.6); 
		System.out.printf("Total value: %.1f\n", 5.6); 
		System.out.printf("Total value: %.0f\n", 5.6); 
	
		System.out.printf("Total value: %2.0f\n", 5.6); // %y.xf (y) = number of spaces to make alignment
		System.out.printf("Total value: %3.0f\n", 5.6); 
		System.out.printf("Total value: %4.0f\n", 5.6); 
		System.out.printf("Total value: %5.0f\n", 5.6); 
		System.out.printf("Total value: %6.0f\n", 5.6); 

	}
}
