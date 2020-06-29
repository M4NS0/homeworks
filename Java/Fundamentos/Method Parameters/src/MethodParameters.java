// Method Parameters

class robot {
	String name;
	int time;

	// void speak() { // Switching for Parameters: public void speak (String text) {
	// System.out.println("Bip, Bip! I'm robot \n");
	// }

	int calculatingBips() {
		int bips = time * 5555;

		return (bips);
	}

	String getName() {
		return (name);
	}

	public void speak(String text) { // method with 1 parameter
		System.out.println(text);
	}

	public void jump(int height) { // method with 1 parameter
		System.out.println(name + " is Jumping " + height + " centimeters height");
	}

	public void move(String direction, double distance) { // method with 2 parameters
		System.out.println(name + " is moving " + distance + " meters in " + direction + " direction");
	}
}

public class MethodParameters {
	public static void main(String[] args) {
		robot robot1 = new robot();
		robot1.name = "R2D2";
		robot1.time = 24;
		robot1.speak("Bip Bip Weeeee... I'm a Robot!"); // Now the robot will speak!
		robot1.calculatingBips();
		robot1.jump(15);
		robot1.move("west", 22.2); // methods: String (directions) and int (meters) separated by commas

		String name = robot1.name;
		int time = robot1.time;
		int bips = robot1.calculatingBips();

		String greetings = "Bip, biweeee...Hello hoooman";
		robot1.speak(greetings);

		int value = 14;
		robot1.jump(value);

		System.out.println("Bip, Bip! I'm robot " + name + ". I bip at least " + bips + " times in " + time + " hours");

	}

}
