package Java_02_PrimitiveDataTypes;

public class Data_02_DataTypes {

	public static void main(String[] args) {
		
      /*
         byte 8-bit 
         short 16-bit 
         int 32-bit 
         long 64-bit 
         float 32-bit  
         double 64-bit  
         char 16-bit 
       */

		//Char
		
		char myChar = 'u';
		char myChar2 = '5';
		char myChar3 = 65; //myChar == "A"
		
		char tab = '\t';
		char backspace = '\b';
		char newline = '\n';
		char carriageReturn = '\r';
		char formfeed = '\f';
		char singleQuote = '\'';
		char doubleQuote = '\"'; // escaping redundant here; '"' would be the same; however still allowed char backslash = '\\';
		
		//To print lower cases
		for (int i = 0; i <= 25; i++) { 
			char letter = (char) ('a' + i); 
			System.out.println(letter);
		}
		
		//Float and Double
		
		double doubleExample = 0.5; // without 'f' after digits = double // with 'f' after digits = float
		float floatExample = 0.5f; // this is a float...
		float myFloat = 92.7f;  // this is a float...
		float positiveFloat = 89.3f; // it can be positive,
		float negativeFloat = -89.3f; // or negative
		float integerFloat = 43.0f; // it can be a whole number (not an int)
		float underZeroFloat = 0.0549f; // it can be a fractional value less than 0
		
		//int
		int example = -42; 
		int myInt = 284;
		int anotherInt = 73;
		int addedInts = myInt + anotherInt; // 284 + 73 = 357
		int subtractedInts = myInt - anotherInt; // 284 - 73 = 211
		
		//Double
		
		double example1 = -7162.37; 
		double myDouble = 974.21; 
		double anotherDouble = 658.7;
		double addedDoubles = myDouble + anotherDouble; // 315.51 
		double subtractedDoubles = myDouble - anotherDouble; // 1632.91
		double scientificNotationDouble = 1.2e-3; // 0.0012
		
		//Long
		long example3 = -42; 
		long myLong = 284; 
		long anotherLong = 73;

		//boolean
		boolean foo = true; 
		System.out.println("foo = " + foo); // foo = true
		boolean bar = false; 
		System.out.println("bar = " + bar); // bar = false
		boolean notFoo = !foo; 
		System.out.println("notFoo = " + notFoo); // notFoo = false
		boolean fooAndBar = foo && bar; 
		System.out.println("fooAndBar = " + fooAndBar); // fooAndBar = false
		boolean fooOrBar = foo || bar; 
		System.out.println("fooOrBar = " + fooOrBar); // fooOrBar = true
		boolean fooXorBar = foo ^ bar; 
		System.out.println("fooXorBar = " + fooXorBar); // fooXorBar = true
		
		//byte
		byte example4 = -36; 
		byte myByte = 96; 
		byte anotherByte = 7;
		byte addedBytes = (byte) (myByte + anotherByte); // 103
		byte subtractedBytes = (byte) (myByte - anotherByte); // 8
		
		//Short
		short example5 = -48; 
		short myShort = 987; 
		short anotherShort = 17;
		short addedShorts = (short) (myShort + anotherShort); // 1,004 
		short subtractedShorts = (short) (myShort - anotherShort); // 970
		
		
		  
	}

}
