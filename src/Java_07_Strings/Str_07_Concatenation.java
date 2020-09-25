package Java_07_Strings;

public class Str_07_Concatenation {

	public static void main(String[] args) {
		
		// String concatenation can be performed using the + operator. For example:
		
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		String s = s1 + s2 + s3; // abc
		
		//StringBuilder
		
		 StringBuilder sb = new StringBuilder("a");
		 String s4 = sb.append("b").append("c").toString();
		 
		 // concat() method
		 String string1 = "Hello ";
		 String string2 = "world";
		 String string3 = string1.concat(string2); // "Hello world"
		 System.out.println(string3);

	}

}
