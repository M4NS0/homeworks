// Multi-Dimensional Arrays

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int [] values = {3,5,1234}; // One dimensional array that specifies the position in one of the items
		System.out.println(values[2]);
		
		int [] [] grid = { 	// Two dimensional array, an array of arrays
							// each element of the array will be another array
				{3,5,2343},
				{2,4},  // number 4 is referenced as above
				{1,2,3,4}
		};
		
		System.out.println(grid [1] [1]);  	// first nested number refers to the second row of the array
											// the second nested number refers to the position of the arrayed number
		
		String [] [] texts = new String [2] [3]; // two rows and 3 columns
		
		texts [0] [1] = "This is the value of the 1st string of the 2nd row!";
		System.out.println(texts[0][1]);
		
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column ++ ) {
				System.out.println(grid[row][column] + "\t");
				
			}
			System.out.println();
		}
		String [][] words = new String[2][];
		System.out.println(words[0]);
		
		words [0] = new String [3];
		
		words [0] [1] = "hi there!";
		
		System.out.println(words[0][1]);
	}

}
