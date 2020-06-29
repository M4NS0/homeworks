// This script refers to chapter #13, #14, #15:
// Classes and Objects 
// Methods
// Getters and Return Values

// Class is a template for creating objects

class Person { // Person is an object of a Class
	// Instance variables ( data or "states")

	String name;
	int age;

	// Classes can contain:
	// 1. Data
	// 2. Subroutine (methods)

	void speak() {	// is a method, a behavior
					// method speak must be lower case
					// always intend after parenthesis
					
		for (int i = 0; i < 1; i++) {
			System.out.println("My name is " + name + " I'am " + age + " years old!");

		}
	}

	int calculateYearsToRetirement() { // is a method returns value (yearsLeft)
		int yearsLeft = 65 - age;

	
		return(yearsLeft);
	}
	
	int getAge() { // Is a getter method, returns value (age)
		return(age);
	}
	String getName() { // Is a getter method, returns value (name)
		return(name);
	}
}

public class ClassesObjectsMethodsGettersReturnValues { // Tutorial13_14 is a object of a Class

	public static void main(String[] args) { // This is a subroutine
		Person person1 = new Person(); // referring to Person object
		person1.name = "Bruno";
		person1.age = 39;
		person1.speak();
		person1.calculateYearsToRetirement();
		
		int years = person1.calculateYearsToRetirement();
		String name = person1.name;
		int age = person1.getAge();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println(years + " years to retirement!\n");
		
		
		
		Person person2 = new Person();
		person2.name = "Lilian";
		person2.age = 40;
		person2.speak();
		person2.calculateYearsToRetirement();
		
		int years2 = person2.calculateYearsToRetirement();
		System.out.println(years2 + "years to retirement!\n");

	}
}
