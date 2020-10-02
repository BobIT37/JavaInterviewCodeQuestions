package Java_37_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_03_Regex {

	public static void main(String[] args) {
		
		//java.util.regex.Matcher Class
		
		//Creating a Matcher instance
		String content = "Some text";
		String patternString = ".*somestring.*";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(content);
		
		//match() methods
		
		// It would return true if string matches exactly "tom"
		   System.out.println(Pattern.matches("tom", "Tom")); //False
			
		   /* returns true if the string matches exactly 
		    * "tom" or "Tom"
		    */
		   System.out.println(Pattern.matches("[Tt]om", "Tom")); //True
		   System.out.println(Pattern.matches("[Tt]om", "Tom")); //True
			
		   /* Returns true if the string matches exactly "tim" 
		    * or "Tim" or "jin" or "Jin"
		    */
		   System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim"));//True
		   System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin"));//True
			
		   /* returns true if the string contains "abc" at 
		    * any place
		    */
		   System.out.println(Pattern.matches(".*abc.*", "deabcpq"));//True
			
		   /* returns true if the string does not have a 
		    * number at the beginning
		    */
		   System.out.println(Pattern.matches("^[^\\d].*", "123abc")); //False
		   System.out.println(Pattern.matches("^[^\\d].*", "abc123")); //True
			
		   // returns true if the string contains of three letters
		   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));//True
		   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));//True
		   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));//False
			
		   // returns true if the string contains 0 or more non-digits
		   System.out.println(Pattern.matches("\\D*", "abcde")); //True
		   System.out.println(Pattern.matches("\\D*", "abcde123")); //False
			
		   /* Boundary Matchers example
		    * ^ denotes start of the line
		    * $ denotes end of the line
		    */
		   System.out.println(Pattern.matches("^This$", "This is Chaitanya")); //False
		   System.out.println(Pattern.matches("^This$", "This")); //True
		   System.out.println(Pattern.matches("^This$", "Is This Chaitanya")); //False

	}

}
