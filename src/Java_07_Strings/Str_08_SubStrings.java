package Java_07_Strings;

public class Str_08_SubStrings {

	public static void main(String[] args) {
		
		String s = "this is an example";
		String a = s.substring(11); // a will hold the string starting at character 
		                            //11 until the end ("example")
		System.out.println(a); //example
		
		String b = s.substring(5, 10); // b will hold the string starting at character 
		                               //5 and ending right before character 10 ("is an")
		
		String b1 = s.substring(5, b.length()-3); // b will hold the string starting at 
		                                         //character 5 ending right before b' s 
		                                         //lenght is out of 3 ("is an exam")

	}

}
