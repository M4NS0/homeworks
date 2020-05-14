// While Loops
public class WhileLoops {

	public static void main(String[] args) {

		// different forms to make a true sentence
		boolean loop0 = true;
		boolean loop1 = 4 < 5;
		int value = 0;
		boolean loop2 = value < 20;

		System.out.println(loop0);
		System.out.println(loop1);
		System.out.println(loop2);

		while (value < 10) {
			System.out.println("Hello #" + value);
			value = value + 1;
		}

	}

}
