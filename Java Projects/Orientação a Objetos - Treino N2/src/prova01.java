
public class prova01 {
	static int f(String s) {

		try {

			return Integer.parseInt(s);
		}

		catch (NumberFormatException e) {

			return 0;
		} finally {
			return -1;
		}
	}

	public static void main(String[] args) {
		int a = f ("2");
		int b = f("x");
		
		System.out.println(a + ", " + b);
	}
}
