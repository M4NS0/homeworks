
public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing...");
		super.grow();
	}	// Child class Tree
	
	public void shedLeaves() { 
		System.out.println("Leaves shedding...");
	}
}
