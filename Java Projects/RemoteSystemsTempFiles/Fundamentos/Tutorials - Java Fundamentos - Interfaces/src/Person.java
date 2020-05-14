
public class Person implements Info{
	private String name;
	
	public Person(String name) {	// right button >> Source  >>  Generate Constructors using fields
	
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there.");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: "+ name);
		
	}
}
