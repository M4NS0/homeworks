// If Statements

public class IfStatements {

	public static void main(String[] args) { // [] means array

		// boolean cond = 1 < 6; true sentence
		// boolean cond = 3 > 8; false sentence
		// boolean cond = 5 != 2; true sentence
		// boolean cond = 4 == 3; false sentence

		int myInt = 15;

		if (myInt < 10) {
			System.out.println("Yes it's True");

		} else if (myInt > 20) {
			System.out.println("No, it's false!");

		} else {
			System.out.println("None of the above");
		}

		int loop = 0;

		while (true) {
			System.out.println("Looping: " + loop);

			if (loop == 5) {
				break;
			}
			loop ++;
			System.out.println("Running");
		}

	}

}
