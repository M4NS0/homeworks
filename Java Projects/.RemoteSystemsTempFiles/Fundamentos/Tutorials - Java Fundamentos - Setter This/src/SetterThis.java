// Setter and 'this'

// encapsulating the data

class frog {
	private String name; // private will enforce the encapsulation
	private int age; // will hide this variables away

	public void setName(String name) { // a string method
		this.name = name; // this function and a set method // this means the instance 
	}
	// public void setAge(int newAge) {
	// age = newAge; // this is a setter
	// newAge is a local variable

	public void setAge(int age) { // pattern for setters
		this.age = age;
	}

	public String getName() { // Get methods
		return name;
	}

	public int getAge() { // Get methods
		return age;
	}
	public void setInfo (String name, int age) {
		setName(name);
		setAge(age);
		
	}
}

public class SetterThis {

	public static void main(String[] args) {

		frog frog1 = new frog(); // this is a created object

		// frog1.name = "Bertie"; // instance variable setted
		// frog1.age = 1; // if its private at variables declaration, this lines wouldn't work

		frog1.setName("Bertie"); // calls a method
		frog1.setAge(1);

		System.out.println("Frog" + frog1.getName() + " is " + frog1.getAge() + " years");

	}
}
