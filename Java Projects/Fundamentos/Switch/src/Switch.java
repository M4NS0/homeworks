import java.util.Scanner;

// Switch - allows u to take different actions depending on the value of the variable 

public class Switch {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine Started");
			break;
		
		case "stop":
			System.out.println("Machine Stopped");
			break;

		default:
			System.out.println("Command not Recognized");
			
		}

	}
}
