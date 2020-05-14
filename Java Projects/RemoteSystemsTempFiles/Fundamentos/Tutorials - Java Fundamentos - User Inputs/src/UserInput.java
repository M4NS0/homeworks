import java.util.Scanner;

// Getting User Input

public class UserInput {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in); // control shift o to insert imports

		// Output the prompt
		System.out.println("Enter a line of text");

		// Wait for the user to enter the line of a text
		String line = input.nextLine();

		// Tell what they entered
		System.out.println("You entered: " + line);

		System.out.println("Enter a integer: ");
		int value = input.nextInt();

		System.out.println("You entered:" + value);

		System.out.println("Enter a integer: ");
		double value1 = input.nextDouble();

		System.out.println("You entered:" + value1);

	}

}
