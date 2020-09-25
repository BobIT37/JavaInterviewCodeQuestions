package Java_07_Strings;

public class Str_01_ComparingString {

	public static void main(String[] args) {
		
		//Strings for equality, you should use the String object's equals or equalsIgnoreCase methods.
		
		String firstString = "Test123";
		String secondString = "Test" + 123;
		
		if (firstString.equals(secondString)) {
			
		   System.out.print("Equal");
		}
		
		//Do not use the == operator to compare Strings

	}

}
