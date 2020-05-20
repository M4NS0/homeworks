// Encapsulating avoids private information going 
// public, making it invisible for the others

// Api and documentation:
// docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

class Plant {
	public static final int ID = 7; // this is an exposed instance
									// instance variables
	private String name; 			// always make it private if u can
	
	public String getData() {
		String data = "some stuff " + calculateGrowthForecast();
		return data;
	}
	
	public int calculateGrowthForecast () {
		return 9;
	}
	
	public String getName() {		// setters and getters was created by
		return name;				// right clicking over the line
	}								// Source > Generate Getters and Setters
									// so will add both automatically
	public void setName(String name) {
		this.name = name;
	}
							
}	

public class App {
	public static void main(String[] args) {
		
	}
}
