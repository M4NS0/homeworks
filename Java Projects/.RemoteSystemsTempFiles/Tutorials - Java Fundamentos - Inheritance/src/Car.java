
public class Car extends Machine {  // Machine is a parent of Car and
									// Car is a child processes
									// Car is Identical to Machine now
									// Can use same method: start(); stop(); etc.
									// when start method called, the car will starts too
									// This is override the main method
	
	@Override 						// You can override here too 	
	public void start() {  	
	System.out.println("Car Started.");
	
	}
	
	/*
	 
	@Override
	public void start() {  			// this can be create pressing right button (mouse)
		super.start();				// over this line  >> Source >> Override/Implement Methods
	}
	*/
	
	public void wipeWindShield() {
		System.out.println("Wiping Windshield...");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
	
}
