
public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		
		car1.start(); 			// method calling
		car1.wipeWindShield();	// method calling
		car1.showInfo(); 		// method calling
		car1.stop();			// method calling
		
	}			
}
