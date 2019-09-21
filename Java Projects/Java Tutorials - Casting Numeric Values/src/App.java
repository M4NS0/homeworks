
public class App {

	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 16;
		int intValue = 32;
		long longValue = 265465465;
		float floatValue = 4644.8f;
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE); // prints the maximum value of a Byte type
		
		// casting to one kind to another
		
		intValue = (int) longValue;		// long to int
		System.out.println(intValue);
		
		doubleValue = intValue;			// too big to fit into a integer type
		System.out.println(doubleValue);
		
		intValue = (int) floatValue;
		System.out.println(intValue); 	// not rounding, it just chops the end of the number
										
										// following won't work as expected
										// 128 is too big for a byte
		byteValue = (byte)128;			// you can cast a number for appropriate types
		System.out.println(byteValue); 	// will prints the minimum value
	
	}

}
