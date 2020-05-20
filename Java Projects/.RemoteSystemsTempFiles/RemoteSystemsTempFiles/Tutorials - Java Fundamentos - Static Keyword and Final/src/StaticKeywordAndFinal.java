class Thing {
	public final static int LUCKY_NUMBER = 7; // final means constant like Math.PI
	
	public String name;
	public static String description; 
	
	// static belongs, are associate on class 
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		count ++; // belongs to the class
	}
	
	public void showName() {
		System.out.println("Object id #" + id + " : " + description + ": " + name);
	}
	
	public static void ShowInfo() {
		System.out.println(description);
		// System.out.println(name); // won't work
	}
		
}

public class StaticKeywordAndFinal {
	public static void main(String[] args) {
		
		Thing.description = "Description : I'm a thing";
		
		// System.out.println(Thing.description);
		
		Thing.ShowInfo();
		
		System.out.println("Before creating object, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Alice";
		
		System.out.println(thing1.name);	
		System.out.println(thing2.name);
		
		System.out.println("After creating object, count is: " + Thing.count);

		
		thing1.showName();
		thing2.showName();
		
		// System.out.println(Math.PI);
		// Math.PI = 3; can't change!! is a constant
		
		System.out.println(Thing.LUCKY_NUMBER);
	}
}
