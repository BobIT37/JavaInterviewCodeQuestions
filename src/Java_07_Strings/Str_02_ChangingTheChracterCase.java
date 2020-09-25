package Java_07_Strings;

public class Str_02_ChangingTheChracterCase {

	public static void main(String[] args) {
		
		//toUpperCase to convert all characters to upper case
		//toLowerCase to convert all characters to lower case
		
		String string = "This is a Random String";
		
		String upper = string.toUpperCase(); 
		String lower = string.toLowerCase();
		
		System.out.println(string); // prints "This is a Random String"
		System.out.println(lower);  // prints "this is a random string"
		System.out.println(upper); // prints "THIS IS A RANDOM STRING"
		 

	}

}
