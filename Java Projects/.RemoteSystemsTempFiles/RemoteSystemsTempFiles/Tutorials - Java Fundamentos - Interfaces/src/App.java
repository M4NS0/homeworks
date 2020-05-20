
public class App {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo(); 		// output Machine ID: 7
	
		Info info2 = person1; 	// output Person name is: Bob
		info2.showInfo();
	
		System.out.println();
		
		outputInfo (mach1);		// output Machine ID: 7
		outputInfo (person1);	// output Person name is: Bob
	}
	
	private static void outputInfo (Info info) {
		info.showInfo();
		
	}
}
