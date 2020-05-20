
class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting:
		Machine machine2 = camera1;  				// camera1 is casted or broadcasted to variable machine2
													// machine2 will call only the method inside the class Machine
		
		// Machine machine2 = new Camera(); 		// polymorphism
		machine2.start(); 							// Camera started	
		
		// machine2.snap(); 						// method snap() is undefined for the machine2
		
		// Downcasting:
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;			// camera3 will refer to every methods called by camera2
													// calling (Camera) will cast down the methods
		camera2.start();
		camera2.snap();
		
		
		Machine machine4 = new Machine();
		
		// Camera camera3 = (Camera)machine4;		// Doesn't work - run type error		
		// camera3.start();
											
	}
}
