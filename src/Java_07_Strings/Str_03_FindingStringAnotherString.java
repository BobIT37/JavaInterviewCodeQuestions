package Java_07_Strings;

public class Str_03_FindingStringAnotherString {

	public static void main(String[] args) {
		
	//To check whether a particular String a is being contained 
	//in a String b or not, we can use the method String.contains() 
		
		String str1 = "Hello World";
		String str2 = "Hello";
		String str3 = "helLO";
 
		System.out.println(str1.contains(str2)); //prints true
		System.out.println(str1.contains(str3)); //prints false

	}

}
