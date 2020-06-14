
public class Machine {
	
	protected String name = "Machine Type 1"; 	// using protected this method can be access by any classes or
												// even child an parent process
												// if we declare private means that only
												// appears on same "Machine" class here
												// without the private can be access to all classes in same pack
	public void start() {
		System.out.println("Machine Started.");
	}
	public void stop() {
		System.out.println("Machine Stoped.");
	}
}
