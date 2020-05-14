
public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant(); // this object referees to an object of type plant
		Tree tree = new Tree();

		// Plant plant2 = plant1; 	// this is another reference about same object
		Plant plant2 = tree;

		plant2.grow();				// plant2 is using a grow method from tree
		
		tree.shedLeaves();
			
		// plant2.shedLeaves();
		doGrow(tree);
	}
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
